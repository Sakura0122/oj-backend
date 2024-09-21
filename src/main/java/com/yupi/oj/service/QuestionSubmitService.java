package com.yupi.oj.service;

import com.yupi.oj.model.dto.questionSubmit.QuestionSubmitAddRequest;
import com.yupi.oj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author sakura
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-09-21 14:54:27
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     * @param questionSubmitAddRequest
     * @param userId
     * @return
     */
    Long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, long userId);
}
