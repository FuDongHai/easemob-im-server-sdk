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

import com.easemob.im.ApiCallback;
import com.easemob.im.ApiClient;
import com.easemob.im.ApiException;
import com.easemob.im.ApiResponse;
import com.easemob.im.Configuration;
import com.easemob.im.Pair;
import com.easemob.im.ProgressRequestBody;
import com.easemob.im.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.easemob.im.api.model.EMUploadChatFileResult;
import java.io.File;

import java.lang.reflect.Type;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ChatFileApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ChatFileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ChatFileApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for downloadChatFile
     * @param fileUuid 服务器为文件生成的 UUID (required)
     * @param shareSecret 文件访问密钥。若上传文件时限制了访问，下载该文件时则需要该访问密钥。成功上传文件后，从 文件上传 的响应 body 中获取该密钥 (optional)
     * @param thumbnail 是否下载缩略图： true：是，下载缩略图 false：否，下载原文件 若该参数为空，下载原文件 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
        <tr><td> 5xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadChatFileCall(String fileUuid, String shareSecret, Boolean thumbnail, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/chatfiles/{file_uuid}"
            .replace("{" + "file_uuid" + "}", localVarApiClient.escapeString(fileUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (shareSecret != null) {
            localVarHeaderParams.put("share-secret", localVarApiClient.parameterToString(shareSecret));
        }

        if (thumbnail != null) {
            localVarHeaderParams.put("thumbnail", localVarApiClient.parameterToString(thumbnail));
        }

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call downloadChatFileValidateBeforeCall(String fileUuid, String shareSecret, Boolean thumbnail, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fileUuid' is set
        if (fileUuid == null) {
            throw new ApiException("Missing the required parameter 'fileUuid' when calling downloadChatFile(Async)");
        }

        return downloadChatFileCall(fileUuid, shareSecret, thumbnail, _callback);

    }

    /**
     * 下载文件/下载缩略图
     * 可利用该方法下载图片、语音、视频或其他类型的文件。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_download.html#%E4%B8%8B%E8%BD%BD%E6%96%87%E4%BB%B6
     * @param fileUuid 服务器为文件生成的 UUID (required)
     * @param shareSecret 文件访问密钥。若上传文件时限制了访问，下载该文件时则需要该访问密钥。成功上传文件后，从 文件上传 的响应 body 中获取该密钥 (optional)
     * @param thumbnail 是否下载缩略图： true：是，下载缩略图 false：否，下载原文件 若该参数为空，下载原文件 (optional)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
        <tr><td> 5xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
     </table>
     */
    public File downloadChatFile(String fileUuid, String shareSecret, Boolean thumbnail) throws ApiException {
        ApiResponse<File> localVarResp = downloadChatFileWithHttpInfo(fileUuid, shareSecret, thumbnail);
        return localVarResp.getData();
    }

    /**
     * 下载文件/下载缩略图
     * 可利用该方法下载图片、语音、视频或其他类型的文件。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_download.html#%E4%B8%8B%E8%BD%BD%E6%96%87%E4%BB%B6
     * @param fileUuid 服务器为文件生成的 UUID (required)
     * @param shareSecret 文件访问密钥。若上传文件时限制了访问，下载该文件时则需要该访问密钥。成功上传文件后，从 文件上传 的响应 body 中获取该密钥 (optional)
     * @param thumbnail 是否下载缩略图： true：是，下载缩略图 false：否，下载原文件 若该参数为空，下载原文件 (optional)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
        <tr><td> 5xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> downloadChatFileWithHttpInfo(String fileUuid, String shareSecret, Boolean thumbnail) throws ApiException {
        okhttp3.Call localVarCall = downloadChatFileValidateBeforeCall(fileUuid, shareSecret, thumbnail, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 下载文件/下载缩略图 (asynchronously)
     * 可利用该方法下载图片、语音、视频或其他类型的文件。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_download.html#%E4%B8%8B%E8%BD%BD%E6%96%87%E4%BB%B6
     * @param fileUuid 服务器为文件生成的 UUID (required)
     * @param shareSecret 文件访问密钥。若上传文件时限制了访问，下载该文件时则需要该访问密钥。成功上传文件后，从 文件上传 的响应 body 中获取该密钥 (optional)
     * @param thumbnail 是否下载缩略图： true：是，下载缩略图 false：否，下载原文件 若该参数为空，下载原文件 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
        <tr><td> 5xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call downloadChatFileAsync(String fileUuid, String shareSecret, Boolean thumbnail, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = downloadChatFileValidateBeforeCall(fileUuid, shareSecret, thumbnail, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for uploadChatFile
     * @param restrictAccess 是否限制访问该文件： - true：是。用户需要通过响应 body 中获取的文件访问密钥（share-secret）才能下载该文件 - false：否。表示不限制访问。用户可以直接下载该文件 要使用文件访问限制功能，请联系商务开通 (optional)
     * @param _file 文件本地路径 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
        <tr><td> 5xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadChatFileCall(Boolean restrictAccess, File _file, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/chatfiles";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        if (restrictAccess != null) {
            localVarHeaderParams.put("restrict-access", localVarApiClient.parameterToString(restrictAccess));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call uploadChatFileValidateBeforeCall(Boolean restrictAccess, File _file, final ApiCallback _callback) throws ApiException {
        return uploadChatFileCall(restrictAccess, _file, _callback);

    }

    /**
     * 上传文件
     * 对于附件类型的消息，如图片、语音、视频或其他类型文件，发送消息前需上传文件。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_download.html#%E4%B8%8A%E4%BC%A0%E6%96%87%E4%BB%B6
     * @param restrictAccess 是否限制访问该文件： - true：是。用户需要通过响应 body 中获取的文件访问密钥（share-secret）才能下载该文件 - false：否。表示不限制访问。用户可以直接下载该文件 要使用文件访问限制功能，请联系商务开通 (optional)
     * @param _file 文件本地路径 (optional)
     * @return EMUploadChatFileResult
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
        <tr><td> 5xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
     </table>
     */
    public EMUploadChatFileResult uploadChatFile(Boolean restrictAccess, File _file) throws ApiException {
        ApiResponse<EMUploadChatFileResult> localVarResp = uploadChatFileWithHttpInfo(restrictAccess, _file);
        return localVarResp.getData();
    }

    /**
     * 上传文件
     * 对于附件类型的消息，如图片、语音、视频或其他类型文件，发送消息前需上传文件。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_download.html#%E4%B8%8A%E4%BC%A0%E6%96%87%E4%BB%B6
     * @param restrictAccess 是否限制访问该文件： - true：是。用户需要通过响应 body 中获取的文件访问密钥（share-secret）才能下载该文件 - false：否。表示不限制访问。用户可以直接下载该文件 要使用文件访问限制功能，请联系商务开通 (optional)
     * @param _file 文件本地路径 (optional)
     * @return ApiResponse&lt;EMUploadChatFileResult&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
        <tr><td> 5xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EMUploadChatFileResult> uploadChatFileWithHttpInfo(Boolean restrictAccess, File _file) throws ApiException {
        okhttp3.Call localVarCall = uploadChatFileValidateBeforeCall(restrictAccess, _file, null);
        Type localVarReturnType = new TypeToken<EMUploadChatFileResult>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * 上传文件 (asynchronously)
     * 对于附件类型的消息，如图片、语音、视频或其他类型文件，发送消息前需上传文件。文档介绍：https://docs-im-beta.easemob.com/document/server-side/message_download.html#%E4%B8%8A%E4%BC%A0%E6%96%87%E4%BB%B6
     * @param restrictAccess 是否限制访问该文件： - true：是。用户需要通过响应 body 中获取的文件访问密钥（share-secret）才能下载该文件 - false：否。表示不限制访问。用户可以直接下载该文件 要使用文件访问限制功能，请联系商务开通 (optional)
     * @param _file 文件本地路径 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
        <tr><td> 4xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
        <tr><td> 5xx </td><td> 错误码：https://docs-im-beta.easemob.com/document/server-side/error.html </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call uploadChatFileAsync(Boolean restrictAccess, File _file, final ApiCallback<EMUploadChatFileResult> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadChatFileValidateBeforeCall(restrictAccess, _file, _callback);
        Type localVarReturnType = new TypeToken<EMUploadChatFileResult>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}