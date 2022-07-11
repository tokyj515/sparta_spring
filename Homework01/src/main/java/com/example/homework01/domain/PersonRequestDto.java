package com.example.homework01.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class PersonRequestDto {
    private final String name;
    private final int age;
    private final String job;
    private final String address;

    //getter setter는 쓰지 않아도 자동 생성됨
    //생성자도 자동 생성
}
