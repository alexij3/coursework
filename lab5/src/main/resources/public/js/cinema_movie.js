var app = angular.module("demo", []);

app.controller("CinemaMovieCtrl", function($scope, $http){
    var idToUpdate;

    $scope.cinemaMovies = [];
     $http.get('/api/cinemamovie/showAll').then(function (response){
        $scope.cinemaMovies=response.data;
        console.log(response);
    });

    this.deleteCinemaMovie = function deleteCinemaMovie(id){
        $http.get('/api/cinemamovie/delete?id=' + id).then(function(response){
            console.log(response);
            window.location.reload();

        });
    };

    this.startCreateCinemaMovie = function startCreateCinemaMovie(){
        $http.get('/api/cinema/showAll').then(function(response){
            console.log(response);
            var cinemas = response.data;
            var select = document.getElementById('CinemaMovieCinema');

            for (var i = 0; i < cinemas.length; i++){
                var option = document.createElement("option");
                option.text = cinemas[i].name;
                option.value = cinemas[i].id;
                select.add(option);
                console.log(select);
            }

        });
    };

    this.createCinemaMovie = function createCinemaMovie(){
        var cinemaId = document.getElementById('CinemaMovieCinema').value;
        var name = document.getElementById('CinemaMovieName').value;
        var genre = document.getElementById('CinemaMovieGenre').value;
        var date = document.getElementById('datePicker').value;

        var request = {
            method: 'POST',
            url: '/api/cinemamovie/create',
            data: {
                name : name,
                genre: genre,
                cinemaId: cinemaId,
                date: date
            }

        };

        $http(request).then(function(response){
            console.log(response);
        })
    };

    this.startUpdateCinemaMovie = function startUpdateCinemaMovie(id, name, genre, capacity){
        document.getElementById('updateCinemaMovieName').value = name;
        document.getElementById('updateCinemaMovieAddress').value = address;
        document.getElementById('updateCinemaMovieCapacity').value = capacity;

        idToUpdate = id;
    };

    this.updateCinemaMovie = function updateCinemaMovie(){
        var name = document.getElementById('updateCinemaMovieName').value;
        var address = document.getElementById('updateCinemaMovieAddress').value;
        var capacity = document.getElementById('updateCinemaMovieCapacity').value;

        var request = {
            method: 'POST',
            url : '/api/cinemamovie/update?id=' + idToUpdate,
            data: {
                name : name,
                address : address,
                capacity : capacity
            }
        };

        $http(request).then(function (response){
            console.log(response);
        })
    }
});



