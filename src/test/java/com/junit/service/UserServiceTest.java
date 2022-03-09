package com.junit.service;

import com.junit.dto.User;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserServiceTest {

    @Test
    void usersEmptyIfNoUserAdded(){
        UserService userService = new UserService();
        List<User> users = userService.getAll();
        assertTrue(users.isEmpty());
        
    }

}
