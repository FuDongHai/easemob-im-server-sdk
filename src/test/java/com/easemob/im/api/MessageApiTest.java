/*
 * EMService
 * Easemob Rest API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.easemob.im.api;

import com.easemob.im.ApiException;
import com.easemob.im.api.model.*;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * API tests for MessageApi
 */
public class MessageApiTest extends AbstractTest {

    private final UserApi userApi = new UserApi();

    private final MessageApi messageApi = new MessageApi();

    private final GroupApi groupApi = new GroupApi();

    private final RoomApi roomApi = new RoomApi();

    public MessageApiTest() {
    }

    /**
     * 导入群聊消息
     *
     * 你可以在数据迁移时导入群聊消息。每次调用该接口只能导入一条消息。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_import.html#%E5%AF%BC%E5%85%A5%E7%BE%A4%E8%81%8A%E6%B6%88%E6%81%AF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importChatGroupMessageTest() throws ApiException {
        String username1 = randomUserName();
        String username2 = randomUserName();
        String password = "123456";

        List<EMCreateUser> emCreateUserList = new ArrayList<>();
        EMCreateUser createUser1 = new EMCreateUser();
        createUser1.setUsername(username1);
        createUser1.setPassword(password);

        EMCreateUser createUser2 = new EMCreateUser();
        createUser2.setUsername(username2);
        createUser2.setPassword(password);

        emCreateUserList.add(createUser1);
        emCreateUserList.add(createUser2);

        assertDoesNotThrow(() -> userApi.createUsers(emCreateUserList));

        EMCreateGroup createGroup = new EMCreateGroup();
        createGroup.setOwner(username1);
        createGroup.setGroupname("test-group");
        createGroup.setDescription("元梦之星");
        createGroup.setMaxusers(200);
        createGroup.setMembers(Arrays.asList(username2));
        createGroup.setPublic(true);

        EMCreateGroupResult createGroupResult =
                assertDoesNotThrow(() -> groupApi.createGroup(createGroup));
        assertNotNull(createGroupResult);
        assertNotNull(createGroupResult.getData());
        assertNotNull(createGroupResult.getData().getGroupid());

        String groupId = createGroupResult.getData().getGroupid();

        EMImportChatGroupMessage emImportChatUserMessage = new EMImportChatGroupMessage();
        emImportChatUserMessage.setFrom(username1);
        emImportChatUserMessage.setTarget(groupId);
        emImportChatUserMessage.setType("txt");
        emImportChatUserMessage.setIsAckRead(true);
        emImportChatUserMessage.setMsgTimestamp(new BigDecimal(System.currentTimeMillis()));
        emImportChatUserMessage.needDownload(false);
        emImportChatUserMessage.body(new EMMessageContent().msg("test message1"));
        EMImportChatGroupMessageResult response = messageApi.importChatGroupMessage(emImportChatUserMessage);
        assertNotNull(response.getData());
        assertNotNull(response.getData().getMsgId());

        assertDoesNotThrow(() -> userApi.deleteUser(username1));
        assertDoesNotThrow(() -> userApi.deleteUser(username2));
        try {
            groupApi.deleteGroup(groupId);
        } catch (ApiException ignored) {
        }
    }

    /**
     * 导入单聊消息
     *
     * 你可以在数据迁移时导入单聊消息。每次调用该接口只能导入一条消息。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_import.html#%E5%AF%BC%E5%85%A5%E5%8D%95%E8%81%8A%E6%B6%88%E6%81%AF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void importChatUserMessageTest() throws ApiException {
        String username1 = randomUserName();
        String username2 = randomUserName();
        String password = "123456";

        List<EMCreateUser> emCreateUserList = new ArrayList<>();
        EMCreateUser createUser1 = new EMCreateUser();
        createUser1.setUsername(username1);
        createUser1.setPassword(password);

        EMCreateUser createUser2 = new EMCreateUser();
        createUser2.setUsername(username2);
        createUser2.setPassword(password);

        emCreateUserList.add(createUser1);
        emCreateUserList.add(createUser2);

        assertDoesNotThrow(() -> userApi.createUsers(emCreateUserList));

        EMImportChatUserMessage emImportChatUserMessage = new EMImportChatUserMessage();
        emImportChatUserMessage.setFrom(username2);
        emImportChatUserMessage.setTarget(username1);
        emImportChatUserMessage.setType("txt");
        emImportChatUserMessage.setIsAckRead(true);
        emImportChatUserMessage.setMsgTimestamp(new BigDecimal(System.currentTimeMillis()));
        emImportChatUserMessage.needDownload(false);
        emImportChatUserMessage.body(new EMMessageContent().msg("test message1"));
        EMImportChatUserMessageResult response = messageApi.importChatUserMessage(emImportChatUserMessage);
        assertNotNull(response.getData());
        assertNotNull(response.getData().getMsgId());

        assertDoesNotThrow(() -> userApi.deleteUser(username1));
        assertDoesNotThrow(() -> userApi.deleteUser(username2));
    }

    /**
     * 单向删除会话
     *
     * 该方法使聊天用户能够从服务器中删除会话。删除会话后，该用户将从服务器获取不到该会话。该会话的其他参与聊天用户仍然可以从服务器获取会话内容。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_recall.html#%E5%8D%95%E5%90%91%E5%88%A0%E9%99%A4%E4%BC%9A%E8%AF%9D
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void oneWayDeleteConversationTest() throws ApiException {
        String username1 = randomUserName();
        String username2 = randomUserName();
        String password = "123456";

        List<EMCreateUser> emCreateUserList = new ArrayList<>();
        EMCreateUser createUser1 = new EMCreateUser();
        createUser1.setUsername(username1);
        createUser1.setPassword(password);

        EMCreateUser createUser2 = new EMCreateUser();
        createUser2.setUsername(username2);
        createUser2.setPassword(password);

        emCreateUserList.add(createUser1);
        emCreateUserList.add(createUser2);

        assertDoesNotThrow(() -> userApi.createUsers(emCreateUserList));

        EMCreateMessage emCreateMessage = new EMCreateMessage();
        emCreateMessage.setFrom(username1);
        emCreateMessage.setTo(new ArrayList<String>(){{add(username2);}});
        emCreateMessage.setType("txt");
        EMMessageContent messageContent = new EMMessageContent();
        messageContent.setMsg("test message");
        emCreateMessage.setBody(messageContent);

        EMSendMessageResult sendMessageResponse = messageApi.sendMessagesToUser(emCreateMessage);
        assertNotNull(sendMessageResponse.getData());

        EMOneWayDeleteConversation emOneWayDeleteConversation = new EMOneWayDeleteConversation();
        emOneWayDeleteConversation.setChannel(username2);
        emOneWayDeleteConversation.setType("chat");
        emOneWayDeleteConversation.setDeleteRoam(true);

        EMOneWayDeleteConversationResult response = messageApi.oneWayDeleteConversation(username1, emOneWayDeleteConversation);
        assertNotNull(response.getData());
        assertEquals("ok", response.getData().getResult());

        EMOneWayDeleteConversation emOneWayDeleteConversation1 = new EMOneWayDeleteConversation();
        emOneWayDeleteConversation1.setChannel(username1);
        emOneWayDeleteConversation1.setType("chat");
        emOneWayDeleteConversation1.setDeleteRoam(true);
        EMOneWayDeleteConversationResult response1 = messageApi.oneWayDeleteConversation(username2, emOneWayDeleteConversation1);
        assertNotNull(response1.getData());
        assertEquals("ok", response1.getData().getResult());

        assertDoesNotThrow(() -> userApi.deleteUser(username1));
        assertDoesNotThrow(() -> userApi.deleteUser(username2));
    }

    /**
     * 撤回消息
     *
     * 发送方可以撤回一条发送成功的消息。默认情况下，发送方可撤回发出 2 分钟内的消息。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_recall.html#%E6%92%A4%E5%9B%9E%E6%B6%88%E6%81%AF
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void recallMessageTest() throws ApiException {
        String username1 = randomUserName();
        String username2 = randomUserName();
        String password = "123456";

        List<EMCreateUser> emCreateUserList = new ArrayList<>();
        EMCreateUser createUser1 = new EMCreateUser();
        createUser1.setUsername(username1);
        createUser1.setPassword(password);

        EMCreateUser createUser2 = new EMCreateUser();
        createUser2.setUsername(username2);
        createUser2.setPassword(password);

        emCreateUserList.add(createUser1);
        emCreateUserList.add(createUser2);

        assertDoesNotThrow(() -> userApi.createUsers(emCreateUserList));

        EMCreateMessage emCreateMessage = new EMCreateMessage();
        emCreateMessage.setFrom(username1);
        emCreateMessage.setTo(new ArrayList<String>(){{add(username2);}});
        emCreateMessage.setType("txt");
        EMMessageContent messageContent = new EMMessageContent();
        messageContent.setMsg("test message");
        emCreateMessage.setBody(messageContent);

        EMSendMessageResult sendMessageResponse = messageApi.sendMessagesToUser(emCreateMessage);
        assertNotNull(sendMessageResponse.getData());
        Map<String, String> data = (Map<String, String>) sendMessageResponse.getData();
        String messageId = data.get(username2);

        EMRecallMessage emRecallMessage = new EMRecallMessage();
        emRecallMessage.setFrom(username1);
        emRecallMessage.setMsgId(messageId);
        emRecallMessage.setTo(username2);
        emRecallMessage.setChatType("chat");
        emRecallMessage.setForce(true);
        EMRecallMessageResult response = messageApi.recallMessage(emRecallMessage);
        assertNotNull(response.getData());
        assertEquals("yes", response.getData().getRecalled());

        assertDoesNotThrow(() -> userApi.deleteUser(username1));
        assertDoesNotThrow(() -> userApi.deleteUser(username2));
    }

    /**
     * 发送群聊消息
     *
     * 向群组发送消息。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_group.html
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendMessagesToGroupTest() throws ApiException {
        String username1 = randomUserName();
        String username2 = randomUserName();
        String password = "123456";

        List<EMCreateUser> emCreateUserList = new ArrayList<>();
        EMCreateUser createUser1 = new EMCreateUser();
        createUser1.setUsername(username1);
        createUser1.setPassword(password);

        EMCreateUser createUser2 = new EMCreateUser();
        createUser2.setUsername(username2);
        createUser2.setPassword(password);

        emCreateUserList.add(createUser1);
        emCreateUserList.add(createUser2);

        assertDoesNotThrow(() -> userApi.createUsers(emCreateUserList));

        EMCreateGroup createGroup = new EMCreateGroup();
        createGroup.setOwner(username1);
        createGroup.setGroupname("test-group");
        createGroup.setDescription("元梦之星");
        createGroup.setMaxusers(200);
        createGroup.setMembers(Arrays.asList(username2));
        createGroup.setPublic(true);

        EMCreateGroupResult createGroupResult =
                assertDoesNotThrow(() -> groupApi.createGroup(createGroup));
        assertNotNull(createGroupResult);
        assertNotNull(createGroupResult.getData());
        assertNotNull(createGroupResult.getData().getGroupid());

        String groupId = createGroupResult.getData().getGroupid();

        EMCreateMessage emCreateMessage = new EMCreateMessage();
        emCreateMessage.setFrom(username1);
        emCreateMessage.setTo(new ArrayList<String>(){{add(groupId);}});
        emCreateMessage.setType("txt");
        EMMessageContent messageContent = new EMMessageContent();
        messageContent.setMsg("test message");
        emCreateMessage.setBody(messageContent);

        EMSendMessageResult response = messageApi.sendMessagesToGroup(emCreateMessage);
        assertNotNull(response.getData());
        Map<String, Object> data = (Map<String, Object>) response.getData();
        System.out.println("messageId : " + data.get(groupId));

        assertDoesNotThrow(() -> userApi.deleteUser(username1));
        assertDoesNotThrow(() -> userApi.deleteUser(username2));
        try {
            groupApi.deleteGroup(groupId);
        } catch (ApiException ignored) {
        }
    }

    /**
     * 发送聊天室消息
     *
     * 向群组发送消息。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_chatroom.html
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendMessagesToRoomTest() throws ApiException {
        String username1 = randomUserName();
        String username2 = randomUserName();
        String password = "123456";

        List<EMCreateUser> emCreateUserList = new ArrayList<>();
        EMCreateUser createUser1 = new EMCreateUser();
        createUser1.setUsername(username1);
        createUser1.setPassword(password);

        EMCreateUser createUser2 = new EMCreateUser();
        createUser2.setUsername(username2);
        createUser2.setPassword(password);

        emCreateUserList.add(createUser1);
        emCreateUserList.add(createUser2);

        assertDoesNotThrow(() -> userApi.createUsers(emCreateUserList));

        EMCreateRoom createRoom = new EMCreateRoom();
        createRoom.setOwner(username1);
        createRoom.setName("test-room");
        createRoom.setDescription("元梦之星");
        createRoom.setMaxusers(200);
        createRoom.setMembers(Arrays.asList(username2));
        createRoom.setCustom("custom");

        EMCreateRoomResult createRoomResult= assertDoesNotThrow(() -> roomApi.createRoom(createRoom));
        assertNotNull(createRoomResult);
        assertNotNull(createRoomResult.getData());
        assertNotNull(createRoomResult.getData().getId());

        String roomId = createRoomResult.getData().getId();

        EMCreateMessage emCreateMessage = new EMCreateMessage();
        emCreateMessage.setFrom(username1);
        emCreateMessage.setTo(new ArrayList<String>(){{add(roomId);}});
        emCreateMessage.setType("txt");
        EMMessageContent messageContent = new EMMessageContent();
        messageContent.setMsg("test message");
        emCreateMessage.setBody(messageContent);

        EMSendMessageResult response = messageApi.sendMessagesToRoom(emCreateMessage);
        assertNotNull(response.getData());
        Map<String, Object> data = (Map<String, Object>) response.getData();
        System.out.println("messageId : " + data.get(roomId));

        assertDoesNotThrow(() -> userApi.deleteUser(username1));
        assertDoesNotThrow(() -> userApi.deleteUser(username2));
        try {
            roomApi.deleteRoom(roomId);
        } catch (ApiException ignored) {
        }
    }

    /**
     * 发送单聊消息
     *
     * 给用户发送消息。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_single.html
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void sendMessagesToUserTest() throws ApiException {
        String username1 = randomUserName();
        String username2 = randomUserName();
        String password = "123456";

        List<EMCreateUser> emCreateUserList = new ArrayList<>();
        EMCreateUser createUser1 = new EMCreateUser();
        createUser1.setUsername(username1);
        createUser1.setPassword(password);

        EMCreateUser createUser2 = new EMCreateUser();
        createUser2.setUsername(username2);
        createUser2.setPassword(password);

        emCreateUserList.add(createUser1);
        emCreateUserList.add(createUser2);

        assertDoesNotThrow(() -> userApi.createUsers(emCreateUserList));

        EMCreateMessage emCreateMessage = new EMCreateMessage();
        emCreateMessage.setFrom(username1);
        emCreateMessage.setTo(new ArrayList<String>(){{add(username2);}});
        emCreateMessage.setType("txt");
        EMMessageContent messageContent = new EMMessageContent();
        messageContent.setMsg("test message");
        emCreateMessage.setBody(messageContent);

        EMSendMessageResult response = messageApi.sendMessagesToUser(emCreateMessage);
        assertNotNull(response.getData());
        Map<String, Object> data = (Map<String, Object>)response.getData();
        System.out.println("messageId : " + data.get(username2));

        assertDoesNotThrow(() -> userApi.deleteUser(username1));
        assertDoesNotThrow(() -> userApi.deleteUser(username2));
    }

}
