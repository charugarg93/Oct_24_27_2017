package com.intuit.day02.web;

import com.intuit.day02.MovieRepository;
import com.intuit.day02.domain.Actor;
import com.intuit.day02.domain.ActorRepository;
import com.intuit.day02.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private ActorRepository actorRepository;


    @RequestMapping("/create")
    public String createMovie(){

        Movie movie = new Movie();
        movie.setName("Skyfall");
        movie.setLanguage("English");
        movie.setYearOfRelease(2011);

        movieRepository.save(movie);

        Actor craig = new Actor();
        craig.setName("Daniel Craig");
        craig.setRole("007");
        craig.setMovie(movie);

        Actor judi = new Actor();
        judi.setName("Judi");
        judi.setRole("M");
        judi.setMovie(movie);
        actorRepository.save(craig);
        actorRepository.save(judi);


        return "Created";
    }


    @RequestMapping("/findmovie")
    public Movie findMovie(@RequestParam("id") int id){
        return movieRepository.getOne(id);
    }

    @RequestMapping("/findall")
    public List<Movie> findMovies(@RequestParam("id") int id){
        return movieRepository.findMoviesWhereIdIsGreaterThan(id);
    }

    @RequestMapping("/find")
    public List<String> findNames(@RequestParam("id") int id){
        return movieRepository.findMovieNamesWhereIdIsGreaterThan(id);
    }

    @RequestMapping("/find/{name}/{year}")
    public List<Movie> findByNameAndYear(@PathVariable String name,@PathVariable  int year){
        return movieRepository.findAllByNameAndYearOfRelease(name,year);
    }

    @RequestMapping("/find/{name}")
    public List<Movie> findByName(@PathVariable String name){
        return movieRepository.findAllByName(name);
    }

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
