package edu.chat.repositories;

import edu.chat.models.Message;

import java.util.List;
import java.util.Optional;

public interface MessagesRepository {
    Optional<Message> findById(int id);
}
