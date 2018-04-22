package com.buzilov.databases5.model;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.List;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private int screenSize;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "cinema_id", insertable = false, updatable = false, nullable = false)
    private List<CinemaMovie> cinemaMovieList;

    public Cinema() {
    }

    public Cinema(String name, String address, int screenSize) {
        this.name = name;
        this.address = address;
        this.screenSize = screenSize;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", screenSize=" + screenSize +
                '}';
    }
}
