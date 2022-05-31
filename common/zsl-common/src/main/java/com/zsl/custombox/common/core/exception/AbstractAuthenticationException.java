package com.zsl.custombox.common.core.exception;

import com.zsl.custombox.common.core.exception.CustomException;

/**
 * 用于异常处理捕捉
 *
 * @Author zsl
 * @Date 2022/5/22 20:29
 * @Email 249269610@qq.com
 */
public abstract class AbstractAuthenticationException extends CustomException {
    public AbstractAuthenticationException() {
    }

    public AbstractAuthenticationException(String msg) {
        super(msg);
    }
}
