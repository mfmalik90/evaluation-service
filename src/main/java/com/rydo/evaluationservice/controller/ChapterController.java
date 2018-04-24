package com.rydo.evaluationservice.controller;

import com.rydo.evaluationservice.facade.ChapterFacade;
import com.rydo.evaluationservice.model.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@RestController
@RequestMapping("/chapters")
public class ChapterController {

    @Autowired
    ChapterFacade chapterFacade;

    // Get All chapters
    @GetMapping("/")
    public List<Chapter> getAllChapter() {
        return chapterFacade.getAllChapter();
    }

    // Create a new chapter
    @PostMapping("/")
    public Chapter createChapter(@Valid @RequestBody Chapter chapter) {
        return chapterFacade.createChapter(chapter);
    }

    // Get a Single Chapter
    @GetMapping("/{id}")
    public Chapter getChapterById(@PathVariable(value = "id") Long chapterId) {
        return chapterFacade.getChapterById(chapterId);
    }

    // Update a Chapter
    @PutMapping("/{id}")
    public Chapter updateChapter(@PathVariable(value = "id") Long chapterId,
                                   @Valid @RequestBody Chapter chapterDetails) {

        return chapterFacade.updateChapter(chapterId, chapterDetails);
    }
}
