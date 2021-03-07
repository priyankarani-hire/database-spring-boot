package com.rani.study.databaserani.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.rani.study.databaserani.entity.Person;

@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}

	public Person findById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id},new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public List<Person> findByLocation(String location) {
		return  jdbcTemplate.query("select * from person where location=?", new Object[] {location}, new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public List<Person> findByNameAndLocation(String location,String name){
		return jdbcTemplate.query("select * from person where location=? and name=?", new Object[] {location, name}, new BeanPropertyRowMapper<Person>(Person.class));
	}
}
