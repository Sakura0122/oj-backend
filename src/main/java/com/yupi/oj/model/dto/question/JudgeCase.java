package com.yupi.oj.model.dto.question;

import lombok.Data;

/**
 * @author: sakura
 * @date: 2024/9/21 15:43
 * @description: 题目用例
 */
@Data
public class JudgeCase {
    /**
     * 输入用例
     */
    private String input;

    /**
     * 输出用例
     */
    private String output;
}
