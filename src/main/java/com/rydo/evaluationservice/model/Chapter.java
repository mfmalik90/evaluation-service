package com.rydo.evaluationservice.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author faizanmalik
 *         creation date 4/24/18
 */
@Data
@Entity
@Table(name = "chapter")
public class Chapter extends BaseEntity{
    String name;
    String description;
    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY)
    @JoinColumn(name="chapterId", referencedColumnName="id")
    List<ChapterTopic> chapterTopics = new ArrayList<>();

    Chapter(Long id){
        this.setId(id);
    }
}
