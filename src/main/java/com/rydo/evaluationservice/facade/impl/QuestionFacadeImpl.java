package com.rydo.evaluationservice.facade.impl;

import com.rydo.evaluationservice.facade.QuestionFacade;
import com.rydo.evaluationservice.model.Question;
import com.rydo.evaluationservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Component
public class QuestionFacadeImpl implements QuestionFacade {

    @Autowired
    QuestionService questionService;

    @Override
    public List<Question> getAllQuestion() {
        return questionService.getAllQuestion();
    }

    @Override
    public Question createQuestion(Question question) {
        return questionService.createQuestion(question);
    }

    @Override
    public Question getQuestionById(Long questionId) {
        return questionService.getQuestionById(questionId);
    }

    @Override
    public Question updateQuestion(Long questionId, Question questionDetails) {
        return questionService.updateQuestion(questionId, questionDetails);
    }
}
