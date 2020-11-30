package com.zccpro.boot.common.exception;

import com.zccpro.boot.common.enums.ResultCodeEnum;
import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName: SystemException
 * @Description: 系统处理异常
 * @author GitEgg
 * @date
 */
@Getter
public class SystemException extends RuntimeException {

    private int code;

    private String msg;

    public SystemException() {
        this.code = ResultCodeEnum.ERROR.code;
        this.msg = ResultCodeEnum.ERROR.msg;
    }

    public SystemException(String message) {
        this.code = ResultCodeEnum.ERROR.code;
        this.msg = message;
    }

    public SystemException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public SystemException(Throwable cause) {
        super(cause);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }

}