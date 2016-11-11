package com.scrdl;


import java.util.List;
import com.scrdl.Course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends CrudRepository<Course, Long> {
    List<Course> findByName(String name);
}

