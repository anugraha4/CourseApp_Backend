package com.nest.Courseapp_backend.dao;

import com.nest.Courseapp_backend.model.Courses;
import org.springframework.data.repository.CrudRepository;

public interface CourseDao extends CrudRepository<Courses,Integer> {
}
