package com.rydo.evaluationservice.facade.impl;

import com.rydo.evaluationservice.facade.SubjectFacade;
import com.rydo.evaluationservice.model.Subject;
import com.rydo.evaluationservice.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Component
public class SubjectFacadeImpl implements SubjectFacade {

    @Autowired
    SubjectService subjectService;

    @Override
    public List<Subject> getAllSubject() {
        return subjectService.getAllSubject();
    }

    @Override
    public Subject createSubject(Subject subject) {
        return subjectService.createSubject(subject);
    }

    @Override
    public Subject getSubjectById(Long subjectId) {
        return subjectService.getSubjectById(subjectId);
    }

    @Override
    public Subject updateSubject(Long subjectId, Subject subjectDetails) {
        return subjectService.updateSubject(subjectId, subjectDetails);
    }
}
