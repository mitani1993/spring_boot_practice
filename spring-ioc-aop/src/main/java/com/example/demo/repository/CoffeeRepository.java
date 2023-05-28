package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Coffee;

public class CoffeeRepository extends JpaRepository<Coffee, Long> {
}
