/**
 * 
 */
package fr.adaming.spanc;

import static org.junit.Assert.*;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.adaming.spanc.entites.Adresse;
import fr.adaming.spanc.services.IGeneriqueService;


/**
 * @author inti0440
 *
 */
public class AdresseServiceTU {

	private static ClassPathXmlApplicationContext contexte;
	private static IGeneriqueService <Adresse, Integer, String> service;
	private final static Logger LOGGER = Logger.getLogger("AdresseServiceTU");
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		contexte = new ClassPathXmlApplicationContext("ioc.xml");
		service = (IGeneriqueService)contexte.getBean("adresseService");
		LOGGER.info("-------------------------------");
		LOGGER.info("DEBUT DES TESTS ADRESSE");
		LOGGER.info("-------------------------------");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		contexte.close();
		LOGGER.info("----------------------------");
		LOGGER.info("FIN DES TESTS ADRESSE");
		LOGGER.info("----------------------------");
	}

	/**
	 * Test method for {@link fr.adaming.spanc.services.impl.AdresseServiceImpl#creer(fr.adaming.spanc.entites.Adresse)}.
	 */
	@Test
	public void testCreer() {
		Adresse adresse = service.creer(new Adresse());
		assertNotNull(adresse.getIdAdresse());
	}

	/**
	 * Test method for {@link fr.adaming.spanc.services.impl.AdresseServiceImpl#supprimer(java.lang.Integer)}.
	 */
	@Test
	public void testSupprimer() {
		service.creer(new Adresse());
		List<Adresse> adAvant = service.rechercherTout();
		Integer id = adAvant.size();
		service.supprimer(id);
		List<Adresse> adApres = service.rechercherTout();
		assertTrue(id - adApres.size() ==1);
	}

	/**
	 * Test method for {@link fr.adaming.spanc.services.impl.AdresseServiceImpl#modifier(fr.adaming.spanc.entites.Adresse)}.
	 */
	@Test
	public void testModifier() {
		service.creer(new Adresse());
		List<Adresse> adresses = service.rechercherTout();
		Adresse adresse = service.rechercherUn(adresses.get(0).getIdAdresse());
		adresse.setLibelle("Libellé");
		adresse.setCodePostal(89100);
		adresse.setCommune("Commune");
		Adresse adMod = service.modifier(adresse);
		assertTrue(adresse.getLibelle().equals(adMod.getLibelle()) && adresse.getCodePostal() == adMod.getCodePostal() && adresse.getCommune().equals(adMod.getCommune()));
	}

	/**
	 * Test method for {@link fr.adaming.spanc.services.impl.AdresseServiceImpl#rechercherUn(java.lang.Integer)}.
	 */
	@Test
	public void testRechercherUn() {
		service.creer(new Adresse());
		List<Adresse> adresses = service.rechercherTout();
		Integer id = adresses.size();
		Adresse adresse = service.rechercherUn(id);
		assertTrue(adresse !=null);
	}

	/**
	 * Test method for {@link fr.adaming.spanc.services.impl.AdresseServiceImpl#rechercherTout()}.
	 */
	@Test
	public void testRechercherTout() {
		service.creer(new Adresse());
		List<Adresse> adresses = service.rechercherTout();
		assertTrue(!(adresses.isEmpty()));
	}

	/**
	 * Test method for {@link fr.adaming.spanc.services.impl.AdresseServiceImpl#rechercherParMot(java.lang.String)}.
	 */
	@Test
	@Ignore
	public void testRechercherParMot() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link fr.adaming.spanc.services.impl.AdresseServiceImpl#associer(java.lang.Integer, java.lang.Integer)}.
	 */
	@Test
	@Ignore
	public void testAssocier() {
		fail("Not yet implemented");
	}

}
