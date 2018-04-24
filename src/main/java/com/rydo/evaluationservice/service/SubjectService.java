package com.rydo.evaluationservice.service;

import com.rydo.evaluationservice.model.Question;
import com.rydo.evaluationservice.model.Subject;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public interface SubjectService {
    List<Subject> getAllSubject();
    Subject createSubject(Subject subject);
    Subject getSubjectById(Long subjectId);
    Subject updateSubject(Long subjectId, Subject subjectDetails);
}
