package com.bootmongo.models;

@lombok.Data
public class StudentData {
	private Integer rollNo;
	private String studentData;
	private Address address;
	private Subjects subjects;
}
