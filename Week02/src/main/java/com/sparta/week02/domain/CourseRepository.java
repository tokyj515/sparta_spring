package com.sparta.week02.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//sql 역할을 대신해줌
//extends: 다른 기능을 불러와서 사용함
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    //JpaRepository의 기능을 CourseRepository에 불러와서 쓸 거야
    //<Course, Long> => 클래스명과 아이디의 자료형
}
