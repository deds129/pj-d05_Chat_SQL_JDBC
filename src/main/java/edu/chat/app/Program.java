package edu.chat.app;

import edu.chat.models.Message;
import edu.chat.repositories.MessagesRepository;
import edu.chat.repositories.MessagesRepositoryJdbcImpl;
import edu.chat.repositories.UserRepository;
import edu.chat.repositories.UserRepositoryJdbcImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.Optional;

public class Program {


    public static void main(String[] args) {

        try {
            MessagesRepository messagesRepository = new MessagesRepositoryJdbcImpl(DBUtil.getDataSource());
            UserRepository userRepository = new UserRepositoryJdbcImpl(DBUtil.getDataSource());
            Logger logger = LoggerFactory.getLogger(MessagesRepository.class);
            logger.info("Message");
           // messagesRepository.findAll();
            Optional<Message> optMsg = messagesRepository.findById(1);
            Message message = optMsg.orElse(null);
            System.out.println(message.toString());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
