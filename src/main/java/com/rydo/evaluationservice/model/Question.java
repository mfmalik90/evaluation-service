package com.rydo.evaluationservice.model;

import com.rydo.evaluationservice.type.DifficultyLevelEnum;
import com.rydo.evaluationservice.type.StandardEnum;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Data
@Entity
@Table(name = "question")
@EntityListeners(AuditingEntityListener.class)
public class Question extends BaseEntity{

    String title;

    @NotBlank
    String problemStatement;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "subjectId", nullable = false)
    Subject subject;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "chapterId")
    Chapter chapter;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "chapterTopicId")
    ChapterTopic chapterTopic;

    String attachedFigures;
    Long addedByUserId;
    Long contributorId;
    DifficultyLevelEnum difficultyLevel;
    StandardEnum standard;
    Boolean isMultiOptionCorrect;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(name="questionId", referencedColumnName="id")
    List<AnswerOption> answerOptions = new ArrayList<>();
}
