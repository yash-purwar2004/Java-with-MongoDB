package com.example.joblisting.Repository;

import java.util.List;

import com.example.joblisting.model.Post;

public interface SearchRepository {

    List<Post> findByText(String text);

}