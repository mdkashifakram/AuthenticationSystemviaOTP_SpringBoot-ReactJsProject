package com.example.OtpGenerator.repository;

import com.example.OtpGenerator.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {

	String findByEmail(String string);
}
