package com.rydo.evaluationservice.facade.impl;

import com.rydo.evaluationservice.facade.ChapterFacade;
import com.rydo.evaluationservice.model.Chapter;
import com.rydo.evaluationservice.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Component
public class ChapterFacadeImpl implements ChapterFacade {

    @Autowired
    ChapterService chapterService;

    @Override
    public List<Chapter> getAllChapter() {
        return chapterService.getAllChapter();
    }

    @Override
    public Chapter createChapter(Chapter chapter) {
        return chapterService.createChapter(chapter);
    }

    @Override
    public Chapter getChapterById(Long chapterId) {
        return chapterService.getChapterById(chapterId);
    }

    @Override
    public Chapter updateChapter(Long chapterId, Chapter chapterDetails) {
        return chapterService.updateChapter(chapterId, chapterDetails);
    }
}
