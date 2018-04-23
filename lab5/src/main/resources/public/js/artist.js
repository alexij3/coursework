var app = angular.module("demo", []);

app.controller("ArtistCtrl", function($scope, $http){
    var idToUpdate;
    var genres = [];

    $scope.artists = [];
     $http.get('/api/artist/showAll').then(function (response){
        $scope.artists=response.data;
        console.log(response);
    });

    this.deleteArtist = function deleteArtist(id){
        $http.get('/api/artist/delete?id=' + id).then(function(){
            console.log("deleted artist with id " + id);
            window.location.reload();
        });
    };

    this.createArtist = function createArtist(){
        console.log("In createartist()");
        var name = document.getElementById('artistName').value;
        genres = $scope.selectedGenres;

        var createRequest = {
            method: 'PUT',
            url: '/api/artist/create',
            data: {
                name: name,
                genreSet : genres,
                impresarioSet : []
            }
        };

        $http(createRequest).then(function(){
            console.log('created artist with name ' + name);

        });

        genres = [];
        window.location.reload();
    };

    this.startUpdateArtist = function startUpdateArtist(id){
        idToUpdate = id;
    };

    this.updateArtist = function updateArtist(){
        var name = document.getElementById('updateArtistName').value;
        var request = {
            method: 'POST',
            url : '/api/artist/update?id=' + idToUpdate,
            data: {
                name : name
            }
        };

        $http(request).then(function (response){
            console.log(response);
        });

        window.location.reload();
    }
});



