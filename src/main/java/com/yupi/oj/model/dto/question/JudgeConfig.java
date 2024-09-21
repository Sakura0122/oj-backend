package com.yupi.oj.model.dto.question;

import lombok.Data;

/**
 * @author: sakura
 * @date: 2024/9/21 15:43
 * @description: 题目配置
 */
@Data
public class JudgeConfig {
    /**
     * 时间限制（ms）
     */
    private Long timeLimit;

    /**
     * 内存限制（KB）
     */
    private Long memoryLimit;

    /**
     * 堆栈限制（KB）
     */
    private Long stackLimit;
}
