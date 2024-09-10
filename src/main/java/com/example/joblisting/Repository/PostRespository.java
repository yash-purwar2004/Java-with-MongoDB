package com.example.joblisting.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.joblisting.model.Post;

public interface PostRespository extends MongoRepository<Post, String> {

    
} 
