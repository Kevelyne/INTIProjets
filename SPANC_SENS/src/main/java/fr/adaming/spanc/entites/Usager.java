package fr.adaming.spanc.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
public class Usager {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsager;
	
	private String civilite;
	
	private String nom;
	
	private String prenom;
	
	//Relation OneToMany unidirectionnel avec Adresse
	@OneToMany
	@JoinTable(name="jt_usager_adresses")
	List<Adresse> adresses = new ArrayList<Adresse>();
	
	public Usager() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param civilite
	 * @param nom
	 * @param prenom
	 */
	public Usager(String civilite, String nom, String prenom) {
		this.civilite = civilite;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return the idUsager
	 */
	public Integer getIdUsager() {
		return idUsager;
	}

	/**
	 * @param idUsager the idUsager to set
	 */
	public void setIdUsager(Integer idUsager) {
		this.idUsager = idUsager;
	}

	/**
	 * @return the civilite
	 */
	public String getCivilite() {
		return civilite;
	}

	/**
	 * @param civilite the civilite to set
	 */
	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the adresses
	 */
	public List<Adresse> getAdresses() {
		return adresses;
	}

	/**
	 * @param adresses the adresses to set
	 */
	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usager [idUsager=" + idUsager + ", civilite=" + civilite
				+ ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
