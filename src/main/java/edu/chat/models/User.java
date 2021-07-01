package edu.chat.models;

import lombok.EqualsAndHashCode;
import lombok.ToString;
import java.util.List;

@ToString
@EqualsAndHashCode
public class User {

    public User(Long id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    private Long id;
    private String login;
    private String password;
    private List<Chatroom> createdRooms;
    private List<Chatroom> activeRooms;

}
