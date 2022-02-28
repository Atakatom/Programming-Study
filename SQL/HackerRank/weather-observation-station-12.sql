-- https://www.hackerrank.com/challenges/weather-observation-station-12/problem

SELECT DISTINCT city FROM station WHERE RIGHT(city,1) NOT IN ('a','e','i','o','u') AND LEFT(city,1) NOT IN ('a','e','i','o','u')