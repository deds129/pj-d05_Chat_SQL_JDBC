package edu.chat.app;

import edu.chat.repositories.MessagesRepository;
import edu.chat.repositories.MessagesRepositoryJdbcImpl;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class Program {


    public static void main(String[] args) {

        try {
            MessagesRepository messagesRepository = new MessagesRepositoryJdbcImpl(DBUtil.getConnection());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

//    public static void outRequestResult(ResultSet resultSet) throws SQLException {
//        while (resultSet.next()) {
//            int id = resultSet.getInt("user_id");
//            String login = resultSet.getString("user_login");
//            String password = resultSet.getString("user_password");
//            System.out.println("\n================\n");
//            System.out.println("id: " + id);
//            System.out.println("login: " + login);
//            System.out.println("password: " + password);
//
//        }
//    }
}
