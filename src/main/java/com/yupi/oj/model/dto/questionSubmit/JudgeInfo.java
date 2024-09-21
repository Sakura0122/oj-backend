package com.yupi.oj.model.dto.questionSubmit;

import lombok.Data;

/**
 * @author: sakura
 * @date: 2024/9/21 15:47
 * @description: 判题信息
 */
@Data
public class JudgeInfo {
    /**
     * 程序执行信息
     */
    private String message;

    /**
     * 消耗内存
     */
    private String memory;

    /**
     * 消耗时间
     */
    private Long time;
}
