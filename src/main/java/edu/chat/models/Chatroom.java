package edu.chat.models;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

@ToString
@EqualsAndHashCode
public class Chatroom {
    private Long id;
    private String name;
    private User owner;
    private List<Message> chatroomMessages;
}
