package com.yupi.oj.utils;

import com.yupi.oj.common.ErrorCode;
import com.yupi.oj.exception.BusinessException;
import org.apache.commons.lang3.StringUtils;

/**
 * @author: sakura
 * @date: 2024/9/21 16:23
 * @description: 校验字段
 */
public class ValidationUtils {
    /**
     * 校验字符串是否为空或超过最大长度。
     *
     * @param str 待校验的字符串
     * @param maxLength 最大允许长度
     * @param errorMessage 错误信息
     * @throws BusinessException 如果字符串非空且超过最大长度则抛出异常
     */
    public static void validateStringMaxLength(String str, int maxLength, String errorMessage) throws BusinessException {
        if (StringUtils.isNotBlank(str) && str.length() > maxLength) {
            throw new BusinessException(ErrorCode.PARAMS_ERROR, errorMessage);
        }
    }
}
