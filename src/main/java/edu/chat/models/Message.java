package edu.chat.models;

import java.util.Date;

public class Message {

    private int id;
    private User author;
    private Chatroom room;
    private String text;
    private Date messageDate;
}
