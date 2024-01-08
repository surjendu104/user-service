package com.startupsync.com.userservice.repository;


import com.startupsync.com.userservice.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long> {
	List<Skill> findByUserId(Long userId);
}
