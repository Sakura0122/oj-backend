package com.yupi.oj.model.dto.questionSubmit;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: sakura
 * @date: 2024/9/21 16:52
 * @description:
 */
@Data
public class QuestionSubmitAddRequest implements Serializable {

    /**
     * 题目 id
     */
    private Long questionId;

    /**
     * 编程语言
     */
    private String language;

    /**
     * 用户代码
     */
    private String code;

    private static final long serialVersionUID = 1L;
}
