package com.buzilov.databases5.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @ElementCollection(targetClass = Genre.class)
    @CollectionTable(name = "artist_genre", joinColumns = @JoinColumn(name = "artist_id"))
    @Enumerated(EnumType.STRING)
    @Column(name = "genre")
    private Set<Genre> genreSet;

    @JsonManagedReference
    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "artist_impresario",
                joinColumns = @JoinColumn(name = "artist_id"),
                inverseJoinColumns = @JoinColumn(name = "impresario_id"))
    private Set<Impresario> impresarioSet = new HashSet<>();

    public Artist(){}

    public Artist(String name, Set<Genre> genreSet) {
        this.name = name;
        this.genreSet = genreSet;
    }

    public Artist(String name, Set<Genre> genreSet, Set<Impresario> impresarioSet) {
        this.name = name;
        this.genreSet = genreSet;
        this.impresarioSet = impresarioSet;
    }

    public Set<Impresario> getImpresarioSet() {
        return impresarioSet;
    }

    public void setImpresarioSet(Set<Impresario> impresarioSet) {
        this.impresarioSet = impresarioSet;
    }

    public Set<Genre> getGenreSet() {
        return genreSet;
    }

    public void setGenreSet(Set<Genre> genreSet) {
        this.genreSet = genreSet;
    }

    public Artist(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Artist{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
