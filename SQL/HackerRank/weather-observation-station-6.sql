-- https://www.hackerrank.com/challenges/weather-observation-station-6/problem

SELECT DISTINCT city FROM station WHERE LOWER(SUBSTR(city,1,1)) IN ('a','e','i','o','u')