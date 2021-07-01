package edu.chat.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
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

    @Getter private Long id;
    @Getter private String login;
    @Getter private String password;

    private List<Chatroom> createdRooms;
    private List<Chatroom> activeRooms;

//    public User getUserById(Long id) {
//    }

}
