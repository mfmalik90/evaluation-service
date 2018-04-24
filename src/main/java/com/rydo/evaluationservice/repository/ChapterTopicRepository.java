package com.rydo.evaluationservice.repository;

import com.rydo.evaluationservice.model.ChapterTopic;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public interface ChapterTopicRepository extends JpaRepository<ChapterTopic, Long> {
}
