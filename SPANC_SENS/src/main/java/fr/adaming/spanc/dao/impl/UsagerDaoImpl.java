package fr.adaming.spanc.dao.impl;

import java.util.List;



import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.adaming.spanc.dao.IGeneriqueDao;
import fr.adaming.spanc.entites.*;

public class UsagerDaoImpl implements IGeneriqueDao<Usager, Integer, String> {
	
	private final Logger LOGGER = Logger.getLogger("UsagerDaoImpl");
	
	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public Usager creer(Usager usager) {
		// TODO Auto-generated method stub
		entityManager.persist(usager);
		return usager;
	}

	@Override
	public void supprimer(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usager modifier(Usager usager) {
		// TODO Auto-generated method stub
		entityManager.merge(usager);
		return usager;
	}

	@Override
	public Usager rechercherUn(Integer id) {
		// TODO Auto-generated method stub
		Usager usager = entityManager.find(Usager.class, id);
		return usager;
	}

	@Override
	public List<Usager> rechercherTout() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("From Usager");
		return query.getResultList();
	}

	@Override
	public List<Usager> rechercherParMot(String mot) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usager associer(Integer id1, Integer id2) {
		// TODO Auto-generated method stub
		return null;
	}

}
