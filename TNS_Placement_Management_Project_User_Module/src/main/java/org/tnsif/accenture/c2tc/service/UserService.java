package org.tnsif.accenture.c2tc.service;

import java.util.List;

import org.tnsif.accenture.c2tc.entity.User;

public interface UserService {
    User registerUser(User user);
    User updateUser(Long id, User user);
    void deleteUser(Long id);
    User login(String username, String password);
    List<User> getAllUsers();
}
