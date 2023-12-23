package com.demo.RedditClone.model;


import java.time.Instant;

import jakarta.annotation.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long postId;
	
	@NotBlank //This annotation will automatically throw a vaildation error when the value is empty or null
	private String postName;
	
	@Nullable
	@Lob
	private String description;
	private Integer voteCount;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userId", referencedColumnName = "userId")
	private User user;
	private Instant createdDate;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id", referencedColumnName = "id")
	private Subreddit subreddit;
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getVoteCount() {
		return voteCount;
	}
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Instant getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Instant createdDate) {
		this.createdDate = createdDate;
	}
	public Subreddit getSubreddit() {
		return subreddit;
	}
	public void setSubreddit(Subreddit subreddit) {
		this.subreddit = subreddit;
	}
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Post(Long postId, @NotBlank String postName, String description, Integer voteCount, User user,
			Instant createdDate, Subreddit subreddit) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.description = description;
		this.voteCount = voteCount;
		this.user = user;
		this.createdDate = createdDate;
		this.subreddit = subreddit;
	}
	@Override
	public String toString() {
		return "Post [postId=" + postId + ", postName=" + postName + ", description=" + description + ", voteCount="
				+ voteCount + ", user=" + user + ", createdDate=" + createdDate + ", subreddit=" + subreddit + "]";
	}
	
	
	
	

}
