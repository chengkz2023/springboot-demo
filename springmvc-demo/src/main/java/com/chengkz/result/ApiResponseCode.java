package com.chengkz.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: ApiResponseCode
 * Package: com.chengkz.result
 * Description:
 * Author 啊吧泽
 * Create 2023/12/23 15:46
 * Version 1.0
 */
@Getter
@AllArgsConstructor
public enum ApiResponseCode {
    SUCCESS(200, "成功"),
    FAIL(500, "失败"),
    BAD_REQUEST(400, "请求参数有误"),
    UNAUTHORIZED(401, "未授权"),
    FORBIDDEN(403, "禁止访问"),
    NOT_FOUND(404, "资源不存在"),
    INTERNAL_SERVER_ERROR(500, "服务器内部错误");

    private static final List<ApiResponseCode> HTTP_STATUS_ALL = Collections.unmodifiableList(
            Arrays.asList(SUCCESS,FAIL,BAD_REQUEST,UNAUTHORIZED,FORBIDDEN,NOT_FOUND,INTERNAL_SERVER_ERROR)
    );

    private final int code;
    private final String message;

}
