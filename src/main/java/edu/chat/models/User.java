package edu.chat.models;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String login;
    private String password;
    List<Chatroom> createdRooms = new ArrayList<>();
    List<Chatroom> activeRooms = new ArrayList<>();

}
