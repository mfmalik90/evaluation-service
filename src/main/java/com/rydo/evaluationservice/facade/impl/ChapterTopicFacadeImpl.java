package com.rydo.evaluationservice.facade.impl;

import com.rydo.evaluationservice.facade.ChapterTopicFacade;
import com.rydo.evaluationservice.model.ChapterTopic;
import com.rydo.evaluationservice.service.ChapterTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Component
public class ChapterTopicFacadeImpl implements ChapterTopicFacade {

    @Autowired
    ChapterTopicService chapterTopicService;

    @Override
    public List<ChapterTopic> getAllChapterTopic() {
        return chapterTopicService.getAllChapterTopic();
    }

    @Override
    public ChapterTopic createChapterTopic(ChapterTopic chapterTopic) {
        return chapterTopicService.createChapterTopic(chapterTopic);
    }

    @Override
    public ChapterTopic getChapterTopicById(Long chapterTopicId) {
        return chapterTopicService.getChapterTopicById(chapterTopicId);
    }

    @Override
    public ChapterTopic updateChapterTopic(Long chapterTopicId, ChapterTopic chapterDetails) {
        return chapterTopicService.updateChapterTopic(chapterTopicId, chapterDetails);
    }
}
