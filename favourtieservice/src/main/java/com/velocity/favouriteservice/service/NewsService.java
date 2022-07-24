package com.velocity.favouriteservice.service;

import java.util.List;

import com.velocity.favouriteservice.domain.News;
import com.velocity.favouriteservice.exception.NewsAlreadyExistsException;
import com.velocity.favouriteservice.exception.NewsNotFoundException;



public interface NewsService 
{
	boolean saveNews(News news) throws NewsAlreadyExistsException;
	
	boolean deleteNewsById(int id) throws NewsNotFoundException;
	
	List<News> getNews(String userId) throws NewsNotFoundException;
}
