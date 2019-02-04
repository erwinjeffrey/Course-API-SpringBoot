package io.javabrains.springbootquickstart.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String>{

	// you don't to do the implementation of this method spring jpa will do it for you:
	// you just have to you the word findByAnyproperty in your method
	// for the example below spring jpa will find all the course by that name
	//public List<Course> findByName(String name);
	
	//going to seach a course given the topic id
	public List<Course> findByTopicId(String topicId);
	
}
