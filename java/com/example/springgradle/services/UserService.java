package com.example.springgradle.services;

import com.example.springgradle.repositories.CompanyRepository;
import com.example.springgradle.repositories.UserRepository;

public class UserService {

    private final UserRepository userRepository;
    private final CompanyRepository companyRepository;

    public UserService(UserRepository userRepository, CompanyRepository companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
