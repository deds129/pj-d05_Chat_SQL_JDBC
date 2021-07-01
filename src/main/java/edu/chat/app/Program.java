package edu.chat.app;

import edu.chat.repositories.MessagesRepository;
import edu.chat.repositories.MessagesRepositoryJdbcImpl;

import java.sql.*;

/**
 * Hello world!
 *
 */
public class Program {
    /**
     * JDBC Driver and database url
     */
    static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/chat_db";

    /**
     * USER and PASSWORD CONFIGURATION
     */
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);


            MessagesRepository messagesRepository = new MessagesRepositoryJdbcImpl(connection);

            String SQL = null;
            ResultSet resultSet = null;

            SQL = "SELECT * FROM users";
            preparedStatement = connection.prepareStatement(SQL);

            resultSet = preparedStatement.executeQuery();
            outRequestResult(resultSet);

            preparedStatement.close();
            connection.close();


        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void outRequestResult(ResultSet resultSet) throws SQLException {
        while (resultSet.next()) {
            int id = resultSet.getInt("user_id");
            String login = resultSet.getString("user_login");
            String password = resultSet.getString("user_password");
            System.out.println("\n================\n");
            System.out.println("id: " + id);
            System.out.println("login: " + login);
            System.out.println("password: " + password);

        }
    }
}
