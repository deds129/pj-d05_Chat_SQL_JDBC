package edu.chat.models;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;

@ToString
@EqualsAndHashCode
public class User {

    private Long id;
    private String login;
    private String password;
    private List<Chatroom> createdRooms;
    private List<Chatroom> activeRooms;

}
