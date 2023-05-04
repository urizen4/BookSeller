package com.cracken.bookseller.service;

import com.cracken.bookseller.models.User;

import java.util.Optional;

public interface I_UserService {


    User saveUser(User user);

    Optional<User> findByUsername(String username);

    void makeAdmin(String username);
}
