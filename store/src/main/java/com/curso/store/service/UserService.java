package com.curso.store.service;

import com.curso.store.domains.User;
import com.curso.store.repositorio.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> listUsers() {
        return repository.list();
    }

    public User createUser(User user) {
        return repository.save(user);
    }

    public User updateUser(Long id, User user) {
        return repository.update(id, user);
    }

    public void deleteUser(Long id) {
        repository.delete(id);
    }
}