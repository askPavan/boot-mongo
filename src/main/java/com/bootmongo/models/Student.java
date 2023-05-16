package com.bootmongo.models;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "studentDetails")
public class Student {

	private String studentId;
	private String studentName;
	private String studentEmail;
	private String college;
	private String phone;
	private StudentData data;
}
