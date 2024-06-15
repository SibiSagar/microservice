package com.microservice.UserService.service;

import com.microservice.UserService.entity.User;
import com.microservice.UserService.model.UserRequest;
import com.microservice.UserService.repository.UserRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.Instant;


@Service
@Log4j2
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    public User addUser(UserRequest userRequest){

        log.info("Adding the user to the DB");
        User user=User.builder()
                .fullName(userRequest.getFullName())
                .password(userRequest.getPassword())
                .role(userRequest.getRole())
                .createdTime(Instant.now())
                .build();

       return this.userRepository.save(user);

    }
}
