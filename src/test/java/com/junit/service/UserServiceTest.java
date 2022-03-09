package com.junit.service;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserServiceTest {

    @Test
    void usersEmptyIfNoUserAdded(){
        var userService = new UserService();
        var users = userService.getAll();
        assertTrue(users.isEmpty());
        
    }

}
