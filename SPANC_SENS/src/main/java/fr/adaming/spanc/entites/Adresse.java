package fr.adaming.spanc.entites;

/**
 * @author Laëtitia Raobelina
 * 16 mars 2017
 * */
import javax.persistence.*;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idAdresse;
	
	private String libelle;
	
	private Integer codePostal;
	
	private String commune;
	
	
	/**
	 * @method Constructeur par défaut 
	 * */
	public Adresse() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @method Constructeur avec paramètres
	 * @param libelle
	 * @param codePostal
	 * @param commune
	 */
	public Adresse(String libelle, Integer codePostal, String commune) {
		this.libelle = libelle;
		this.codePostal = codePostal;
		this.commune = commune;
	}


	/**
	 * @return the idAdresse
	 */
	public Integer getIdAdresse() {
		return idAdresse;
	}


	/**
	 * @param idAdresse the idAdresse to set
	 */
	public void setIdAdresse(Integer idAdresse) {
		this.idAdresse = idAdresse;
	}


	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}


	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	/**
	 * @return the codePostal
	 */
	public Integer getCodePostal() {
		return codePostal;
	}


	/**
	 * @param codePostal the codePostal to set
	 */
	public void setCodePostal(Integer codePostal) {
		this.codePostal = codePostal;
	}


	/**
	 * @return the commune
	 */
	public String getCommune() {
		return commune;
	}


	/**
	 * @param commune the commune to set
	 */
	public void setCommune(String commune) {
		this.commune = commune;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Adresse [idAdresse=" + idAdresse + ", libelle=" + libelle
				+ ", codePostal=" + codePostal + ", commune=" + commune + "]";
	}
	
	
	
}
