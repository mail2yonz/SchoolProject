package com.example.demo.Repository;

import com.example.demo.Entity.Instructor;
import org.springframework.data.repository.CrudRepository;

public interface InstructorRepository extends CrudRepository<Instructor,Long>{
}
