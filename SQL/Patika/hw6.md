# Ödev6

### 1. Soru

> ```SQL
> SELECT AVG(rental_rate) FROM film;
> ```

### 2. Soru

> ```SQL
> SELECT COUNT(*) FROM film
>  WHERE title LIKE 'C%';
> ```

### 3. Soru

> ```SQL
> SELECT MAX(length) FROM film
> WHERE rental_rate = 0.99;
> ```

### 4. Soru

> ```SQL
> SELECT COUNT(DISTINCT replacement_cost)
> FROM film WHERE length > 150;
> ```
