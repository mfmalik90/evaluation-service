package com.rydo.evaluationservice.service.impl;

import com.rydo.evaluationservice.exception.ResourceNotFoundException;
import com.rydo.evaluationservice.model.Question;
import com.rydo.evaluationservice.repository.QuestionRepository;
import com.rydo.evaluationservice.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public List<Question> getAllQuestion() {
        return questionRepository.findAll();
    }

    @Override
    public Question createQuestion(Question question) {
        question.setCreatedAt(new Date());
        question.setUpdatedAt(new Date());
        return questionRepository.save(question);
    }

    @Override
    public Question getQuestionById(Long questionId) {
        return questionRepository.findById(questionId)
                .orElseThrow(() -> new ResourceNotFoundException("Question", "id", questionId));
    }

    @Override
    public Question updateQuestion(Long questionId, Question questionDetails) {
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new ResourceNotFoundException("Question", "id", questionId));

        question.setTitle(questionDetails.getTitle());
        Question updatedQuestion = questionRepository.save(question);
        return updatedQuestion;
    }
}
