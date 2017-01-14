package com.ltx.exception;

/**
 * 秒杀相关的所有业务异常
 * Created by Rain on 2017/1/14.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
