package com.rydo.evaluationservice.facade;

import com.rydo.evaluationservice.model.Subject;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public interface SubjectFacade {
    List<Subject> getAllSubject();
    Subject createSubject(Subject subject);
    Subject getSubjectById(Long subjectId);
    Subject updateSubject(Long subjectId, Subject subjectDetails);
}
