package com.intuit.day02.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor,Integer>{

    @Query("select actor from Actor actor where actor.movie.id = :p1")
    List<Actor> findByMovieId(@Param("p1") int movieId);
}
