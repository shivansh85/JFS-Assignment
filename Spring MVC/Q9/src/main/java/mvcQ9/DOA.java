package mvcQ9;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.stereotype.Repository;

@Repository
public class DOA {
	private Connection con;
	
	public  DOA() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	   	    this.con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "");
			}catch (Exception e) {
				// TODO: handle exception
			}
	}
	
	public ResultSet getDetails() throws Exception{
		PreparedStatement preparedStatement= con.prepareStatement("select * from employee");
		ResultSet resultSet=preparedStatement.executeQuery();
		return resultSet;
	}

	
	}