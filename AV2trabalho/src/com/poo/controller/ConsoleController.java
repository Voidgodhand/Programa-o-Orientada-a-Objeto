package com.poo.controller;

import java.util.ArrayList;
import java.util.List;

import com.poo.dao.ConsoleDAO;
import com.poo.model.Console;

public class ConsoleController {
	
	public void create(Console console)
	{
		try{
			ConsoleDAO dao = new ConsoleDAO();
			dao.create(console);
		}
		finally {
			System.out.println("Fim inserção!");
		}
	}

	public List<Console> readAll()
	{
		List<Console> consoles = new ArrayList<Console>();
		try{
			ConsoleDAO dao = new ConsoleDAO();
			consoles = dao.readAll();		
		}
		finally {
			System.out.println("Fim da leitura!");
		}
		
		return consoles;
	}
	
	public void update(Console console)
	{
		try{
			ConsoleDAO dao = new ConsoleDAO();
			dao.update(console);
		}
		finally {
			System.out.println("Fim alteração!");
		}
	}
	
	public void delete(Console console)
	{
		try{
			ConsoleDAO dao = new ConsoleDAO();
			dao.delete(console);
		}
		finally {
			System.out.println("Fim remoção!");
		}
	}
}