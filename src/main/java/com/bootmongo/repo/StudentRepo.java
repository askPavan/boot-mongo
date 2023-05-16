package com.bootmongo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bootmongo.models.Student;

public interface StudentRepo extends MongoRepository<Student, Integer> {
	
}
