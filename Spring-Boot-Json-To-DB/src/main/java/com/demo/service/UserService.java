package com.demo.service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.demo.model.*;
import com.demo.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<TenderBasicDetails> list() {
        return userRepository.findAll();
    }

    public TenderBasicDetails save(TenderBasicDetails user) {
        return userRepository.save(user);
    }

    public void save(List<TenderBasicDetails> users) {
        userRepository.saveAll(users);
    }
}
