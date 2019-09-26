package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ExchangeValue;
@Repository
public interface ExchangeRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from,String to);

}
