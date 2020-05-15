package com.shiqla.mall.product.exception;

import com.shiqla.common.exception.BizcodeEnume;
import com.shiqla.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc
 * Auth c5285333
 * Date 2020-05-15
 */
@Slf4j
@RestControllerAdvice("basePackages=com.shiqla.mall.product.controller")
public class ShiqlaMallException
{
    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleVaildException (MethodArgumentNotValidException e)
    {
        BindingResult bindingResult = e.getBindingResult();
        Map errorMap = new HashMap();
        bindingResult.getFieldErrors().forEach((fieldError -> {
            errorMap.put(fieldError.getField(), fieldError.getDefaultMessage());
        }));
        return R.error(BizcodeEnume.VAIL_EXCEPTION.getCode(),
            BizcodeEnume.VAIL_EXCEPTION.getMessage()).put("data", errorMap);
    }

    @ExceptionHandler(value = Throwable.class)
    public R handleException (Throwable e)
    {
        return R.error(BizcodeEnume.UNKNOW_EXCEPTION.getCode(),
            BizcodeEnume.UNKNOW_EXCEPTION.getMessage());
    }
}
