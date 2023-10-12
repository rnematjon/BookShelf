package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
@Data
public class ElectronicBook extends Book {

    public enum FileFormat {
        EPUB,
        PDF;
    }

    private int pageNum;
    private int fileSize;

    @Enumerated(EnumType.STRING)
    private FileFormat fileFormat;

    public String getProductTypeName() {
        return "E-Book";
    }
}
