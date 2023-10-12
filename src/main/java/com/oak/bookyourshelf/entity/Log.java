package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
@Data
public class Log {

    @Id
    private String email;
    private Timestamp time;
    private String token;

    public Log(){}
}
