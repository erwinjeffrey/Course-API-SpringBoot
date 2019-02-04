package io.javabrains.springbootquickstart.courses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository topicRepository;

	public List<Course> getAllCourses(String topicId) {
		return topicRepository.findByTopicId(topicId);
	}

	public Course getCourse(String id) {
		return topicRepository.findById(id).get();
	}

	public void addCourse(Course topic) {
		topicRepository.save(topic);
	}

	public void updateCourse(Course topic) {
		topicRepository.save(topic);

	}

	public void deleteCourse(String id) {
		topicRepository.deleteById(id);
	}
}
