package edu.chat.repositories;

import edu.chat.app.DBUtil;
import edu.chat.models.Message;
import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MessagesRepositoryJdbcImpl implements MessagesRepository {
    Connection connection = null;
    public MessagesRepositoryJdbcImpl(DataSource dataSource) throws SQLException {
         connection = dataSource.getConnection();
    }

    @Override
    public List<Message> findAll() {

        List<Message> messageList = new ArrayList<>();
        String SQL = "SELECT * FROM messages";
        try(PreparedStatement statement = connection.prepareStatement(SQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
            {
                int msg_id = resultSet.getInt("message_id");
                int msg_author = resultSet.getInt("message_author");
                int msg_room = resultSet.getInt("message_room");
                String msg_text = resultSet.getString("message_text");
                Date msg_date = resultSet.getDate("message_date");
                System.out.println(msg_id);
               // add(new Message(msg_id, getUserById(msg_author), getRoomById(msg_room), msg_text, msg_date));


            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public Optional<Message> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Message message) {

    }

    @Override
    public void save(Message message) {

    }

    @Override
    public void update(Message message) {

    }

    @Override
    public void add(Message message) {

    }
/*
// Class.forName("org.postgresql.Driver");
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

 */
}
