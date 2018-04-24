package com.rydo.evaluationservice.service;

import com.rydo.evaluationservice.model.ChapterTopic;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public interface ChapterTopicService {
    List<ChapterTopic> getAllChapterTopic();
    ChapterTopic createChapterTopic(ChapterTopic chapterTopic);
    ChapterTopic getChapterTopicById(Long chapterTopicId);
    ChapterTopic updateChapterTopic(Long chapterTopicId, ChapterTopic chapterDetails);
}
