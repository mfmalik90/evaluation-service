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
@Table(name = "answer_option")
public class AnswerOption extends BaseEntity{
    Long questionId;
    String answer;
    Boolean isCorrect;

    AnswerOption(Long id){
        this.setId(id);
    }
}
