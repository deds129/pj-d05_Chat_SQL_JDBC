package edu.chat.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@EqualsAndHashCode
public class Chatroom {
    @Getter private final Long id;
    @Getter private final String name;
    @Getter private final User owner;
    @Getter private List<Message> chatroomMessages;

    public Chatroom(Long id, String name, User owner) {
        this.id = id;
        this.name = name;
        this.owner = owner;
    }
}
