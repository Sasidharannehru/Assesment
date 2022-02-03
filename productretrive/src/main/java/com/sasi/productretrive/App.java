

package com.sasi.productretrive;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class App {
	
	public static final String URLTOCONNECT = "jdbc:mysql://localhost:3306/company";

	public static final String USERNAME = "root";

	public static final String PASSWORD = "";
	
	private String qry;
	
	PreparedStatement thePreparedStatement;
	

	public static void main(String[] args) {
		

		try {
//			Load the Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Try establishing the connection
			Connection dbCon = DriverManager.getConnection(URLTOCONNECT, USERNAME, PASSWORD);
			
			Scanner scan = new Scanner(System.in);
			

			System.out.println("Enter the ID");
			
			int product_ID = scan.nextInt();
			
			new App().getProductDetailsByName(dbCon, product_ID);
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Problems while loading the driver or connecting to the database : " + e.getMessage());
		}

	}
	

	

	private void getProductDetailsByName(Connection dbCon, int product_ID) {
		qry = "select * from product where product_ID = ?";
		
		try {
			thePreparedStatement = dbCon.prepareStatement(qry);
			
			thePreparedStatement.setLong(1, product_ID);
			
			ResultSet rs = thePreparedStatement.executeQuery();
			
			while(rs.next()) {
				System.out.println("Id : " + rs.getString("product_Name") + ", number of pieces : " + rs.getInt("quantity"));
			}
			dbCon.close();
		} catch (SQLException e) {
			System.out.println("Issues while fetching student record : " + e.getMessage());
		}
		
		
		

	}
	
	
	
	
	
	
	
	

}
