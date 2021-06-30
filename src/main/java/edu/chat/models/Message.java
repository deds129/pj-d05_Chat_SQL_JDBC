package edu.chat.models;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@ToString
@EqualsAndHashCode
public class Message {

    private Long id;
    private User author;
    private Chatroom room;
    private String text;
    private Date messageDate;
}
