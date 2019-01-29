package io.mtech.dao;

import io.mtech.model.User;

public interface UserDAO {
	boolean addUser(User User) ;
	boolean deleteUser(User User);
	boolean updateUser(User User);
	boolean userFindById(User User);
	boolean wildcard(User User) ;
	boolean InnerJoin();

}


