package fr.adaming.spanc.dao.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.adaming.spanc.dao.IGeneriqueDao;
import fr.adaming.spanc.entites.Adresse;
import fr.adaming.spanc.entites.Usager;

public class AdresseDaoImpl implements IGeneriqueDao<Adresse, Integer, String> {

	@PersistenceContext
	private EntityManager entityManager;
	
	private final Logger LOGGER =  Logger.getLogger("AdresseDaoImpl");
	
	@Override
	public Adresse creer(Adresse adresse) {
		// TODO Auto-generated method stub
		entityManager.persist(adresse);
		LOGGER.info("Ajout d'une adresse dans la base de donn�es.");
		return adresse;
	}

	@Override
	public void supprimer(Integer id) {
		// TODO Auto-generated method stub
		Adresse adresse = rechercherUn(id);
		//List<Usager> usagers = rechercherTout();
		entityManager.remove(adresse);
		LOGGER.info("L'adresse a �t� supprim�e de la base de donn�es.");
	}

	@Override
	public Adresse modifier(Adresse adresse) {
		// TODO Auto-generated method stub
		entityManager.merge(adresse);
		LOGGER.info("Les modifications de l'adresse ont �t� enregistr�es dans la base de donn�es.");
		return adresse;
	}

	@Override
	public Adresse rechercherUn(Integer id) {
		// TODO Auto-generated method stub
		Adresse adresse = entityManager.find(Adresse.class, id);
		LOGGER.info("R�cup�ration d'une adresse � partir de l'identifiant n� "+id +".");
		return adresse;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Adresse> rechercherTout() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("From Adresse");
		return query.getResultList();
	}

	@Override
	public List<Adresse> rechercherParMot(String mot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adresse associer(Integer id1, Integer id2) {
		// TODO Auto-generated method stub
		return null;
	}

}
