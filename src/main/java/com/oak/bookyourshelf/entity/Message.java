package com.oak.bookyourshelf.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int messageID;

    boolean mail;
    boolean sms;
    String subject;
    String messageContent;

    @ElementCollection
    List<Integer> receivers;
}
