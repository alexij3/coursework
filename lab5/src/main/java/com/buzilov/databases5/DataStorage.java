package com.buzilov.databases5;

import com.buzilov.databases5.model.Artist;
import com.buzilov.databases5.model.Cinema;
import com.buzilov.databases5.model.Impresario;
import com.buzilov.databases5.repositories.CinemaRepository;
import com.buzilov.databases5.repositories.artist.ArtistRepository;
import com.buzilov.databases5.repositories.impresario.ImpresarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

@Configuration
public class DataStorage {
    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    ImpresarioRepository impresarioRepository;

    @Autowired
    CinemaRepository cinemaRepository;

    @PostConstruct
    public void init(){
        //artistRepository.saveAll(artists);
        /*artistsToGet = (List<Artist>)artistRepository.findAll();
        for (Artist a : artistsToGet)
            System.out.println(a);*/
        //impresarioRepository.saveAll(impresarios);
        //cinemaRepository.saveAll(cinemas);

    }

    public List<Artist> artists = new ArrayList<>(
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
    );

    public List<Impresario> impresarios = new ArrayList<>(
            Arrays.asList(
                    new Impresario("Бабенко Петро Михайлович"),
                    new Impresario("Димитрук Світлана Вікторівна"),
                    new Impresario("Ягоненко Микола Іванович"),
                    new Impresario("Дрінь Ярослав Михайлович"),
                    new Impresario("Столяр Іван Андрійович"),
                    new Impresario("Мур Дмитро Павлович")

            )
    );

    public List<Cinema> cinemas = new ArrayList<>(
            Arrays.asList(
                    new Cinema( "Кінотеатр \"Парасолька\"", "вул. Перша 1", 100),
                    new Cinema( "Кінопалац \"Великий\"", "вул. Друга 2", 120),
                    new Cinema( "Кінотеатр \"Мудрець\"", "вул. Третя 3", 130),
                    new Cinema( "Кінотеатр \"Ум\"", "вул. Четверта 4", 120),
                    new Cinema( "Кінотеатр \"Стандарт\"", "вул. П'ята 5", 115),
                    new Cinema( "Кінотеатр \"Преміум\"", "вул. Шоста 6", 150),
                    new Cinema( "Кінотеатр \"Де-Люкс\"", "вул. Сьома 7", 200),
                    new Cinema( "Кінотеатр \"Домашній\"", "площа Перша 1", 140),
                    new Cinema( "Кінотеатр \"Міський\"", "площа Друга 2", 160),
                    new Cinema( "Кінопалац \"Малий\"", "площа Третя 3", 170)
            )
    );

    public List<Artist> artistsToGet = new ArrayList<>();
}
