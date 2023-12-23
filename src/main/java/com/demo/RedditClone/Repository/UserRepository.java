package com.demo.RedditClone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.RedditClone.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
