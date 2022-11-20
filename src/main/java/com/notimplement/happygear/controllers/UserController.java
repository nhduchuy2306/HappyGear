package com.notimplement.happygear.controllers;

import com.notimplement.happygear.entities.User;
import com.notimplement.happygear.model.dto.UserDTO;
import com.notimplement.happygear.model.mapper.UserMapper;
import com.notimplement.happygear.repositories.UserRepository;
import com.notimplement.happygear.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/user")
    public List<UserDTO> getAllUser(){
        return userService.getAllUser().stream().map(userMapper::toUserDTO).collect(Collectors.toList());
    }

    @GetMapping("/user/{id}")
    public User getUserByUserId(@PathVariable String id){
        User user = userService.getUserByUserId(id);
        UserDTO userDTO = userMapper.toUserDTO(user);
        return user;
    }
}
