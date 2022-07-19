package com.sparta.week04.models;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    //생성, 조회, 삭제 담당
}
