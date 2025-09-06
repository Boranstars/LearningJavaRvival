package com.boranstars.exception;

/**
 * 运行时异常，继承自runtime exception,运行时处理
 */
public class BoranstarsFooBarRuntimeException extends RuntimeException {
    public BoranstarsFooBarRuntimeException(String message) {
        super(message);
    }
}
