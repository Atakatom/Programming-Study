# Ödev9

### 1. Soru

> ```SQL
> SELECT city, country FROM country
>  INNER JOIN city AS c
>     ON c.country_id = country.country_id;
> ```

### 2. Soru

> ```SQL
> SELECT p.payment_id, c.first_name, c.last_name
>   FROM payment AS p
>  INNER JOIN customer AS c
>     ON c.customer_id = p.customer_id;
> ```

### 3. Soru

> ```SQL
> SELECT r.rental_id, c.first_name, c.last_name
>   FROM rental AS r
>  INNER JOIN customer AS c
>     ON c.customer_id = r.customer_id;
> ```
