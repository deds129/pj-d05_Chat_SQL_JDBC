package edu.chat.models;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class Message {

    @Getter private final int  id;
    @Getter private final User author;
    @Getter private final Chatroom room;
    @Getter private final String text;
    @Getter  private final Date messageDate;
}
