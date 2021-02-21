package com.example.demo.service;

import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Mono<Boolean> firstTimeToFill(String email,String Survey){
        this.userRepository.findByEmail().map(user -> user.getSubmissions()).map(submissions -> )
    }

}
