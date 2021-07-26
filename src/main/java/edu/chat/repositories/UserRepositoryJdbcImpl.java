package edu.chat.repositories;

import edu.chat.models.User;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserRepositoryJdbcImpl implements UserRepository{

    Connection connection = null;
    public UserRepositoryJdbcImpl(DataSource dataSource) throws SQLException {
        connection = dataSource.getConnection();
    }
    @Override
    public Optional<User> findById(int id) {
        List<User> userList = findAll();
        //todo: replace code
        return  userList.stream().findAny();
    }

    @Override
    public void delete(User user) {

    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void add(User user) {

    }

    @Override
    public List<User> findAll() {
        List<User> userList = new ArrayList<>();
        String SQL = "SELECT * FROM users";
        try(PreparedStatement statement = connection.prepareStatement(SQL)) {
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next())
            {
                int usr_id = resultSet.getInt("user_id");
                String usr_login = resultSet.getString("user_login");
                String usr_password = resultSet.getString("user_password");
                userList.add(new User(usr_id,usr_login,usr_password));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return userList;
    }
}
