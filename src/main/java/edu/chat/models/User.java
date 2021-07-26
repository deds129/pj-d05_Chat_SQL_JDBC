package edu.chat.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import java.util.List;


@ToString
@EqualsAndHashCode
public class User {
    @Getter private final int  id;
    @Getter private final String login;
    @Getter private final String password;

    public User(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }


    private List<Chatroom> createdRooms;
    private List<Chatroom> activeRooms;

}
