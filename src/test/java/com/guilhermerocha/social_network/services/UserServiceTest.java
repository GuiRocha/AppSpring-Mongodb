package com.guilhermerocha.social_network.services;

import com.guilhermerocha.social_network.model.User;
import com.guilhermerocha.social_network.repository.UserRepository;
import com.guilhermerocha.social_network.services.UserService;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @MockBean
    private UserRepository userRepository;

    @Test
    public void findAll() {
        when(userRepository.findAll()).thenReturn(Stream.of(new User("abc3", "Guilherme", "guilherme@gmail.com")).collect(Collectors.toList()));
        assertEquals(1, userService.findAll().size());
    }
    @Test
    public void findById(){
        User user = new User("ab3", "Guilherme", "guilherme@gmail.com");
        when(userRepository.findById("ab3")).thenReturn(Optional.of(user));

    }
}