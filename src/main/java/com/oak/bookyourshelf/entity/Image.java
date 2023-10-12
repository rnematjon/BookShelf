package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Base64;

@Entity
@Data
public class Image {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Lob
    private byte[] image;

    public String encodeImage() {
        return Base64.getEncoder().encodeToString(this.getImage());
    }
}
