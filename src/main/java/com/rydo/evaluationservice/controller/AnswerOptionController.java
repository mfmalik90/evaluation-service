package com.rydo.evaluationservice.controller;

import com.rydo.evaluationservice.facade.AnswerOptionFacade;
import com.rydo.evaluationservice.model.AnswerOption;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@RestController
@RequestMapping("/answers")
public class AnswerOptionController {

    @Autowired
    AnswerOptionFacade answerOptionFacade;

    // Get All answer options
    @GetMapping("/")
    public List<AnswerOption> getAllAnswerOptions() {
        return answerOptionFacade.getAllAnswerOption();
    }

    // Create a new answer option
    @PostMapping("/")
    public AnswerOption createAnswerOption(@Valid @RequestBody AnswerOption answerOption) {
        return answerOptionFacade.createAnswerOption(answerOption);
    }

    // Get a Single answer option
    @GetMapping("/{id}")
    public AnswerOption getAnswerOptionById(@PathVariable(value = "id") Long answerOptionId) {
        return answerOptionFacade.getAnswerOptionById(answerOptionId);
    }

    // Update a answer option
    @PutMapping("/{id}")
    public AnswerOption updateAnswerOption(@PathVariable(value = "id") Long answerOptionId,
                                   @Valid @RequestBody AnswerOption answerOptionDetails) {

        return answerOptionFacade.updateAnswerOption(answerOptionId, answerOptionDetails);
    }
}

