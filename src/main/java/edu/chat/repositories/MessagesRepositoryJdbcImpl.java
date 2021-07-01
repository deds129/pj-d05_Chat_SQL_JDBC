package edu.chat.repositories;

import com.sun.istack.internal.NotNull;
import edu.chat.models.Message;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class MessagesRepositoryJdbcImpl implements MessagesRepository {


    private final Connection connection;

    public MessagesRepositoryJdbcImpl(@NotNull Connection connection) throws SQLException {
        this.connection = connection;
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

    @Override
    public List<Message> findAll() {
        return null;
    }
}
