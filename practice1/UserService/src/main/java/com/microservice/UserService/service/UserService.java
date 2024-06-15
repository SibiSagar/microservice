package com.microservice.UserService.service;

import com.microservice.UserService.entity.User;
import com.microservice.UserService.model.UserRequest;

public interface UserService {
    User addUser(UserRequest userRequest);
}
