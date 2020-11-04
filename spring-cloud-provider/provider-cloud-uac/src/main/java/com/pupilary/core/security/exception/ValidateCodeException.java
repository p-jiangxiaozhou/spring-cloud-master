package com.pupilary.core.security.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * @author takesi
 * @date 2020-10-21
 */
public class ValidateCodeException extends AuthenticationException {

    private static final long serialVersionUID = 2169271381757696513L;

    public ValidateCodeException(String msg) {
        super(msg);
    }
}
