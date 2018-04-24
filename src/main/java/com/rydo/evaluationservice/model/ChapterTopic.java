package com.rydo.evaluationservice.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Data
@Entity
@Table(name = "chapter_topic")
public class ChapterTopic extends BaseEntity{
    String name;
    String description;
    Long chapterId;

    ChapterTopic(Long id){
        this.setId(id);
    }
}
