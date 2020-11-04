package com.pupilary.base.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author takesi
 * @date 2020-07-21
 */
public class BusinessException extends RuntimeException {

    private static final long serialVersionUID = 7790272845123832877L;

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 异常码
     */
    protected int code;

    public BusinessException() {
    }

    public BusinessException(Throwable cause) {
        super(cause);
    }

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(int code, String msgFormat, Object... args) {
        super(String.format(msgFormat, args));
        this.code = code;
    }

}
