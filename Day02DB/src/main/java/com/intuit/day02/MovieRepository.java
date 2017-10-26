package com.intuit.day02;

import com.intuit.day02.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer>{
        //name,id,language,yearOfRelease

    @Query("SELECT m FROM Movie as m where m.id > :p1")
    List<Movie> findMoviesWhereIdIsGreaterThan(@Param("p1") int param);

    Movie findMovieByName(String name);
    

    @Query("SELECT name FROM Movie as m where m.id > :p1")
    List<String> findMovieNamesWhereIdIsGreaterThan(@Param("p1") int param);

    List<Movie> findAllByYearOfReleaseBetween(int start,int end);
    Movie findMovieById(int id);
    List<Movie> findAllByName(String name);
    List<Movie> findAllByNameAndYearOfRelease(String name,int yearOfRelease);
    List<Movie> findAllByLanguageAndName(String language,String name);


    //findAllByName
        //findAllById
        //findAllByLanguage
        //findAllByNameAndLanguage
        //findAllByIdAndYearOfRelease

}
