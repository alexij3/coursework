var app = angular.module("demo", []);

app.controller("ArtistCtrl", function($scope, $http){

    $scope.artists = [];
     $http.get('/api/artist/showAll').then(function (response){
        $scope.artists=response.data;
        console.log(response);
    });

    this.deleteArtist = function deleteArtist(id){
        $http.get('/api/artist/delete?id=' + id).then(function(){
            window.location.reload();
            console.log("deleted artist with id " + id);
        });
    };

    this.createArtist = function createArtist(){
        var name = document.getElementById('artistName').value;
        $http.get('/api/artist/create?name=' + name).success(
            console.log('created artist with name ' + name)
        ).then(function(){
            window.parent.location.reload();
        });
    }
});



