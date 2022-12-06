package com.groupeisi.metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.groupeisi.entities.User;


public class UserImpl implements IUser {

	@Override
	public int add(User user) {
		
		int nb = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite","root","");
			PreparedStatement pstm = con.prepareStatement("insert into user (email, password) values (?,?)");
			pstm.setString(1, user.getEmail());
			pstm.setString(2, user.getPassword());
			nb = pstm.executeUpdate();
			pstm.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return nb;
	}

	@Override
	public int update(User user) {
		int nb = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite","root","");
			PreparedStatement pstm = con.prepareStatement("update user set email = ?,password = ? where id = ?");
			pstm.setString(1, user.getEmail());
			pstm.setString(2, user.getPassword());
			pstm.setInt(3, user.getId());
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
				PreparedStatement pstm = con.prepareStatement("delete from user where id = ?");
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
	public List<User> getAllUser() {

		
		List<User> allUser = new ArrayList<User>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite","root","");
			PreparedStatement pstm = con.prepareStatement("select * from user");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setEmail(rs.getString("email"));
				user.setPassword(rs.getString("password"));
				allUser.add(user);
				
			}
			pstm.close();
			con.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return allUser;
	
	}

	

}
