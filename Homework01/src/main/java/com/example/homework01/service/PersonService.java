package com.example.homework01.service;


import com.example.homework01.domain.Person;
import com.example.homework01.domain.PersonRepository;
import com.example.homework01.domain.PersonRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service // 스프링에게 이 클래스는 서비스임을 명시
public class PersonService {

    //테이블 불러옴
    private final PersonRepository personRepository;


    @Transactional // SQL 쿼리가 일어나야 함을 스프링에게 알려줌
    public Long update(Long id, PersonRequestDto requestDto) {
        //DB와 관련된 클래스는 냅두고 정보만을 이동시키는 클래스 만듦
        Person person = personRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("해당 아이디가 존재하지 않습니다.")
        );
        person.update(requestDto);
        return person.getId(); //업데이트한 것의 아이디를 반환
    }


}
