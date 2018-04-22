package com.buzilov.databases5.model;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
public class CinemaMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private Genre genre;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "cinema_id", insertable = false, updatable = false)
    private Cinema cinema;

    @Column(name = "cinema_id")
    private int cinemaId;

    @Column
    private LocalDate date;

    public CinemaMovie() {
    }

    public CinemaMovie(String name, Genre genre, LocalDate date) {
        this.name = name;
        this.genre = genre;
        this.date = date;
    }

    public CinemaMovie(String name, Genre genre, Cinema cinema, int cinemaId, LocalDate date) {
        this.name = name;
        this.genre = genre;
        this.cinema = cinema;
        this.cinemaId = cinemaId;
        this.date = date;
    }

    @Override
    public String toString() {
        return "CinemaMovie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", cinema=" + cinema +
                ", cinemaId=" + cinemaId +
                ", date=" + date +
                '}';
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public int getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(int cinemaId) {
        this.cinemaId = cinemaId;
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

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
