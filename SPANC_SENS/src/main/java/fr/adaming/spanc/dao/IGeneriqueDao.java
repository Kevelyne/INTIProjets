package fr.adaming.spanc.dao;

import java.util.List;

public interface IGeneriqueDao <T, D, S> {
	
	T creer(T t);
	
	void supprimer(D d);
	
	T modifier(T t);
	
	T rechercherUn(D d);
	
	List<T> rechercherTout();
	
	List<T> rechercherParMot(S s);
	
	T associer(D id1, D id2);

}
