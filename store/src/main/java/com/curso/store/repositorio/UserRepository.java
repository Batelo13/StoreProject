package com.curso.store.repositorio;

import com.curso.store.domains.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final List<User> users = new ArrayList<>();
    private Long nextId = 1L;

    public List<User> list() {
        return users;
    }

    public User save(User user) {
        user.setId(nextId);
        nextId++;
        users.add(user);
        return user;
    }

    public User update(Long id, User updatedUser) {

        for (User user : users) {

            if (user.getId().equals(id)) {

                user.setName(updatedUser.getName());
                user.setEmail(updatedUser.getEmail());

                return user;
            }

        }

        return null;
    }

    public void delete(Long id) {

        users.removeIf(user -> user.getId().equals(id));

    }
}