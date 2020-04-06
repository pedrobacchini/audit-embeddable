package com.github.pedrobacchini.auditembeddable.repository;

import com.github.pedrobacchini.auditembeddable.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
