package com.rydo.evaluationservice.facade;

import com.rydo.evaluationservice.model.Question;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public interface QuestionFacade {
    List<Question> getAllQuestion();
    Question createQuestion(Question question);
    Question getQuestionById(Long questionId);
    Question updateQuestion(Long questionId, Question questionDetails);
}
