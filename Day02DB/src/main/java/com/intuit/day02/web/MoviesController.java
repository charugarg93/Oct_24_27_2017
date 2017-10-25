package com.intuit.day02.web;

import com.intuit.day02.MovieRepository;
import com.intuit.day02.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping("/list")
    public List<Movie> getAllMovies(){
        System.out.println(movieRepository.getClass().getName());
        return movieRepository.findAll();
    }

    @RequestMapping("/add/{name}/{year}/{language}")
    public String addMovie(@PathVariable("name")String name,
                           @PathVariable("year")int year,
                           @PathVariable("language")String language){
        Movie movie = new Movie();
        movie.setName(name);
        movie.setYearOfRelease(year);
        movie.setLanguage(language);
        movieRepository.save(movie);
        return "Movie with id " + movie.getId() + " successfully created";
    }
}
