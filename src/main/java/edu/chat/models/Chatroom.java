package edu.chat.models;

import java.util.ArrayList;
import java.util.List;

public class Chatroom {
    private int id;
    private String name;
    private User owner;
    List<Message> chatroomMessages = new ArrayList<>();
}
