package com.bootmongo.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bootmongo.models.Student;
import com.bootmongo.repo.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	MongoTemplate mongoTemplate;
	@Autowired
	private StudentRepo studentRepo;
	
	@PostMapping("/save")
	public ResponseEntity<String> save(@RequestBody Student student){
		try {
//			studentRepo.save(student);
			mongoTemplate.save(student, "tempStudent");
			return new ResponseEntity<String>("Student details saved successfully!! Process Time: ", HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Error: occured while saving student details:", HttpStatus.BAD_REQUEST);
		}
	}
	
}
