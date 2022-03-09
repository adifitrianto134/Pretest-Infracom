How to Run :

- Open Eclipse IDE
- pilih file -> import -> GIT -> project from GIT (with smart import)
- Open mysql workbench, create database connection dengan port 127.0.0.1:3306 dan password 'root', lalu create schema dengan nama 'pretestinfracom'
- setelah create schema, create table - table yg dibutuhkan pada schema tersebut menggunakan DDL beriukt :
CREATE TABLE `user` (
   `id` varchar(20) NOT NULL,
   `name` varchar(100) NOT NULL,
   `age` int NOT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
 
CREATE TABLE `user_contact` (
   `id` varchar(50) NOT NULL,
   `address` varchar(100) NOT NULL,
   `user_id` varchar(50) NOT NULL,
   PRIMARY KEY (`id`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci
 
- Go to eclipse, klik kanan pada file PretestApplication.java di eclipse, 
pilih Run As, pilih Run Configuration, klik Run.
