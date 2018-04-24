package com.rydo.evaluationservice.service.impl;

import com.rydo.evaluationservice.exception.ResourceNotFoundException;
import com.rydo.evaluationservice.model.Chapter;
import com.rydo.evaluationservice.repository.ChapterRepository;
import com.rydo.evaluationservice.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Service
public class ChapterServiceImpl implements ChapterService {

    @Autowired
    ChapterRepository chapterRepository;

    @Override
    public List<Chapter> getAllChapter() {
        return chapterRepository.findAll();
    }

    @Override
    public Chapter createChapter(Chapter chapter) {
        return chapterRepository.save(chapter);
    }

    @Override
    public Chapter getChapterById(Long chapterId) {

        return chapterRepository.findById(chapterId)
                .orElseThrow(() -> new ResourceNotFoundException("Chapter", "id", chapterId));
    }

    @Override
    public Chapter updateChapter(Long chapterId, Chapter chapterDetails) {

        Chapter chapter = chapterRepository.findById(chapterId)
                .orElseThrow(() -> new ResourceNotFoundException("Chapter", "id", chapterId));

        chapter.setName(chapterDetails.getName());
        Chapter updatedChapter = chapterRepository.save(chapter);
        return updatedChapter;
    }
}
