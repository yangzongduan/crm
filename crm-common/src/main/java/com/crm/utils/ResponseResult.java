package com.crm.utils;

import com.crm.enums.ExceptionEnums;

import java.util.Date;

public class ResponseResult {
    private int code;
    private String msg;
    private Long time;
    public ResponseResult(ExceptionEnums exceptionEnums){
        this.code = exceptionEnums.getCode();
        this.msg = exceptionEnums.getMsg();
        this.time = new Date().getTime();

    }
}
