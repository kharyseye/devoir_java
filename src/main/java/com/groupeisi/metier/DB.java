package com.groupeisi.metier;

import java.sql.Connection;
import java.sql.DriverManager;

	public class DB {
		Connection con ;
			
			public DB()
			{
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scolarite","root","");
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
			
			public Connection getConnection() {
				return con;
			}

}
