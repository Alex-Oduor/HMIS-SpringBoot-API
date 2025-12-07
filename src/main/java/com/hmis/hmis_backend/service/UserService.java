package com.hmis.hmis_backend.service;

import com.hmis.hmis_backend.domain.User;
import com.hmis.hmis_backend.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){this.userRepository=userRepository;}

    // Add a new User to the system
    public User saveUser(User user){ return userRepository.save(user);}

    //retrieve all users of the system
    public List<User> getAllUsers(){return userRepository.findAll();}

//    retrieve user by id
    public Optional<User> getUserById(Integer id){ return userRepository.findById(id);}
}
