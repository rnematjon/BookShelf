package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public abstract class BookCase extends Product {

    private String caseColor;
    private String caseBrand;
    private String caseModel;
    private float caseHeight;
    private float caseWidth;
}
