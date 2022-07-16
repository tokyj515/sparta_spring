package com.sparta.week03.domain;

import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;


/*

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findAllByOrderByModifiedAtDesc();
    //findAll By OrderBy ModifiedAt Desc
    //https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
    //쿼리: SQL을 만듦

}*/

public interface MemoRepository extends JpaRepository<Memo, Long> {
    //타임라인 페이지 24시간만 보이게 하기위한 코드
    List<Memo> findAllByModifiedAtBetweenOrderByModifiedAtDesc(LocalDateTime start, LocalDateTime end);
    //findAll ByModifiedAt BetweenOrder ByModifiedAt Desc
}
