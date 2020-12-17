Create table `jogo`(
`codigo` int NOT NULL,
`nome` varchar(100),
`numero` int,
PRIMARY KEY (`codigo`),
FOREIGN KEY (`numero`) REFERENCES `console` (`numero`)
);