package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Jogo;

public class JogoDAO {
	
	public void create(Jogo jogo)
	{
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into jogo(codigo, nome, numero) values (?, ?, ?)";
		
		try{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, jogo.getCodigo());
			stmt.setString(2, jogo.getNome());
			stmt.setInt(3, jogo.getNumero());
			
			stmt.executeUpdate();
			System.out.println("Jogo incluido com sucesso!!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir jogo");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	
	}

	public List<Jogo> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = " select codigo, nome, numero from jogo";
		List<Jogo> jogos = new ArrayList<Jogo>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Jogo jogo = new Jogo();
				jogo.setCodigo(rs.getInt("codigo"));
				jogo.setNome(rs.getString("nome"));
				jogo.setNumero(rs.getInt("numero"));
				
				jogos.add(jogo);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro ao tentar ler tabela Jogo");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		return jogos;
	}
	
	public void update (Jogo jogo) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
	    String sql = "update jogo set nome=?, numero=? where codigo=?";
	    try {
	    	stmt = con.prepareStatement(sql);
	        stmt.setString(1, jogo.getNome());
	        stmt.setInt(2, jogo.getNumero());
	        stmt.setInt(3, jogo.getCodigo());
	        stmt.executeUpdate();
	    } catch (SQLException e) {
	    	System.out.println("Erro ao tentar alterar tabela jogo");
	    }
	    finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	 public void delete(Jogo jogo) {
		 Connection con = ConnectionFactory.getConnection();
		 PreparedStatement stmt = null;
		 String sql = "delete from jogo where codigo=?";
         try {
        	 stmt = con.prepareStatement(sql);
             stmt.setInt(1, jogo.getCodigo());
             stmt.executeUpdate();
             stmt.close();
         } catch (SQLException e) {
        	 System.out.println("Erro ao tentar remover da tabela jogo");
         }
         finally {
 			ConnectionFactory.closeConnection(con, stmt);
 		}
     }
	
}