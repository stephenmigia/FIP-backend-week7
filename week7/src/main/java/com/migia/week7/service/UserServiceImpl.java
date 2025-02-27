package com.migia.week7.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.migia.week7.model.User;
import com.migia.week7.repository.UserRepository;

@Service
public class UserServiceImpl  {

    @Autowired
    private UserRepository userRepository;

    
    public User createUser(User user) {
        return userRepository.save(user);
    }

    
    public User getUserById(Integer id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    
    public User updateUser(Integer id, User user) {
        Optional<User> userOptional = userRepository.findById(id);
        if (userOptional.isPresent()) {
            User existingUser = userOptional.get();
            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            return userRepository.save(existingUser);
        } else {
            return null;
        }
    }

    
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
