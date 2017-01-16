package com.greenfox.manna.repositories;

import com.greenfox.manna.domain.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mozgaanna on 10/01/17.
 */
@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {




}

