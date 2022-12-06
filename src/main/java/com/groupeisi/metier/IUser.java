package com.groupeisi.metier;

import java.util.List;

import com.groupeisi.entities.User;

public interface IUser {
	public int add(User user);
	public int update(User user);
	public int delete(int id);
	public List<User> getAllUser();

}
