package com.buzilov.databases5;

import com.buzilov.databases5.model.*;
import com.buzilov.databases5.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.sql.Date;
import java.util.List;

@Configuration
public class DataStorage {
    @Autowired
    ArtistRepository artistRepository;

    @Autowired
    ImpresarioRepository impresarioRepository;

    @Autowired
    CinemaRepository cinemaRepository;

    @Autowired
    ConcertHallRepository concertHallRepository;

    @Autowired
    CulturePalaceRepository culturePalaceRepository;

    @Autowired
    OrganizerRepository organizerRepository;

    @Autowired
    TheatreRepository theatreRepository;

    @Autowired
    CinemaMoviesRepository cinemaMoviesRepository;

    @PostConstruct
    public void init(){
        //artistRepository.saveAll(artists);
        /*artistsToGet = (List<Artist>)artistRepository.findAll();
        for (Artist a : artistsToGet)
            System.out.println(a);*/
        //impresarioRepository.saveAll(impresarios);
        //cinemaRepository.saveAll(cinemas);
        //concertHallRepository.saveAll(concertHalls);
        //culturePalaceRepository.saveAll(culturePalaces);
        //organizerRepository.saveAll(organizers);
        //theatreRepository.saveAll(theatres);
        /*List<Cinema> cinemasList = (List<Cinema>)cinemaRepository.findAll();
        for (int i = 0; i < cinemaMovies.size(); i++) {
            cinemaMovies.get(i).setCinema(cinemasList.get(i));
            cinemaMovies.get(i).setCinemaId(cinemasList.get(i).getId());
        }

        cinemaMoviesRepository.saveAll(cinemaMovies);*/
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

    public List<CinemaMovie> cinemaMovies = new ArrayList<>(
            Arrays.asList(
                    new CinemaMovie( "Перший фільм", Genre.Комедія,  LocalDate.of(2018, 1, 1)),
                    new CinemaMovie( "Другий фільм", Genre.Комедія,  LocalDate.of(2017, 12, 27)),
                    new CinemaMovie("Третій фільм", Genre.Боєвик,  LocalDate.of(2018, 3,4)),
                    new CinemaMovie("Четвертий фільм", Genre.Фантастика,  LocalDate.of(2018, 2,18)),
                    new CinemaMovie( "П'ятий фільм", Genre.Детектив,  LocalDate.of(2018, 2,21)),
                    new CinemaMovie( "Шостий фільм", Genre.Тріллер,  LocalDate.of(2018, 2,25)),
                    new CinemaMovie( "Сьомий фільм", Genre.Детектив,  LocalDate.of(2018, 2,23)),
                    new CinemaMovie( "Восьмий фільм", Genre.Фантастика,  LocalDate.of(2018, 2,27)),
                    new CinemaMovie( "Дев'ятий фільм", Genre.Комедія, LocalDate.of(2018, 2,10)),
                    new CinemaMovie( "Десятий фільм", Genre.Драма, LocalDate.of(2018, 2,15))
            )
    );

   /* public List<CinemaMovie> cinemaMovies = new ArrayList<>(
            Arrays.asList(
                    new CinemaMovie( "Перший фільм", Genre.Комедія, cinemas.get(0), LocalDate.of(2018, 1,-1)),
                    new CinemaMovie( "Другий фільм", Genre.Комедія, cinemas.get(1), LocalDate.of(2017-12-27)),
                    new CinemaMovie("Третій фільм", Genre.Боєвик, cinemas.get(2), LocalDate.of(2018, 3,4)),
                    new CinemaMovie("Четвертий фільм", Genre.Фантастика, cinemas.get(3), LocalDate.of(2018, 2,18)),
                    new CinemaMovie( "П'ятий фільм", Genre.Детектив, cinemas.get(4), LocalDate.of(2018, 2,21)),
                    new CinemaMovie( "Шостий фільм", Genre.Тріллер, cinemas.get(5), LocalDate.of(2018, 2,25)),
                    new CinemaMovie( "Сьомий фільм", Genre.Детектив, cinemas.get(6), LocalDate.of(2018, 2,23)),
                    new CinemaMovie( "Восьмий фільм", Genre.Фантастика, cinemas.get(7), LocalDate.of(2018, 2,27)),
                    new CinemaMovie( "Дев'ятий фільм", Genre.Комедія, cinemas.get(8), LocalDate.of(2018, 2,10)),
                    new CinemaMovie( "Десятий фільм", Genre.Драма, cinemas.get(9), LocalDate.of(2018, 2,15))
            )
    );*/

    public List<ConcertHall> concertHalls = new ArrayList<>(
            Arrays.asList(
                    new ConcertHall("Майданчик \"Перший\"", "вул. Майданчиків 1", 60),
                    new ConcertHall( "Майданчик \"Другий\"", "вул. Майданчиків 2", 70),
                    new ConcertHall( "Майданчик \"Третій\"", "вул. Майданчиків 3", 80),
                    new ConcertHall( "Майданчик \"Четвертий\"", "вул. Майданчиків 4", 90),
                    new ConcertHall( "Майданчик \"П'ятий\"", "вул. Майданчиків 5", 100),
                    new ConcertHall( "Майданчик \"Шостий\"", "вул. Майданчиків 6", 110),
                    new ConcertHall("Майданчик \"Сьомий\"", "вул. Майданчиків 7", 50),
                    new ConcertHall("Майданчик \"Восьмий\"", "вул. Майданчиків 8", 60),
                    new ConcertHall( "Майданчик \"Дев'ятий\"", "вул. Майданчиків 8", 70),
                    new ConcertHall( "Майданчик \"Десятий\"", "вул. Майданчиків 9", 80)
            )
    );

    public List<Organizer> organizers = new ArrayList<>(
            Arrays.asList(
                    new Organizer( "Нестійко Марина Василівна"),
                    new Organizer( "Марик Степан Васильович"),
                    new Organizer( "Гринюк Денис Денисович"),
                    new Organizer( "Деранчук Станіслав Ігоревич"),
                    new Organizer( "Ігорчук Ігор Ігоревич"),
                    new Organizer( "Стопанко Андрій Андрійович"),
                    new Organizer("Павленко Степан Павлович"),
                    new Organizer("Блунчук Лариса Іванівна"),
                    new Organizer( "Торба Олексій Валентинович"),
                    new Organizer( "Жаба Микола Андрійович"),
                    new Organizer("Санта Марія Григоріївна"),
                    new Organizer( "Дмитриченко Ксенія Леонідівна"),
                    new Organizer( "Дунай Григорій Васильович"),
                    new Organizer( "Мельничук Євген Євгенійович"),
                    new Organizer( "Охотник Олег Олегович")
            )
    );

/*
    public List<ConcertInHall> concertsInHall = new ArrayList<>(
            Arrays.asList(
                    new ConcertInHall(1, concertHalls.get(0), "Концерт №1", organizers.get(0), LocalDate.of(2018, 2,1)),
                    new ConcertInHall(2, concertHalls.get(0), "Концерт №2", organizers.get(1), LocalDate.of(2018, 2,3)),
                    new ConcertInHall(3, concertHalls.get(0), "Концерт №3", organizers.get(2), LocalDate.of(2018, 2,4)),
                    new ConcertInHall(4, concertHalls.get(1), "Концерт №4", organizers.get(3), LocalDate.of(2018, 2,6)),
                    new ConcertInHall(5, concertHalls.get(1), "Концерт №5", organizers.get(4), LocalDate.of(2018, 2,10)),
                    new ConcertInHall(6, concertHalls.get(2), "Концерт №6", organizers.get(5), LocalDate.of(2018, 2,12)),
                    new ConcertInHall(7, concertHalls.get(2), "Концерт №7", organizers.get(6), LocalDate.of(2018, 2,14)),
                    new ConcertInHall(8, concertHalls.get(3), "Концерт №8", organizers.get(7), LocalDate.of(2018, 2,15)),
                    new ConcertInHall(9, concertHalls.get(3), "Концерт №9", organizers.get(8), LocalDate.of(2018, 2,18)),
                    new ConcertInHall(10, concertHalls.get(4), "Концерт №10", organizers.get(9), LocalDate.of(2018, 2,21)),
                    new ConcertInHall(11, concertHalls.get(4), "Концерт №11", organizers.get(10), LocalDate.of(2018, 2,23)),
                    new ConcertInHall(12, concertHalls.get(5), "Концерт №12", organizers.get(11), LocalDate.of(2018, 2,23)),
                    new ConcertInHall(13, concertHalls.get(6), "Концерт №13", organizers.get(12), LocalDate.of(2018, 2,24)),
                    new ConcertInHall(14, concertHalls.get(7), "Концерт №14", organizers.get(13), LocalDate.of(2018, 2,25)),
                    new ConcertInHall(15, concertHalls.get(8), "Концерт №15", organizers.get(14), LocalDate.of(2018, 2,27)),
                    new ConcertInHall(16, concertHalls.get(9), "Концерт №16", organizers.get(0), LocalDate.of(2018, 2,27))
            )
    );*/

    public List<CulturePalace> culturePalaces = new ArrayList<>(
            Arrays.asList(
                    new CulturePalace( "Палац \"Диво\"", "вул. Палаців 1", 60),
                    new CulturePalace( "Палац \"Диво\"", "вул. Палаців 2", 70),
                    new CulturePalace( "Палац \"Неймовірний\"", "вул. Палаців 3", 60),
                    new CulturePalace( "Палац \"Чудовий\"", "вул. Палаців 4", 50),
                    new CulturePalace( "Палац \"Фантазія\"", "вул. Палаців 5", 70),
                    new CulturePalace( "Культурний центр \"Магія\"", "вул. Палаців 6", 120),
                    new CulturePalace( "Культурний центр \"Історичний\"", "вул. Палаців 7", 60),
                    new CulturePalace( "Палац \"Стрибок у минуле\"", "вул. Палаців 8", 90),
                    new CulturePalace( "Культурний центр \"Мальовничий\"", "вул. Палаців 9", 70),
                    new CulturePalace( "Палац \"Одинокий\"", "вул. Палаців 10", 60)
            )
    );


    /*public List<ContestInPalace> contestsInPalaces = new ArrayList<>(
            Arrays.asList(
                    new ContestInPalace(1, culturePalaces.get(0), "Конкурс-виставка \"Натюрморт\"", organizers.get(0), LocalDate.of(2018, 1,20)),
                    new ContestInPalace(2, culturePalaces.get(0), "Конкурс-виставка \"Різьблення\"", organizers.get(1), LocalDate.of(2018, 1,25)),
                    new ContestInPalace(3, culturePalaces.get(0), "Конкурс \"Портрет\"", organizers.get(2), LocalDate.of(2018, 2,1)),
                    new ContestInPalace(4, culturePalaces.get(2), "Конкурс \"Пейзаж\"", organizers.get(3), LocalDate.of(2018, 2,5)),
                    new ContestInPalace(5, culturePalaces.get(4), "Конкурс \"Диво-історія\"", organizers.get(4), LocalDate.of(2018, 2,10)),
                    new ContestInPalace(6, culturePalaces.get(5), "Конкурс \"Інший\"", organizers.get(5), LocalDate.of(2018, 1,14)),
                    new ContestInPalace(7, culturePalaces.get(6), "Конкурс \"Багатий\"", organizers.get(6), LocalDate.of(2018, 3,2))
            )
    );*/

    /*public List<ContestResults> contestResults = new ArrayList<>(
            Arrays.asList(
                    new ContestResults(contestsInPalaces.get(0), artists.get(11), 1, 'Y'),
                    new ContestResults(contestsInPalaces.get(0), artists.get(15), 2, 'Y'),
                    new ContestResults(contestsInPalaces.get(0), artists.get(16), 3, 'Y'),
                    new ContestResults(contestsInPalaces.get(0), artists.get(17), 4, 'N'),
                    new ContestResults(contestsInPalaces.get(0), artists.get(18), 5, 'N')
            )
    );*/


    public List<Theatre> theatres = new ArrayList<>(
            Arrays.asList(
                    new Theatre( "Театр \"Кобила\"", "площа Театральна 1", 50),
                    new Theatre( "Театр \"Класний\"", "площа Театральна 1", 50),
                    new Theatre( "Театр \"Класичний\"", "площа Театральна 1", 60),
                    new Theatre( "Театр \"Лісовик\"", "площа Театральна 2", 70),
                    new Theatre( "Театр \"Дивовижа\"", "площа Театральна 3", 80),
                    new Theatre( "Театр \"Ластівка\"", "площа Театральна 4", 90),
                    new Theatre( "Театр \"Гром\"", "площа Театральна 5", 100),
                    new Theatre( "Театр \"Молнія\"", "площа Театральна 6", 90),
                    new Theatre( "Театр \"Вогонь\"", "площа Театральна 7", 80),
                    new Theatre( "Театр \"На крихті льоду\"", "площа Театральна 8", 70)
            )
    );

    /*public List<TheatrePerformance> theatrePerformances = new ArrayList<>(
            Arrays.asList(
                    new TheatrePerformance(1, "Перший виступ", theatres.get(0), organizers.get(0), LocalDate.of(2018, 2,14)),
                    new TheatrePerformance(2, "Другий виступ", theatres.get(1), organizers.get(0), LocalDate.of(2018, 1,27)),
                    new TheatrePerformance(3, "Третій виступ", theatres.get(2), organizers.get(1), LocalDate.of(2018, 2,4)),
                    new TheatrePerformance(4, "Четвертий виступ", theatres.get(3), organizers.get(2), LocalDate.of(2018, 2,7)),
                    new TheatrePerformance(5, "П'ятий виступ", theatres.get(4), organizers.get(3), LocalDate.of(2018, 1,23)),
                    new TheatrePerformance(6, "Шостий виступ", theatres.get(5), organizers.get(4), LocalDate.of(2018, 3,2)),
                    new TheatrePerformance(7, "Сьомий виступ", theatres.get(6), organizers.get(5), LocalDate.of(2018, 3,3)),
                    new TheatrePerformance(8, "Восьмий виступ", theatres.get(7), organizers.get(6), LocalDate.of(2018, 3,4))
            )
    );*/

    public List<Artist> artistsToGet = new ArrayList<>();
}
