package com.guilhermerocha.springmongo.config;

import com.guilhermerocha.springmongo.domain.User;
import com.guilhermerocha.springmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

import static com.guilhermerocha.springmongo.repository.UserRepository.*;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        User maria = new User(null, "Maria billy", "Guilhermerxcha@gmail.com");
        userRepository.saveAll(Arrays.asList(maria));
    }
}
