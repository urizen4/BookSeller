package com.cracken.bookseller.service;

import com.cracken.bookseller.Repository.I_UserRepository;
import com.cracken.bookseller.models.Role;
import com.cracken.bookseller.models.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Optional;


@Service
public class UserService implements  I_UserService{

    private final I_UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public UserService(I_UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    public User saveUser(User user)
    {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        user.setCreatAt(LocalDateTime.now());

        return userRepository.save(user) ;
    }

    @Override
    public Optional<User> findByUsername(String username)
    {
        return userRepository.findByUsername(username);
    }

    @Override
    public void   makeAdmin(String username){

        userRepository.updateUserRole(username,Role.ADMIN);
    }

}
