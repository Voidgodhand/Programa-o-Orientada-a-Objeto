Create table `controle`(
`seq` int NOT NULL,
`cor` varchar(30),
`numero` int,
PRIMARY KEY (`seq`),
FOREIGN KEY (`numero`) REFERENCES `console` (`numero`)
);