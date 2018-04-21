package com.buzilov.databases5;

import com.buzilov.databases5.model.Artist;
import com.buzilov.databases5.repositories.artist.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class DataStorage {
    @Autowired
    ArtistRepository artistRepository;

    @PostConstruct
    public void init(){
        //artistRepository.saveAll(artists);
        /*artistsToGet = (List<Artist>)artistRepository.findAll();
        for (Artist a : artistsToGet)
            System.out.println(a);*/
    }

    /*public List<Artist> artists = new ArrayList<>(
            Arrays.asList(
                    new Artist( "Бойчук Олег Станіславович"),
                    new Artist( "Стецько Анастасія Петрівна"),
                    new Artist( "Дубовик Юрій Іванович"),
                    new Artist( "Самойлов Петро Андрійович"),
                    new Artist( "Гак Марина Миколаївна"),
                    new Artist( "Моршин Катерина Петрівна"),
                    new Artist( "Ступка Богдан Богданович"),
                    new Artist ( "Антимійчук Микола Павлович"),
                    new Artist( "Блажчук Максим Олександрович"),
                    new Artist( "Бордюжан Борис Борисович"),
                    new Artist( "Сом Артур Миколайович"),
                    new Artist( "Дашкевич Каріна Андріївна"),
                    new Artist( "Блажчук Павло Олександрович"),
                    new Artist( "Остапенко Дмитро Васильович"),
                    new Artist( "Романенко Владислав Романович"),
                    new Artist( "Бундурчук Микола Андрійович"),
                    new Artist( "Симоненко Василь Сергійович"),
                    new Artist( "Баст Леонід Вікторович"),
                    new Artist( "Слон Максим Євгенійович")
            )
    );*/

    public List<Artist> artistsToGet = new ArrayList<>();
}
