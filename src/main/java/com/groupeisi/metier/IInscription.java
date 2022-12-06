package com.groupeisi.metier;

import java.util.List;

import com.groupeisi.entities.Inscription;

public interface IInscription {
	
	public int add(Inscription inscription);
	public int update(Inscription inscription);
	public int delete(int id);
	public List<Inscription> getAllInscription();

}
