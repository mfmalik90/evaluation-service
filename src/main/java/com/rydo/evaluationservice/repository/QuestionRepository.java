package com.rydo.evaluationservice.repository;

import com.rydo.evaluationservice.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}
