package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class AudioBook extends Book {

    private int lengthInMinutes;
    private String narratedBy;

    public String getProductTypeName() {
        return "Audio Book";
    }

    public int getLengthInMinutes() {
        return lengthInMinutes;
    }

    public void setLengthInMinutes(int lengthInMinutes) {
        this.lengthInMinutes = lengthInMinutes;
    }

    public String getNarratedBy() {
        return narratedBy;
    }

    public void setNarratedBy(String narratedBy) {
        this.narratedBy = narratedBy;
    }
}
