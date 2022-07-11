package com.example.homework01;

import com.example.homework01.domain.Person;
import com.example.homework01.domain.PersonRepository;
import com.example.homework01.service.PersonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Homework01Application {

	public static void main(String[] args) {
		SpringApplication.run(Homework01Application.class, args);
	}


	//일단 하나 만들기
	@Bean
	public CommandLineRunner demo(PersonRepository personRepository, PersonService personService) {
		return (args) -> {
			personRepository.save(new Person("권유진", 23, "학생", "경기"));
			personRepository.save(new Person("홍길동", 23, "직장인", "서울"));

			System.out.println("데이터 인쇄");
			List<Person> personList = personRepository.findAll();
			for (int i = 0; i < personList.size(); i++) {
				Person person = personList.get(i);
				System.out.println(person.getId());
				System.out.println(person.getName());
				System.out.println(person.getAge());
				System.out.println(person.getJob());
				System.out.println(person.getAddress());
			}


//			//update하는 부분
//			//Course new_course = new Course("웹개발의 봄, Spring", "임민영");
//			//courseService.update(1L, new_course);
//
//			CourseRequestDto requestDto = new CourseRequestDto("웹개발의 봄, Spring", "임민영");
//			courseService.update(1L, requestDto);
//			courseList = courseRepository.findAll();
//			for (int i = 0; i < courseList.size(); i++) {
//				Course course = courseList.get(i);
//				System.out.println(course.getId());
//				System.out.println(course.getTitle());
//				System.out.println(course.getTutor());
//			}


			//delete 실습
			//courseRepository.deleteAll();
		};


	}

}
