package com.rydo.evaluationservice.service;

import com.rydo.evaluationservice.model.Chapter;

import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
public interface ChapterService {
    List<Chapter> getAllChapter();
    Chapter createChapter(Chapter chapter);
    Chapter getChapterById(Long chapterId);
    Chapter updateChapter(Long chapterId, Chapter chapterDetails);
}
