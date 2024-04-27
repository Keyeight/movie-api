package com.movieapi.movieapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.movieapi.movieapi.dto.CreateMovieDTO;
import com.movieapi.movieapi.models.Movie;
import com.movieapi.movieapi.repository.MovieRepository;

@RestController
public class MovieController {
    
    private final MovieRepository movieRepository;
    
    //IoC 
    @Autowired
    public MovieController(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    @PostMapping("/movies")
    public ResponseEntity<Movie> newMovie(@RequestBody CreateMovieDTO createMovieDto){
            var movie = new Movie();
            
            movie.setName(createMovieDto.name);
            movie.setDescription(createMovieDto.description);
            movie.setGender(createMovieDto.gender);
            movie.setClassification(createMovieDto.classification);
            movie.setReleaseDate(createMovieDto.realeseDate);
            movie.setDuration(createMovieDto.duration);

            var filmCreated = this.movieRepository.save(movie);
            return ResponseEntity.status(HttpStatus.CREATED).body(filmCreated);
    }
}
