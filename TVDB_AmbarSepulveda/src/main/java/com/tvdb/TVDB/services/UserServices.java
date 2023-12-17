package com.tvdb.TVDB.services;

import com.tvdb.TVDB.models.User;
import com.tvdb.TVDB.repositories.UserRepository;

public class UserServices {

    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }
}