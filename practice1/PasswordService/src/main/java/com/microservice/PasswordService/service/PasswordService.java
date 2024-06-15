package com.microservice.PasswordService.service;

import com.microservice.PasswordService.model.DecryptPassword;
import com.microservice.PasswordService.model.PasswordRequest;

public interface PasswordService {
    String encrypt(PasswordRequest passwordRequest);

    String decrypt(DecryptPassword decryptRequest);
}
