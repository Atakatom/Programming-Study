# Ödev1

### 1. Soru

> ```SQL
> SELECT title,description FROM film;
> ```

### 2. Soru

> ```SQL
>  SELECT * FROM film
>   WHERE length
> BETWEEN 61 AND 74;
> ```

### 3. Soru

> ```SQL
> SELECT * FROM film
>  WHERE rental_rate =  0.99
>    AND replacement_cost IN (12.99,28.99)
> ```

### 4. Soru

> ```SQL
> SELECT last_name FROM customer
> WHERE first_name = 'Mary';
> -- cevap : Smith
> ```

### 5. Soru

> ```SQL
> SELECT * FROM film
> WHERE length <= 50
> AND rental_rate NOT IN (2.99,4.99);
> ```
