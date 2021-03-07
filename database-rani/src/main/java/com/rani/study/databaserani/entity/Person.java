package com.rani.study.databaserani.entity;

import java.util.Date;

public class Person {

	private int id;
	private String name;
	private String location;
	private Date birthDate ;
	
	public Person(){
		
	}
	
	Person(int id,String name,String location,Date bd){
		this.id=id;
		this.name=name;
		this.location=location;
		this.birthDate=bd;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return "\n Person: id: "+ id+ " ,name: "+name+ " ,location: "+location+ " ,BirthDate: "+birthDate;
	}
}