package edu.chat.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Message {

    private Long id;
    private User author;
    private Chatroom room;
    private String text;
    private Date messageDate;
}
