package com.demo.RedditClone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.RedditClone.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
