package com.rydo.evaluationservice.controller;

import com.rydo.evaluationservice.facade.ChapterTopicFacade;
import com.rydo.evaluationservice.model.ChapterTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@RestController
@RequestMapping("/chapterTopics")
public class ChapterTopicController {

    @Autowired
    ChapterTopicFacade chapterTopicFacade;

    // Get All ChapterTopic
    @GetMapping("/")
    public List<ChapterTopic> getAllChapterTopic() {
        return chapterTopicFacade.getAllChapterTopic();
    }

    // Create a new ChapterTopic
    @PostMapping("/")
    public ChapterTopic createChapterTopic(@Valid @RequestBody ChapterTopic chapterTopic) {
        return chapterTopicFacade.createChapterTopic(chapterTopic);
    }

    // Get a Single ChapterTopic
    @GetMapping("/{id}")
    public ChapterTopic getChapterTopicById(@PathVariable(value = "id") Long chapterTopicId) {
        return chapterTopicFacade.getChapterTopicById(chapterTopicId);
    }

    // Update a ChapterTopic
    @PutMapping("/{id}")
    public ChapterTopic updateChapterTopic(@PathVariable(value = "id") Long chapterTopicId,
                                   @Valid @RequestBody ChapterTopic chapterTopicDetails) {

        return chapterTopicFacade.updateChapterTopic(chapterTopicId, chapterTopicDetails);
    }
}
