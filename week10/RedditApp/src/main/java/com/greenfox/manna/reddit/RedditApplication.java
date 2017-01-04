package com.greenfox.manna.reddit;

import com.greenfox.manna.reddit.model.Post;
import com.greenfox.manna.reddit.repositories.PostRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditApplication implements CommandLineRunner{

	@Autowired
	private PostRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(RedditApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		repository.save(new Post("Workshop of 4th of Jan", "Anna", "This is a nice workshop" ));
	}


}
