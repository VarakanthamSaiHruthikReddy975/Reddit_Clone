package com.demo.RedditClone.model;

import java.time.Instant;


import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import java.util.List;

public class Subreddit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank(message = "Community name is required")
	private String name;
	
	@NotBlank(message = "Description is required")
	private String description;
	@OneToMany(fetch = FetchType.LAZY)
	private List<Post> posts;
	private Instant createdDate;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;
	public Subreddit(Long id, @NotBlank(message = "Community name is required") String name,
			@NotBlank(message = "Description is required") String description, List<Post> posts, Instant createdDate,
			User user) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.posts = posts;
		this.createdDate = createdDate;
		this.user = user;
	}
	public Subreddit() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Subreddit [id=" + id + ", name=" + name + ", description=" + description + ", posts=" + posts
				+ ", createdDate=" + createdDate + ", user=" + user + "]";
	}
	
	
}
