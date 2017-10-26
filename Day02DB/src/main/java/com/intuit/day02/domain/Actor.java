package com.intuit.day02.domain;

import javax.persistence.*;

@Entity
@Table(name="actors")
public class Actor {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String name;
    @Column
    private String role;


    @ManyToOne
    @JoinColumn(name="movie_id")
    private Movie movie;

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
