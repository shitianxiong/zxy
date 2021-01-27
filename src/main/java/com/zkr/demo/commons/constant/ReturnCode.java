package com.zkr.demo.commons.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReturnCode {
    SUCCESS(0, "OK"),
    FAILED(-1, "Failed");

    private final int code;
    private final String message;
}