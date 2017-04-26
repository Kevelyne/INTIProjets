package fr.adaming.spanc.services.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import fr.adaming.spanc.dao.IGeneriqueDao;
import fr.adaming.spanc.entites.Adresse;
import fr.adaming.spanc.exceptions.ListeVideException;
import fr.adaming.spanc.services.IGeneriqueService;

@Transactional(readOnly = true)
public class AdresseServiceImpl implements IGeneriqueService<Adresse, Integer, String> {

	/**
	 * Cr�er un EntityManager pour permettre la connexion � la base de donn�es (javax.persistence)
	 * */
	@PersistenceContext
	private EntityManager entityManager;
	
	private final Logger LOGGER = Logger.getLogger("AdresseServiceImpl");
	
	private IGeneriqueDao <Adresse, Integer, String> dao;
	
	/**
	 * @param dao the dao to set
	 */
	public void setDao(IGeneriqueDao<Adresse, Integer, String> dao) {
		this.dao = dao;
		LOGGER.info("DAO initialis�e.");
	}

	@Override
	@Transactional(readOnly = false)
	public Adresse creer(Adresse adresse) {
		// TODO Auto-generated method stub
		LOGGER.info("Ajout de l'adresse effectu�.");
		return dao.creer(adresse);
	}

	@Override
	@Transactional(readOnly = false)
	public void supprimer(Integer id) {
		// TODO Auto-generated method stub
		dao.supprimer(id);
		LOGGER.info("Suppression de l'adresse n� " + id + ".");
	}

	@Override
	@Transactional(readOnly = false)
	public Adresse modifier(Adresse adresse) {
		// TODO Auto-generated method stub
		LOGGER.info("Modifications de l'adresse enregistr�es.");
		return dao.modifier(adresse);
	}

	@Override
	public Adresse rechercherUn(Integer id) {
		// TODO Auto-generated method stub
		LOGGER.info("Recherche de l'adresse n� "+id+" effectu�e.");
		return dao.rechercherUn(id);
	}

	@Override
	public List<Adresse> rechercherTout() {
		// TODO Auto-generated method stub
		LOGGER.info("Liste compl�te des adresses r�cup�r�e.");
		return dao.rechercherTout();
	}

	@Override
	public List<Adresse> rechercherParMot(String mot) throws ListeVideException {
		// TODO Auto-generated method stub (pas encore faite c�t� DAO)
		List <Adresse> adressesMot = dao.rechercherParMot(mot);
		if(adressesMot.isEmpty())
		{
			throw new ListeVideException("Aucune adresse n'a �t� trouv�e.");
		}
		LOGGER.info("Liste par mot-cl� r�cup�r�e.");
		return adressesMot;
	}

	@Override
	@Transactional(readOnly = false)
	public Adresse associer(Integer id1, Integer id2) {
		// TODO Auto-generated method stub (pas encore faite c�t� DAO)
		return dao.associer(id1, id2);
	}

}
