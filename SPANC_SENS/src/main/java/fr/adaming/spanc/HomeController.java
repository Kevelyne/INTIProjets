package fr.adaming.spanc;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.adaming.spanc.entites.*;
import fr.adaming.spanc.services.IGeneriqueService;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({"Usagers"})
public class HomeController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private IGeneriqueService <Adresse, Integer, String> serviceAd;
	
	@Inject
	private IGeneriqueService <Usager, Integer, String> serviceUs;
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		LOGGER.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		List<Usager> usagers = serviceUs.rechercherTout();
		model.addAttribute("Usagers", usagers);
		LOGGER.info("Liste des usagers récupérée.");
		return "home";
	}
	
	@RequestMapping(value="/chUsager", method = RequestMethod.POST)
	public String chUsager(Model model, String idUs) {
		LOGGER.info("Recherche de l'usager n° "+idUs);
		Usager usager = serviceUs.rechercherUn(Integer.parseInt(idUs));
		model.addAttribute("usa", usager);
		return "home";
	}
	
}
