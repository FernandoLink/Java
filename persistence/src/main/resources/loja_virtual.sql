show databases;
CREATE DATABASE loja_virtual;
USE loja_virtual;
CREATE TABLE PRODUTO (id INT AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, descricao VARCHAR(255), PRIMARY KEY(id)) Engine = InnoDb;

