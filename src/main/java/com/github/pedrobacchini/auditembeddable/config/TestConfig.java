package com.github.pedrobacchini.auditembeddable.config;

import com.github.pedrobacchini.auditembeddable.entity.Post;
import com.github.pedrobacchini.auditembeddable.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class TestConfig {

    private final PostRepository postRepository;

    @Bean
    public boolean instantiateDatabase() {

        Post post = new Post(1L, "Java 8");

        postRepository.save(post);

        post.setTitle("Java 11");

        postRepository.save(post);

        return true;
    }
}
