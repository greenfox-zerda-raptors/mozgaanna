package com.greenfox.manna.reddit.repositories;

import com.greenfox.manna.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by mozgaanna on 04/01/17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {

    List<Post> findByOrderByScoreDesc();
}
