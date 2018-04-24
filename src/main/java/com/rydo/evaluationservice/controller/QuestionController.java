package com.rydo.evaluationservice.controller;

import com.rydo.evaluationservice.facade.QuestionFacade;
import com.rydo.evaluationservice.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionFacade questionFacade;

    // Get All questions
    @GetMapping("/")
    public List<Question> getAllQuestion() {
        return questionFacade.getAllQuestion();
    }

    // Create a new question
    @PostMapping("/")
    public Question createQuestion(@Valid @RequestBody Question question) {
        return questionFacade.createQuestion(question);
    }

    // Get a Single Question
    @GetMapping("/{id}")
    public Question getQuestionById(@PathVariable(value = "id") Long questionId) {
        return questionFacade.getQuestionById(questionId);
    }

    // Update a Question
    @PutMapping("/{id}")
    public Question updateQuestion(@PathVariable(value = "id") Long questionId,
                                   @Valid @RequestBody Question questionDetails) {

        return questionFacade.updateQuestion(questionId, questionDetails);
    }
}
