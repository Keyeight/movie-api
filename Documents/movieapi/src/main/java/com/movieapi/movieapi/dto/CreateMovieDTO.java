package com.movieapi.movieapi.dto;

import java.time.LocalDate;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateMovieDTO {
    
    @JsonProperty("name") public String name; 

    @JsonProperty("description") public String description;

    @JsonProperty("gender") public String gender; 

    @JsonProperty("duration") public int duration;

    @JsonProperty("classification") public String classification;

    @JsonProperty("realese_date") public LocalDate realeseDate;
}
