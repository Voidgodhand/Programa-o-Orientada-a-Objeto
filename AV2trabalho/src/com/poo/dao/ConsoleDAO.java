package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Console;

public class ConsoleDAO {
	
	public void create(Console console)
	{
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into console(numero, nome) values (?, ?)";
		
		try{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, console.getNumero());
			stmt.setString(2, console.getNome());
			
			stmt.executeUpdate();
			System.out.println("Console incluido com sucesso!!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir console");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	
	}

	public List<Console> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = " select numero, nome from console";
		List<Console> consoles = new ArrayList<Console>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Console console = new Console();
				console.setNumero(rs.getInt("numero"));
				console.setNome(rs.getString("nome"));
				
				consoles.add(console);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro ao tentar ler tabela console");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		return consoles;
	}
	
	public void update (Console console) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
	    String sql = "update console set nome=? where numero=?";
	    try {
	    	stmt = con.prepareStatement(sql);
	        stmt.setString(1, console.getNome());
	        stmt.setInt(2, console.getNumero());
	        stmt.executeUpdate();
	    } catch (SQLException e) {
	    	System.out.println("Erro ao tentar alterar tabela console");
	    }
	    finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	 public void delete(Console console) {
		 Connection con = ConnectionFactory.getConnection();
		 PreparedStatement stmt = null;
		 String sql = "delete from console where numero=?";
         try {
        	 stmt = con.prepareStatement(sql);
             stmt.setInt(1, console.getNumero());
             stmt.executeUpdate();
             stmt.close();
         } catch (SQLException e) {
        	 System.out.println("Erro ao tentar remover da tabela console");
         }
         finally {
 			ConnectionFactory.closeConnection(con, stmt);
 		}
     }
	
}