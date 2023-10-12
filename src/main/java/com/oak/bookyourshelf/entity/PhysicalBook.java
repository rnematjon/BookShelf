package com.oak.bookyourshelf.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
public class PhysicalBook extends Book {

    public enum MediaType {HARDCOVER, SOFTCOVER, POCKET_SIZE, TABLET_SIZE, MONTHLY;}

    public enum PaperType {COATED, UN_COATED, AMERICAN_BRISTOL, TRACING, CANVAS, CELLOPHANE, CRAFT, MATTE_COATED_PLASTER;}

    public enum BindingType {SADDLE_STITCHING, CASE_BINDING, CASE_WRAPPED, PLASTIC_COIL, PERFECT_BINDING;}

    private int pageNum;
    private int editionNum;
    private float height;
    private float width;
    private float depth;

    @Enumerated(EnumType.STRING)
    private MediaType mediaType;

    @Enumerated(EnumType.STRING)
    private PaperType paperType;

    @Enumerated(EnumType.STRING)
    private BindingType bindingType;

    public String getProductTypeName() {
        return "Book";
    }
}
