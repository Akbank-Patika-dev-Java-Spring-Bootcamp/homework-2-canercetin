package com.example.bootcampdemo2.dao;

import com.example.bootcampdemo2.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
