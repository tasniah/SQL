package io.mtech.dbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import io.mtech.model.User;

public class DBOperation {
	
	
	
	public void addData(User user1) throws SQLException {
	      DBConnection conn =  DBConnection.getInstance();
			
			Connection dbConnection = conn.getConnection();
			
			
			String insertSQL = "INSERT INTO [dbo].[Employee_Tasniah]"
					+ "(e_name,e_id,e_salary,e_country,e_city,e_zipCode) VALUES"
					+ "(?,?,?,?,?,?)";
			
			PreparedStatement preparedStatement = dbConnection.prepareStatement(insertSQL);
			
			preparedStatement.setString(1, user1.getE_name());
			preparedStatement.setString(2, user1.getE_id());
			preparedStatement.setInt(3,user1.getE_salary());
			preparedStatement.setString(4, user1.getE_country());
			preparedStatement.setString(5, user1.getE_city());
			preparedStatement.setInt(6, user1.getE_zipCode());
			preparedStatement .execute();
			
			//return user1;
	}
	
	
	
	public int deleteData(User user1) throws SQLException {
	      DBConnection conn =  DBConnection.getInstance();
			
			Connection dbConnection = conn.getConnection();
			
	
			
		
		      String query = "delete from [dbo].[Employee_Tasniah] where e_name = ?";
		      PreparedStatement preparedStatement = dbConnection.prepareStatement(query);
		  
		      preparedStatement.setString(1, "keya");

		  
		     return preparedStatement.executeUpdate();
		     
		  
			
	}
	
	
	public boolean FindData(User user1) throws SQLException {
	      DBConnection conn =  DBConnection.getInstance();
			
			Connection dbConnection = conn.getConnection();
			
	         String i=user1.getE_id();
			// String i="355";
	         //System.out.print(i);

		
		    
		      String str="select * from Employee_Tasniah where e_id=?";
		    
		     
		     
		     PreparedStatement preparedStatement1 = dbConnection.prepareStatement(str);
		    	 preparedStatement1.setString(1, i);
			      preparedStatement1.execute();
			      ResultSet r=preparedStatement1.getResultSet();
			      while(r.next()) {
			    	  String n=r.getString("e_name");
			    	  String m=r.getString("e_id");
			    	  int q=r.getInt("e_salary");
			    	  String p=r.getString("e_country");
			    	  String x=r.getString("e_city");
			    	  int z=r.getInt("e_zipcode");
			    	  if(n!=null && m!=null  ) return true;
			    	
			      }
			      System.out.print(r);
			    
			  
			       return false;
			  
		     
		     
		  
			
	}
	
	public int updateData(User user1) throws SQLException {
	      DBConnection conn =  DBConnection.getInstance();
			
			Connection dbConnection = conn.getConnection();
			
	
			
		
			String query = "update [dbo].[Employee_Tasniah] SET e_zipCode = 6455  where e_name = ?";
		      PreparedStatement preparedStatement = dbConnection.prepareStatement(query);
		    
		      preparedStatement.setString(1, "Plabita");

		    
		     return preparedStatement.executeUpdate();
		     
		  
			
	}
	
	public boolean WildcardData(User user1) throws SQLException {
	      DBConnection conn =  DBConnection.getInstance();
			
			Connection dbConnection = conn.getConnection();
			
	
			
			
			String str="Ban%";
			String query = "SELECT * FROM [dbo].[Employee_Tasniah] where e_city LIKE ? ";
		      PreparedStatement preparedStatement = dbConnection.prepareStatement(query);
		      
		
		      
		     
		      preparedStatement.setString(1,str);

		   
		     return preparedStatement.execute();
		     
		  
			
	}
	
	
	
	
	
	
	
	
}
			
	