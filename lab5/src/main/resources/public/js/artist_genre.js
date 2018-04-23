var app = angular.module("demo", []);

app.controller("ArtistGenreCtrl", function($scope, $http){
    $scope.artistGenres = [];
    $http.get('/api/artist/showAll').then(function (response){
        $scope.artistGenres=response.data;
        console.log(response);
    });


});



