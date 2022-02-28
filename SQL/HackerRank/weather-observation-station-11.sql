-- https://www.hackerrank.com/challenges/weather-observation-station-11/problem

SELECT DISTINCT city FROM station WHERE RIGHT(city,1) NOT IN ('a','e','i','o','u') OR LEFT(city,1) NOT IN ('a','e','i','o','u')