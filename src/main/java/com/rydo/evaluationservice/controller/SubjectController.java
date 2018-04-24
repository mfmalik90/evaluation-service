package com.rydo.evaluationservice.controller;

import com.rydo.evaluationservice.facade.SubjectFacade;
import com.rydo.evaluationservice.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    SubjectFacade subjectFacade;

    // Get All Subject
    @GetMapping("/")
    public List<Subject> getAllChapter() {
        return subjectFacade.getAllSubject();
    }

    // Create a new Subject
    @PostMapping("/")
    public Subject createSubject(@Valid @RequestBody Subject subject) {
        return subjectFacade.createSubject(subject);
    }

    // Get a Single Subject
    @GetMapping("/{id}")
    public Subject getSubjectById(@PathVariable(value = "id") Long subjectId) {
        return subjectFacade.getSubjectById(subjectId);
    }

    // Update a Subject
    @PutMapping("/{id}")
    public Subject updateSubject(@PathVariable(value = "id") Long subjectId,
                                   @Valid @RequestBody Subject subjectDetails) {

        return subjectFacade.updateSubject(subjectId, subjectDetails);
    }
}
