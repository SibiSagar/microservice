package com.microservice.PasswordService.service;

import com.microservice.PasswordService.model.DecryptPassword;
import com.microservice.PasswordService.model.PasswordRequest;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PasswordServiceImpl implements PasswordService{
    @Override
    public String encrypt(PasswordRequest passwordRequest) {
        // Reverse the input string
        String reversed = new StringBuilder(passwordRequest.getPassword()).reverse().toString();
        // Add random letters alternatively
        Random random = new Random();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";


        String encryptedPassword = IntStream.range(0, reversed.length() * 2)
                .mapToObj(i -> i % 2 == 0 ? String.valueOf(reversed.charAt(i / 2))
                        : String.valueOf(alphabet.charAt(random.nextInt(alphabet.length()))))
                .collect(Collectors.joining());

        return  encryptedPassword;

    }

    @Override
    public  String decrypt(DecryptPassword decryptRequest){
        // Remove the random letters (every second character)
        String filtered = IntStream.range(0, decryptRequest.getPassword().length())
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> String.valueOf(decryptRequest.getPassword().charAt(i)))
                .collect(Collectors.joining());

        // Reverse the remaining characters to get back the original string
        String original = new StringBuilder(filtered).reverse().toString();

        return original;

    }


}
