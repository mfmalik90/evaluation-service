package com.rydo.evaluationservice.service.impl;

import com.rydo.evaluationservice.exception.ResourceNotFoundException;
import com.rydo.evaluationservice.model.Subject;
import com.rydo.evaluationservice.repository.SubjectRepository;
import com.rydo.evaluationservice.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Service
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    SubjectRepository subjectRepository;

    @Override
    public List<Subject> getAllSubject() {
        return subjectRepository.findAll();
    }

    @Override
    public Subject createSubject(Subject subject) {
        return subjectRepository.save(subject);
    }

    @Override
    public Subject getSubjectById(Long subjectId) {

        return subjectRepository.findById(subjectId)
                .orElseThrow(() -> new ResourceNotFoundException("Subject", "id", subjectId));
    }

    @Override
    public Subject updateSubject(Long subjectId, Subject subjectDetails) {
        Subject subject = subjectRepository.findById(subjectId)
                .orElseThrow(() -> new ResourceNotFoundException("Subject", "id", subjectId));

        subject.setName(subjectDetails.getName());
        Subject updatedSubject = subjectRepository.save(subject);
        return updatedSubject;
    }
}
