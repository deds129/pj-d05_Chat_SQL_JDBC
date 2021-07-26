package edu.chat.repositories;
import edu.chat.models.Chatroom;
import edu.chat.models.Message;
import edu.chat.models.User;

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
    public Optional<Message> findById(int id) {

        Message message = null;
        ResultSet resultSet = null;
        String SQL = "SELECT * FROM messages " +
                "JOIN users u ON u.user_id = messages.message_author " +
                "JOIN chatrooms c on c.chatroom_id = messages.message_room " +
                "JOIN users u2 on u2.user_id = c.chatroom_owner_id " +
                "WHERE message_id = (?)";



        try(PreparedStatement preparedStatement = connection.prepareStatement(SQL)) {
            preparedStatement.setInt(1, Math.toIntExact(id));
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next())
            {
              message = new Message(
                        resultSet.getInt("message_id"),

                        new User(resultSet.getInt("message_author"),
                        resultSet.getString("user_login"),
                        resultSet.getString("user_password")),

                        new Chatroom(resultSet.getInt("chatroom_id"),
                                resultSet.getString("chatroom_name"),
                                new User(resultSet.getInt("chatroom_owner_id"),
                                        resultSet.getString("user_login"),
                                        resultSet.getString("user_password")
                                )),
                        resultSet.getString("message_text"),
                        resultSet.getDate("message_date")

                );
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return Optional.of(message);
    }


}
