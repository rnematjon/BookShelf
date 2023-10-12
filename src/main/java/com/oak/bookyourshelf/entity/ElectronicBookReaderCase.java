package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class ElectronicBookReaderCase extends BookCase {

    private String readerBrand;
    private String readerModel;
    private float caseDepth;

    public String getProductTypeName() {
        return "E-Book Reader Case";
    }
}
