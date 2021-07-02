package edu.chat.app;

import edu.chat.repositories.MessagesRepository;
import edu.chat.repositories.MessagesRepositoryJdbcImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.*;

/**
 * Hello world!
 *
 */
public class Program {


    public static void main(String[] args) {

        try {
            MessagesRepository messagesRepository = new MessagesRepositoryJdbcImpl(DBUtil.getDataSource());
            Logger logger = LoggerFactory.getLogger(MessagesRepository.class);
            logger.info("Message");
            messagesRepository.findAll();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
