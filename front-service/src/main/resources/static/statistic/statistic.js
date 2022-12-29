angular.module('market-front').controller('statisticController', function ($scope, $http) {
    const contextPath = 'http://localhost:5555/stat/';


   $$scope.loadStatistic = function () {
            $http.get(contextPath + 'api/v1/statistic')
                .then(function (response) {
                    $scope.TopProductCart = response.data;
                });
        }

        $scope.loadStatistic();
    });