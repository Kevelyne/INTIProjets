package fr.adaming.spanc.services;

import java.util.List;

import fr.adaming.spanc.exceptions.ListeVideException;

public interface IGeneriqueService <T, D, S> {

	T creer(T t);
	
	void supprimer(D d);
	
	T modifier(T t);
	
	T rechercherUn(D d);
	
	List<T> rechercherTout();
	
	List<T> rechercherParMot(S s) throws ListeVideException;
	
	T associer(D id1, D id2);
	
}
