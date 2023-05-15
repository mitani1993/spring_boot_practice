package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Comment;

public class CommentRepository extends JpaRepository<Comment, Long> {
}
