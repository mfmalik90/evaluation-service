package com.rydo.evaluationservice.service;

import com.rydo.evaluationservice.model.AnswerOption;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public interface AnswerOptionService {
    List<AnswerOption> getAllAnswerOption();
    AnswerOption createAnswerOption(AnswerOption answerOption);
    AnswerOption getAnswerOptionById(Long answerOptionId);
    AnswerOption updateAnswerOption(Long answerOptionId, AnswerOption answerOptionDetails);
}
