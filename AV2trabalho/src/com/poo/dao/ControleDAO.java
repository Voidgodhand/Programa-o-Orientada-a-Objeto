package com.poo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.poo.jdbc.ConnectionFactory;
import com.poo.model.Controle;

public class ControleDAO {
	
	public void create(Controle controle)
	{
		
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		
		String sql = "insert into controle(seq, cor, numero) values (?, ?, ?)";
		
		try{
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, controle.getSeq());
			stmt.setString(2, controle.getCor());
			stmt.setInt(3, controle.getNumero());
			
			stmt.executeUpdate();
			System.out.println("Controle incluido com sucesso!!");
		}
		catch(SQLException e)
		{
			e.printStackTrace();
			System.out.println("Erro ao tentar incluir Controle");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	
	}

	public List<Controle> readAll()
	{
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = " select seq, cor, numero from controle";
		List<Controle> controles = new ArrayList<Controle>();
		
		try{
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			while(rs.next())
			{
				Controle controle = new Controle();
				controle.setSeq(rs.getInt("seq"));
				controle.setCor(rs.getString("cor"));
				controle.setNumero(rs.getInt("numero"));
				
				controles.add(controle);
			}
		}
		catch(SQLException e)
		{
			System.out.println("Erro ao tentar ler tabela Controle");
		}
		finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
		
		return controles;
	}
	
	public void update (Controle controle) {
		Connection con = ConnectionFactory.getConnection();
		PreparedStatement stmt = null;
	    String sql = "update controle set cor=?, numero=? where seq=?";
	    try {
	    	stmt = con.prepareStatement(sql);
	        stmt.setString(1, controle.getCor());
	        stmt.setInt(2, controle.getNumero());
	        stmt.setInt(3, controle.getSeq());
	        stmt.executeUpdate();
	    } catch (SQLException e) {
	    	System.out.println("Erro ao tentar alterar tabela controle");
	    }
	    finally {
			ConnectionFactory.closeConnection(con, stmt);
		}
	}
	
	 public void delete(Controle controle) {
		 Connection con = ConnectionFactory.getConnection();
		 PreparedStatement stmt = null;
		 String sql = "delete from controle where seq=?";
         try {
        	 stmt = con.prepareStatement(sql);
             stmt.setInt(1, controle.getSeq());
             stmt.executeUpdate();
             stmt.close();
         } catch (SQLException e) {
        	 System.out.println("Erro ao tentar remover da tabela controle");
         }
         finally {
 			ConnectionFactory.closeConnection(con, stmt);
 		}
     }
	
}