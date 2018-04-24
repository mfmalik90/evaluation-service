package com.rydo.evaluationservice.facade.impl;

import com.rydo.evaluationservice.facade.AnswerOptionFacade;
import com.rydo.evaluationservice.model.AnswerOption;
import com.rydo.evaluationservice.service.AnswerOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Component
public class AnswerOptionFacadeImpl implements AnswerOptionFacade {

    @Autowired
    AnswerOptionService answerOptionService;

    @Override
    public List<AnswerOption> getAllAnswerOption() {
        return answerOptionService.getAllAnswerOption();
    }

    @Override
    public AnswerOption createAnswerOption(AnswerOption answerOption) {
        return answerOptionService.createAnswerOption(answerOption);
    }

    @Override
    public AnswerOption getAnswerOptionById(Long answerOptionId) {
        return answerOptionService.getAnswerOptionById(answerOptionId);
    }

    @Override
    public AnswerOption updateAnswerOption(Long answerOptionId, AnswerOption answerOptionDetails) {
        return answerOptionService.updateAnswerOption(answerOptionId, answerOptionDetails);
    }
}
