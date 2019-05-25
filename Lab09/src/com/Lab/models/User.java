package com.Lab.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class User {
	  
	public String login(String userN, String passW) {
		Connection con= null;
		Statement statement = null;
		ResultSet resultset = null;
		
		String userNameDB="";
		String password="";
		
		try {
			con=DBConnetion.createConnection();
			statement = con.createStatement();
			resultset = statement.executeQuery("select nameUsers,");
			
			while(resultset.next()) {
				userNameDB=resultset.getNString("nameUsers");
				userNameDB=resultset.getNString("nameUsers");
			}
			
		}
	}
}