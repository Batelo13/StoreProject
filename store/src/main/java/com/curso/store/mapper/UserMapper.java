package com.curso.store.mapper;

import com.curso.store.domains.User;
import com.curso.store.dto.UserDTO;

public class UserMapper {

    public static User toEntity(UserDTO dto){
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        return user;
    }

}