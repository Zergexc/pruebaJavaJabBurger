package com.jab.burger.jabburger.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jab.burger.jabburger.repositories.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public boolean authenticateUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password) != null;
    }
}
