package com.poo.controller;

import java.util.ArrayList;
import java.util.List;

import com.poo.dao.ControleDAO;
import com.poo.model.Controle;

public class ControleController {
	
	public void create(Controle controle)
	{
		try{
			ControleDAO dao = new ControleDAO();
			dao.create(controle);
		}
		finally {
			System.out.println("Fim inserção!");
		}
	}

	public List<Controle> readAll()
	{
		List<Controle> controles = new ArrayList<Controle>();
		try{
			ControleDAO dao = new ControleDAO();
			controles = dao.readAll();		
		}
		finally {
			System.out.println("Fim da leitura!");
		}
		
		return controles;
	}
	
	public void update(Controle controle)
	{
		try{
			ControleDAO dao = new ControleDAO();
			dao.update(controle);
		}
		finally {
			System.out.println("Fim alteração!");
		}
	}
	
	public void delete(Controle controle)
	{
		try{
			ControleDAO dao = new ControleDAO();
			dao.delete(controle);
		}
		finally {
			System.out.println("Fim remoção!");
		}
	}
}