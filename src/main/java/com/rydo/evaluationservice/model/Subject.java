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

@Table(name = "subject")
public class Subject extends BaseEntity{
    String name;
    String description;

    Subject(Long id){
        this.setId(id);
    }
}
