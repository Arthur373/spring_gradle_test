package com.example.springgradle.services;

import com.example.springgradle.entity.Company;
import com.example.springgradle.repositories.CompanyRepository;
import com.example.springgradle.repositories.CrudRepository;
import com.example.springgradle.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final CrudRepository<Integer, Company> companyRepository;

    public UserService(UserRepository userRepository, CrudRepository<Integer, Company> companyRepository) {
        this.userRepository = userRepository;
        this.companyRepository = companyRepository;
    }
}
