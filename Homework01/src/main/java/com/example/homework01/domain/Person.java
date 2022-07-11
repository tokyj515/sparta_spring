package com.example.homework01.domain;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter //getter 전부 만들어줌
@Setter //setter 전부 만들어줌
@NoArgsConstructor //기본 생성자 만들어줌
@Entity //테이블임을 나타내줌
public class Person {

    @GeneratedValue(strategy = GenerationType.AUTO) //값은 자동 증가
    @Id //id를 primary key로 쓰겠다는 명령
    private Long id;

    @Column(nullable = false) //컬럼값이고 반드시 존재해야함
    private String name;

    @Column(nullable = false)
    private int age;

    @Column(nullable = false)
    private String job;


    @Column(nullable = false)
    private String address;



    public Person(String name, int age, String job, String address){
        this.name = name;
        this.age = age;
        this.job = job;
        this.address = address;
    }

    public Person(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
        this.address = requestDto.getAddress();

    }

    public void update(PersonRequestDto requestDto){
        this.name = requestDto.getName();
        this.age = requestDto.getAge();
        this.job = requestDto.getJob();
        this.address = requestDto.getAddress();

    }

}
