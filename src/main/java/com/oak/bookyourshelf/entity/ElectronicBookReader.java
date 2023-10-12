package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.Entity;

@Entity
@Data
public class ElectronicBookReader extends Product {

    private String readerColor;
    private String readerBrand;
    private String readerModel;
    private String technicalSpecifications;
    private float weight;
    private float width;
    private float height;
    private float depth;
    private float screenSize;
    private float batteryLife;
    private float resolution;
    private int ram;
    private boolean glareFreeScreen;
    private boolean waterProof;
    private boolean autoAdjustingLight;
    private boolean buttons;
    private boolean wifi;
    private boolean cellular;
    private boolean backLight;
    private boolean warmBackLight;

    public String getProductTypeName() {
        return "E-Book Reader";
    }
}
