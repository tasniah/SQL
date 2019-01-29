package com.naztech.DBconnection;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import io.mtech.dbUtil.DBOperation;
import io.mtech.model.User;
import io.mtech.service.UserDAOImpl;

public class DBConnectionTest {

 // @Test
public void insertTest() throws SQLException {
//		
////		User user =  new User();
////		user.setE_city("Dhaka");
////		user.setE_country("England");
////		user.setE_name("Plabita");
////		user.setE_salary(40000);
////		user.setE_id("20164087");
////		user.setE_zipCode(1205);
////		
////		DBOperation dbOperation =  new DBOperation();
////		assertEquals(user,dbOperation.addData(user));
////		
		User user1 =  new User();
		user1.setE_city("Patuakhali");
		user1.setE_country("Bangladesh");
		user1.setE_name("Keyaaa");
		user1.setE_salary(40000);
		user1.setE_id("20161063738");
		user1.setE_zipCode(1203);
		
	   UserDAOImpl u = new   UserDAOImpl();
		assertEquals(true,u.addUser(user1));
		
////		
////	    User user2 =  new User();
////     	user2.setE_city("Barisal");
////		user2.setE_country("Bangladesh");
////		user2.setE_name("Muna");
////		user2.setE_salary(45000);
////		user2.setE_id("20161024");
////		user2.setE_zipCode(1213);
////		
////		DBOperation dbOperation2=  new DBOperation();
////		assertEquals(user2,dbOperation2.addData(user2));
////		
//		
//		
//		
	}
	
	
//	@Test	
// public void deleteTest() throws SQLException {
//	
//		User user1 =  new User();
//		user1.setE_city("Patuakhali");
//		user1.setE_country("Bangladesh");
//		user1.setE_name("Keya");
//		user1.setE_salary(40000);
//		user1.setE_id("20161055");
//		user1.setE_zipCode(1203);
//		
//		DBOperation dbOperation=  new DBOperation();
//		assertEquals(1,dbOperation.deleteData(user1));
//	
//}
	
	
	//@Test	
public void updateTest() throws SQLException {
	
		User user =  new User();
        user.setE_city("Dhaka");
	     user.setE_country("England");
		user.setE_name("Plabita");
    	user.setE_salary(40000);
		user.setE_id("20164087");
		user.setE_zipCode(1205);
		
		DBOperation dbOperation=  new DBOperation();
		assertEquals(1,dbOperation.updateData(user));
	
}
   
	
	//@Test	
	public void testfindData() throws SQLException {
		
		User user1 =  new User();
	
		user1.setE_id("20161055");
			
		DBOperation dbOperation=  new DBOperation();
		
		assertTrue(dbOperation.FindData(user1));
		
	}
	
	
	//@Test	
	public void testWildcard() throws SQLException {
		
     	User user1 =  new User();

		user1.setE_country("Bangladesh");

		
		DBOperation dbOperation=  new DBOperation();
		
	    assertTrue(dbOperation.WildcardData(user1));
		
	}
	
	
	//@Test	
	public void testInnerJoin() throws SQLException {
		

		
		DBOperation dbOperation=  new DBOperation();
		
		
		 assertEquals(true, dbOperation.InnerJoin());
		
	}
	
	
	//@Test	
	public void testOuterJoin() throws SQLException {
		

		
		DBOperation dbOperation=  new DBOperation();
		
		
		 assertEquals(true, dbOperation.OuterJoin());
		
	}
	
	@Test	
	public void testHavingGroupbyCount() throws SQLException {
		

		
		DBOperation dbOperation=  new DBOperation();
		
		
		 assertEquals(true, dbOperation.HavingGroupbyCount());
		
	}
	
	
	
	
}
