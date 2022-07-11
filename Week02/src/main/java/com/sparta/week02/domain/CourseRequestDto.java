package com.sparta.week02.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;



//@NoArgsConstructor
@Getter
@Setter
@RequiredArgsConstructor
public class CourseRequestDto {
    //course에 관한 정보만 가지고 옮겨다님
    private final String title;
    private final String tutor;

    /*
    public CourseRequestDto(String title, String tutor) {
        this.title = title;
        this.tutor = tutor;
    }*/
}