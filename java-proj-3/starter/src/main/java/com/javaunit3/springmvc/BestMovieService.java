package com.javaunit3.springmvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BestMovieService {

    // @Autowired - this method utilizes injection to inject a movie object
    private Movie movie;

    //utilize the setter method
    // @Autowired
    // public void setMovie(Movie movie) {
       // this.movie = movie;
    // }

    // constructor method
    // @Autowired
    //public BestMovieService(Movie movie) {
        // this.movie = movie;
    // }

    // inject Titanic Movie
    @Autowired
    public BestMovieService(@Qualifier("titanicMovie") Movie movie) {
        this.movie = movie;
    }
    public Movie getBestMovie() {
        return movie;
    }
}
