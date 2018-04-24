package com.rydo.evaluationservice.service.impl;

import com.rydo.evaluationservice.exception.ResourceNotFoundException;
import com.rydo.evaluationservice.model.ChapterTopic;
import com.rydo.evaluationservice.repository.ChapterTopicRepository;
import com.rydo.evaluationservice.service.ChapterTopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Service
public class ChapterTopicServiceImpl implements ChapterTopicService {

    @Autowired
    ChapterTopicRepository chapterTopicRepository;

    @Override
    public List<ChapterTopic> getAllChapterTopic() {
        return chapterTopicRepository.findAll();
    }

    @Override
    public ChapterTopic createChapterTopic(ChapterTopic chapterTopic) {
        return chapterTopicRepository.save(chapterTopic);
    }

    @Override
    public ChapterTopic getChapterTopicById(Long chapterTopicId) {

        return chapterTopicRepository.findById(chapterTopicId)
                .orElseThrow(() -> new ResourceNotFoundException("ChapterTopic", "id", chapterTopicId));
    }

    @Override
    public ChapterTopic updateChapterTopic(Long chapterTopicId, ChapterTopic chapterTopicDetails) {

        ChapterTopic chapterTopic = chapterTopicRepository.findById(chapterTopicId)
                .orElseThrow(() -> new ResourceNotFoundException("ChapterTopic", "id", chapterTopicId));

        chapterTopic.setName(chapterTopicDetails.getName());
        ChapterTopic updatedChapterTopic = chapterTopicRepository.save(chapterTopic);
        return updatedChapterTopic;
    }
}
