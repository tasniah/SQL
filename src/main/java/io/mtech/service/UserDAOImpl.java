package io.mtech.service;


import java.sql.SQLException;

import io.mtech.dao.UserDAO;
import io.mtech.dbUtil.DBOperation;
import io.mtech.model.User;


public class UserDAOImpl implements UserDAO{

	public boolean addUser(User user) {
		DBOperation dbOperations = new DBOperation();
		
		try {
			dbOperations.addData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	
	public boolean deleteUser(User user) {
    DBOperation dbOperations = new DBOperation();
    
		
		try {
			dbOperations.deleteData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
     DBOperation dbOperations = new DBOperation();
    
		
		try {
			dbOperations.updateData(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
	}

	public boolean userFindById(User user) {
		// TODO Auto-generated method stub
   DBOperation dbOperations = new DBOperation();
    
		
		try {
			return dbOperations.FindData(user);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
		
	}	
		public boolean wildcard(User user) {
			// TODO Auto-generated method stub
	   DBOperation dbOperations = new DBOperation();
	    
			
			try {
				return dbOperations.WildcardData(user);
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		
		
		
		
	}




	

}
