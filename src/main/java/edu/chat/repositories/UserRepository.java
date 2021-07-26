package edu.chat.repositories;

import edu.chat.models.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {

    Optional<User> findById(int id);
    void delete (User user);
    void save(User user);
    void update(User user);
    void add(User user);
    List<User> findAll();


}
