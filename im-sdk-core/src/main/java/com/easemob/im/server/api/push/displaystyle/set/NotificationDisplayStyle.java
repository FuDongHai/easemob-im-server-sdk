package com.easemob.im.server.api.push.displaystyle.set;

import com.easemob.im.server.api.Context;

import com.easemob.im.server.api.DefaultErrorMapper;
import com.easemob.im.server.api.ErrorMapper;
import com.easemob.im.server.exception.EMUnknownException;
import reactor.core.publisher.Mono;

public class NotificationDisplayStyle {
    private Context context;

    public NotificationDisplayStyle(Context context) {
        this.context = context;
    }

    public Mono<Void> set(String username, String style) {
        return this.context.getHttpClient()
                .flatMap(httpClient -> httpClient.put()
                        .uri(String.format("/users/%s", username))
                        .send(Mono.create(sink -> sink.success(this.context.getCodec()
                                .encode(new NotificationDisplayStyleRequest(style)))))
                        .responseSingle((rsp, buf) -> {
                            return buf.switchIfEmpty(
                                            Mono.error(new EMUnknownException("response is null")))
                                    .flatMap(byteBuf -> {
                                        ErrorMapper mapper = new DefaultErrorMapper();
                                        mapper.statusCode(rsp);
                                        mapper.checkError(byteBuf);
                                        return Mono.just(byteBuf);
                                    });
                        }))
                .then();
    }
}