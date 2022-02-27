# Ödev8

### Test veritabanını oluştur

> ```SQL
> CREATE DATABASE test;
> ```

### Employee tablosunu oluştur

> ```SQL
> CREATE TABLE employee(
>   id          INTEGER,
>   name        VARCHAR(50),
>   birthday    DATE,
>   mail        VARCHAR(100)
> );
> ```

### Mackaroo sitesinden elde edilen veriler

<center>
<details><summary>50 employee</summary>

> ```SQL
> INSERT INTO employee (id, name, birthday, email) VALUES (1, 'Lissy', '25/05/1973', 'lnoddles0@over-blog.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (2, 'Mackenzie', '25/04/1965', 'mcholonin1@ftc.gov');
> INSERT INTO employee (id, name, birthday, email) VALUES (3, 'Shellysheldon', '01/02/1973', 'srodgman2@comsenz.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (4, 'Wilow', '17/02/1968', 'wkellaway3@fotki.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (5, 'Sibley', '28/11/1995', 'spolamontayne4@eepurl.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (6, 'Julita', '19/10/1991', 'jgraalmans5@pbs.org');
> INSERT INTO employee (id, name, birthday, email) VALUES (7, 'Gaylor', '02/08/1978', 'garlidge6@cafepress.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (8, 'Gunar', '23/03/1972', 'gyallop7@123-reg.co.uk');
> INSERT INTO employee (id, name, birthday, email) VALUES (9, 'Siward', '24/12/1977', 'swells8@slashdot.org');
> INSERT INTO employee (id, name, birthday, email) VALUES (10, 'Guthry', '27/10/1967', 'gscrivens9@godaddy.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (11, 'Anthea', '23/08/1978', 'afulkesa@github.io');
> INSERT INTO employee (id, name, birthday, email) VALUES (12, 'Brinna', '10/08/1999', 'bseamanb@mit.edu');
> INSERT INTO employee (id, name, birthday, email) VALUES (13, 'Alwin', '13/09/1978', 'alandmanc@simplemachines.org');
> INSERT INTO employee (id, name, birthday, email) VALUES (14, 'Irena', '30/04/1991', 'ileithgoed@techcrunch.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (15, 'Papagena', '13/06/1967', 'pworsleye@istockphoto.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (16, 'Joletta', '07/12/1995', 'jcritchellf@networksolutions.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (17, 'Gilles', '19/03/2000', 'gkleyng@europa.eu');
> INSERT INTO employee (id, name, birthday, email) VALUES (18, 'Dixie', '22/10/1974', 'dlindlh@google.com.hk');
> INSERT INTO employee (id, name, birthday, email) VALUES (19, 'Hermie', '06/08/1967', 'hmaymondi@mtv.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (20, 'Correna', '09/08/1990', 'crosensteinj@skype.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (21, 'Kahlil', '21/04/1977', 'khiddsleyk@vinaora.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (22, 'Derby', '27/07/1966', 'dhunl@umn.edu');
> INSERT INTO employee (id, name, birthday, email) VALUES (23, 'Alexandrina', '10/10/1999', 'arickerm@wired.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (24, 'Gerrard', '26/02/1982', 'gnewbandn@ameblo.jp');
> INSERT INTO employee (id, name, birthday, email) VALUES (25, 'Alicea', '12/02/1996', 'agodlontono@typepad.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (26, 'Aime', '10/05/1989', 'afrostickp@1und1.de');
> INSERT INTO employee (id, name, birthday, email) VALUES (27, 'Madella', '01/08/1978', 'mcollingdonq@ibm.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (28, 'Tymon', '26/09/1964', 'tkharchinskir@alibaba.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (29, 'Gasparo', '19/09/1970', 'gdowdeswells@hexun.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (30, 'Robinet', '18/12/1987', 'rpeerst@weibo.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (31, 'Tracy', '07/10/1963', 'thaggieu@java.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (32, 'Ahmed', '14/06/1980', 'akleisv@nps.gov');
> INSERT INTO employee (id, name, birthday, email) VALUES (33, 'Tallou', '17/05/1961', 'tloudw@storify.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (34, 'Cecily', '07/02/1994', 'cmaclesex@trellian.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (35, 'Jodee', '28/10/1980', 'jlatliffy@deviantart.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (36, 'Jenna', '17/02/1973', 'jdufferz@alexa.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (37, 'Lura', '25/01/1983', 'lwatting10@wix.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (38, 'Freddi', '11/02/1966', 'fcastelyn11@bloglines.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (39, 'Fredric', '19/03/1969', 'ffriett12@bloglines.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (40, 'Aviva', '12/07/1966', 'asherry13@yandex.ru');
> INSERT INTO employee (id, name, birthday, email) VALUES (41, 'Gloriane', '25/03/1961', 'gwastling14@gnu.org');
> INSERT INTO employee (id, name, birthday, email) VALUES (42, 'Walton', '23/09/1979', 'wjuschke15@webeden.co.uk');
> INSERT INTO employee (id, name, birthday, email) VALUES (43, 'Haleigh', '24/03/1979', 'hspillard16@eepurl.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (44, 'Sammie', '24/09/1974', 'shadeke17@geocities.jp');
> INSERT INTO employee (id, name, birthday, email) VALUES (45, 'Deanne', '09/01/1967', 'drooper18@hhs.gov');
> INSERT INTO employee (id, name, birthday, email) VALUES (46, 'Giustina', '10/01/1969', 'gzelner19@who.int');
> INSERT INTO employee (id, name, birthday, email) VALUES (47, 'Alonzo', '16/04/1977', 'aing1a@mysql.com');
> INSERT INTO employee (id, name, birthday, email) VALUES (48, 'Jamal', '09/08/1979', 'jgasker1b@imageshack.us');
> INSERT INTO employee (id, name, birthday, email) VALUES (49, 'Shari', '16/03/1962', 'smartensen1c@google.it');
> INSERT INTO employee (id, name, birthday, email) VALUES (50, 'Doug', '02/03/1961', 'dpoag1d@istockphoto.com');
> ```

</details>
</center>

### 5 farklı update sorgusu

> ```SQL
> UPDATE employee SET name = 'Hal' WHERE name LIKE 'Hal%';
> UPDATE employee SET name = 'Old' WHERE birthday = (SELECT MAX(birthday) FROM employee);
> UPDATE employee SET email = 'google' WHERE email LIKE '%google%';
> UPDATE employee SET name = 'Youngster' WHERE birthday = (SELECT MIN(birthday) FROM employee);
> UPDATE employee SET id = 1001 WHERE id = 1;
> ```

### 5 farklı delete sorgusu

> ```SQL
> DELETE FROM employee WHERE name = 'Hal';
> DELETE FROM employee WHERE name = 'Old';
> DELETE FROM employee WHERE email = 'google';
> DELETE FROM employee WHERE name = 'Youngster';
> DELETE FROM employee WHERE id = 1001;
> ```
