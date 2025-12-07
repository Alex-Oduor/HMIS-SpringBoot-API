package com.hmis.hmis_backend.web;

import com.hmis.hmis_backend.domain.User;
import com.hmis.hmis_backend.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    // Adding a new patient
    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    //retrieve all patients
    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    //retrieve a patient by id
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Integer id){
        return userService.getUserById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
