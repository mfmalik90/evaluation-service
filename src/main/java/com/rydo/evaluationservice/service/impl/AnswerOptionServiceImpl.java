package com.rydo.evaluationservice.service.impl;

import com.rydo.evaluationservice.exception.ResourceNotFoundException;
import com.rydo.evaluationservice.model.AnswerOption;
import com.rydo.evaluationservice.repository.AnswerOptionRepository;
import com.rydo.evaluationservice.service.AnswerOptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Service
public class AnswerOptionServiceImpl implements AnswerOptionService {

    @Autowired
    AnswerOptionRepository answerOptionRepository;

    @Override
    public List<AnswerOption> getAllAnswerOption() {
        return answerOptionRepository.findAll();
    }

    @Override
    public AnswerOption createAnswerOption(AnswerOption answerOption) {
        return answerOptionRepository.save(answerOption);
    }

    @Override
    public AnswerOption getAnswerOptionById(Long answerOptionId) {
        return answerOptionRepository.findById(answerOptionId)
                .orElseThrow(() -> new ResourceNotFoundException("AnswerOption", "id", answerOptionId));
    }

    @Override
    public AnswerOption updateAnswerOption(Long answerOptionId, AnswerOption answerOptionDetails) {

        AnswerOption answerOption = answerOptionRepository.findById(answerOptionId)
                .orElseThrow(() -> new ResourceNotFoundException("AnswerOption", "id", answerOptionId));

        answerOption.setIsCorrect(answerOptionDetails.getIsCorrect());
        AnswerOption updatedAnswerOption = answerOptionRepository.save(answerOption);
        return updatedAnswerOption;
    }
}
