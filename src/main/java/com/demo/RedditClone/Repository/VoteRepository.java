package com.demo.RedditClone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.RedditClone.model.Vote;

@Repository
public interface VoteRepository extends JpaRepository<Vote,Long> {

}
