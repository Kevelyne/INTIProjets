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
		LOGGER.info("Ajout d'une adresse dans la base de données.");
		return adresse;
	}

	@Override
	public void supprimer(Integer id) {
		// TODO Auto-generated method stub
		Adresse adresse = rechercherUn(id);
		//List<Usager> usagers = rechercherTout();
		entityManager.remove(adresse);
		LOGGER.info("L'adresse a été supprimée de la base de données.");
	}

	@Override
	public Adresse modifier(Adresse adresse) {
		// TODO Auto-generated method stub
		entityManager.merge(adresse);
		LOGGER.info("Les modifications de l'adresse ont été enregistrées dans la base de données.");
		return adresse;
	}

	@Override
	public Adresse rechercherUn(Integer id) {
		// TODO Auto-generated method stub
		Adresse adresse = entityManager.find(Adresse.class, id);
		LOGGER.info("Récupération d'une adresse à partir de l'identifiant n° "+id +".");
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
