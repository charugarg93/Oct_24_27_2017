package com.intuit.day03;

import com.intuit.day03.domain.Game;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository<Game,Integer>{

    List<Game> findAllByOrderByAttemptsAsc();
}
