package com.shiqla.common.exception;

/**
 * Desc
 * Auth c5285333
 * Date 2020-05-15
 */
public enum BizcodeEnume
{
    UNKNOW_EXCEPTION(10000,"系统未知异常"),
    VAIL_EXCEPTION(10001,"参数格式错误");

    private int code;
    private String message;

    BizcodeEnume (int code, String message)
    {
        this.code = code;
        this.message = message;
    }

    public int getCode ()
    {
        return code;
    }

    public String getMessage ()
    {
        return message;
    }
}
