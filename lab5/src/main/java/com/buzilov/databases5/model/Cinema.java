package com.buzilov.databases5.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cinema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String address;

    @Column
    private int screenSize;

    /*@OneToMany(mappedBy = "cinema")
    private List<CinemaMovie> cinemaMovieList;*/

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cinema cinema = (Cinema) o;

        if (screenSize != cinema.screenSize) return false;
        if (id != null ? !id.equals(cinema.id) : cinema.id != null) return false;
        if (name != null ? !name.equals(cinema.name) : cinema.name != null) return false;
        return address != null ? address.equals(cinema.address) : cinema.address == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + screenSize;
        return result;
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
