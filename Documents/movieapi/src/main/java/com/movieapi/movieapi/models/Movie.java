package com.movieapi.movieapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Document("movies")
public class Movie {
    @Id
    @JsonProperty("id") private String id;

    @JsonProperty("name") private String name;

    @JsonProperty("description") private String description;

    @JsonProperty("gender") private String gender;

    @JsonProperty("duration") private int duration;

    @JsonProperty("classification") private String classification;

    @JsonProperty("release_date") private LocalDate releaseDate;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public void setReleaseDate(LocalDate releaseDate){
        this.releaseDate = releaseDate;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
}
