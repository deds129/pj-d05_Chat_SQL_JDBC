package edu.chat.repositories;

import edu.chat.models.Message;

import java.util.List;
import java.util.Optional;

public interface MessagesRepository {
    Optional<Message> findById(Long id);
    void delete (Message message);
    void save(Message message);
    void update(Message message);
    void add(Message message);
    List<Message> findAll();
}
