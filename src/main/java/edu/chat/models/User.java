package edu.chat.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
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

    @Getter private final Long id;
    @Getter private final String login;
    @Getter private final String password;

    private List<Chatroom> createdRooms;
    private List<Chatroom> activeRooms;

//    public User getUserById(Long id) {
//    }

}
