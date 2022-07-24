package com.velocity.favouriteservice.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.velocity.favouriteservice.domain.News;



public interface NewsRepository extends JpaRepository<News, Integer> 
{
	List<News> findByUserId(String userId);
	
	Optional<News> findByUserIdAndTitle(String userId, String title);
}
