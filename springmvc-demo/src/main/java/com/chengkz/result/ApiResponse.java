package com.chengkz.result;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * ClassName: ApiResponse
 * Package: com.chengkz.result
 * Description: 统一接口返回
 * Author 啊吧泽
 * Create 2023/12/23 15:39
 * Version 1.0
 */
@Data
@Builder
public class ApiResponse<T> implements Serializable {
    private int code;
    private String message;
    private T data;

    public static <T> ApiResponse<T> success(){
        return success(null);
    }

    public static <T> ApiResponse<T> success(T data){
        return ApiResponse.<T>builder()
                .data(data)
                .message(ApiResponseCode.SUCCESS.getMessage())
                .code(ApiResponseCode.SUCCESS.getCode())
                .build();
    }

    public static <T> ApiResponse<T> failure(T data){
        return ApiResponse.<T>builder()
                .data(data)
                .message(ApiResponseCode.FAIL.getMessage())
                .code(ApiResponseCode.FAIL.getCode())
                .build();
    }
    public static <T> ApiResponse<T> failure(T data,String message){
        return ApiResponse.<T>builder()
                .data(data)
                .message(message)
                .code(ApiResponseCode.FAIL.getCode())
                .build();
    }
    public static <T> ApiResponse<T> failure(){
        return failure(null);
    }

}
