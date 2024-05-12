package com.example.OtpGenerator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OtpGenerator.entity.MobileEntity;

@Repository
public interface MobileRepository extends JpaRepository<MobileEntity,String>{

}
