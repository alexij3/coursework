package com.buzilov.databases5.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CinemaMovie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String genre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cinema_id")
    private Cinema cinema;

    @Column
    private Date date;

    public CinemaMovie(String name, String genre, Cinema cinema, Date date) {
        this.name = name;
        this.genre = genre;
        this.cinema = cinema;
        this.date = date;
    }

    @Override
    public String toString() {
        return "CinemaMovie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", cinema=" + cinema +
                ", date=" + date +
                '}';
    }


    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
