package com.zkr.demo.commons.entity;

import com.zkr.demo.commons.constant.ReturnCode;
import lombok.Getter;

@Getter
public class ServiceException extends  RuntimeException {
    private int code;

    public ServiceException(int code, String message) {
        super(message);
        this.code = code;
    }

    public ServiceException(ReturnCode returnCode) {
        super(returnCode.getMessage());
        this.code = returnCode.getCode();
    }
}