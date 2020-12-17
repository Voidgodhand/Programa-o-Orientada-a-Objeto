package com.poo.controller;

import java.util.ArrayList;
import java.util.List;

import com.poo.dao.JogoDAO;
import com.poo.model.Jogo;

public class JogoController {
	
	public void create(Jogo jogo)
	{
		try{
			JogoDAO dao = new JogoDAO();
			dao.create(jogo);
		}
		finally {
			System.out.println("Fim inserção!");
		}
	}

	public List<Jogo> readAll()
	{
		List<Jogo> jogos = new ArrayList<Jogo>();
		try{
			JogoDAO dao = new JogoDAO();
			jogos = dao.readAll();		
		}
		finally {
			System.out.println("Fim da leitura!");
		}
		
		return jogos;
	}
	
	public void update(Jogo jogo)
	{
		try{
			JogoDAO dao = new JogoDAO();
			dao.update(jogo);
		}
		finally {
			System.out.println("Fim alteração!");
		}
	}
	
	public void delete(Jogo jogo)
	{
		try{
			JogoDAO dao = new JogoDAO();
			dao.delete(jogo);
		}
		finally {
			System.out.println("Fim remoção!");
		}
	}
}