package com.curso.store.controller;

import com.curso.store.domains.User;
import com.curso.store.dto.UserDTO;
import com.curso.store.mapper.UserMapper;
import com.curso.store.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> list() {
        return service.listUsers();
    }

    @PostMapping
    public User create(@RequestBody UserDTO dto) {

        User user = UserMapper.toEntity(dto);

        return service.createUser(user);
    }

    @PutMapping("/{id}")
    public User update(@PathVariable Long id, @RequestBody UserDTO dto) {

        User user = UserMapper.toEntity(dto);

        return service.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {

        service.deleteUser(id);
    }
}