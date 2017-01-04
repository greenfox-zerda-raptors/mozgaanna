package com.greenfox.manna.reddit.repositories;

import com.greenfox.manna.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by mozgaanna on 04/01/17.
 */
public interface PostRepository extends CrudRepository<Post, Long> {
}
