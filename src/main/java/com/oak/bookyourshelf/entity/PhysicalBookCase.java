package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class PhysicalBookCase extends BookCase {
    private float maxBookDepth;

    public String getProductTypeName() {
        return "Book Case";
    }
}
