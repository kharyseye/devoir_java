package com.groupeisi.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.groupeisi.entities.Inscription;
import com.groupeisi.entities.User;


public class InscriptionImpl implements IInscription {

	@Override
	public int add(Inscription inscription) {
		
		int nb = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite","root","");
			PreparedStatement pstm = con.prepareStatement("insert into inscription (date, classe) values (?,?)");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
			pstm.setString(1, sdf.format(inscription.getDate()));
			pstm.setString(2, inscription.getClasse());
			nb = pstm.executeUpdate();
			pstm.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return nb;
	}

	@Override
	public int update(Inscription inscription) {
		
		int nb = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite","root","");
			PreparedStatement pstm = con.prepareStatement("update inscription set date = ?, classe = ? where id = ?");
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
			pstm.setString(1, sdf.format(inscription.getDate()));
			pstm.setString(2, inscription.getClasse());
			pstm.setInt(3, inscription.getId());
			nb = pstm.executeUpdate();
			pstm.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return nb;		 
	}

	@Override
	public int delete(int id) {
		
		int nb = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite","root","");
			PreparedStatement pstm = con.prepareStatement("delete from inscription where id = ?");
			pstm.setInt(1, id);
			nb = pstm.executeUpdate();
			pstm.close();
			con.close();
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
		return nb;	
	
	}


	@Override
	public List<Inscription> getAllInscription() {
		
		List<Inscription> allInscription = new ArrayList<Inscription>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite","root","");
			PreparedStatement pstm = con.prepareStatement("select * from inscription");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				Inscription inscription = new Inscription();
			inscription.setId(rs.getInt("id"));
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); 
			pstm.setString(1, sdf.format(inscription.getDate()));
			inscription.setClasse(rs.getString("classe"));
			allInscription.add(inscription);
				
			}
			pstm.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allInscription;
		
	}
	

}
