package com.boranstars.exception;

/**
 * 编译时异常，继承自exception,编译时需要处理
 */
public class BoranstarsFooBarException extends Exception{
    public BoranstarsFooBarException(String message) {
        super(message);
    }
}
