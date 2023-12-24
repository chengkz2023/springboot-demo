package com.chengkz.execptionhandler;

import com.chengkz.result.ApiResponse;
import com.chengkz.result.ApiResponseCode;
import jakarta.validation.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * ClassName: GlobalExceptionHandler
 * Package: com.chengkz.execptionhandler
 * Description:
 * Author 啊吧泽
 * Create 2023/12/24 17:11
 * Version 1.0
 */
@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    @ExceptionHandler(value = {BindException.class, ValidationException.class, MethodArgumentNotValidException.class})
    public ApiResponse<ApiResponseCode> handleParameterVerificationException(Exception e){
        log.error(e.getMessage());
        return ApiResponse.failure(ApiResponseCode.BAD_REQUEST);
    }
}
