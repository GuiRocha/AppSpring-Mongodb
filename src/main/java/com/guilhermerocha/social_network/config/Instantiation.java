package com.guilhermerocha.social_network.config;

import com.guilhermerocha.social_network.domain.AuthorDTO;
import com.guilhermerocha.social_network.domain.Post;
import com.guilhermerocha.social_network.domain.User;
import com.guilhermerocha.social_network.repository.PostRepository;
import com.guilhermerocha.social_network.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;
    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        postRepository.deleteAll();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));


        User maria = new User(null, "Maria billy", "Guilhermerxcha@gmail.com");
        userRepository.saveAll(Arrays.asList(maria));

        Post guilherme = new Post(null, simpleDateFormat.parse("21/02/2019"), "Partiu viagem", "Olá as festas foram muito boas", new AuthorDTO(maria));
        postRepository.saveAll(Arrays.asList(guilherme));

        maria.getPostList().addAll(Arrays.asList(guilherme));
        userRepository.save(maria);

    }
}
