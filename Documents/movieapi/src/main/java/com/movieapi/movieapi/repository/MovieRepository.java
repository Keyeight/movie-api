package com.movieapi.movieapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.movieapi.movieapi.models.Movie;

@Repository
public interface MovieRepository extends MongoRepository<Movie,String>{
}