package fr.adaming.spanc.services.impl;

import java.util.List;


import java.util.logging.Logger;

import org.springframework.transaction.annotation.Transactional;

import fr.adaming.spanc.dao.IGeneriqueDao;
import fr.adaming.spanc.exceptions.ListeVideException;
import fr.adaming.spanc.services.IGeneriqueService;
import fr.adaming.spanc.entites.*;


@Transactional(readOnly = true)
public class UsagerServiceImpl implements IGeneriqueService<Usager, Integer, String> {

	private final Logger LOGGER = Logger.getLogger("UsagerServiceImpl");
	
	IGeneriqueDao <Usager, Integer, String> dao;
	
	/**
	 * @param dao the dao to set
	 */
	public void setDao(IGeneriqueDao<Usager, Integer, String> dao) {
		this.dao = dao;
		LOGGER.info("DAO usager initialisée.");
	}

	@Override
	public Usager creer(Usager usager) {
		// TODO Auto-generated method stub
		LOGGER.info("Usager ajouté à la base de données.");
		return dao.creer(usager);
	}

	@Override
	public void supprimer(Integer d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usager modifier(Usager t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usager rechercherUn(Integer id) {
		// TODO Auto-generated method stub
		Usager usager = dao.rechercherUn(id);
		LOGGER.info("Usager récupéré de la base de données.");
		return usager;
	}

	@Override
	public List<Usager> rechercherTout() {
		// TODO Auto-generated method stub
		return dao.rechercherTout();
	}

	@Override
	public List<Usager> rechercherParMot(String s) throws ListeVideException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usager associer(Integer id1, Integer id2) {
		// TODO Auto-generated method stub
		return null;
	}

}
