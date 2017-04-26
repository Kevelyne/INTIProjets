package fr.adaming.spanc.securite;

import java.util.Collection;

import javax.persistence.*;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;
	
	private String identifiant;
	
	private String motDePasse;
	
	private Boolean actif;
	
	//Relation OneToMany bidirectionnelle avec 	Role (déjà faite)
	@OneToMany(mappedBy="user")
	private Collection<Role> roles;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param identifiant
	 * @param motDePasse
	 */
	public User(String identifiant, String motDePasse) {
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
	}

	/**
	 * @return the idUser
	 */
	public Integer getIdUser() {
		return idUser;
	}

	/**
	 * @param idUser the idUser to set
	 */
	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}

	/**
	 * @return the identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param identifiant the identifiant to set
	 */
	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * @return the roles
	 */
	public Collection<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles the roles to set
	 */
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	/**
	 * @return the actif
	 */
	public Boolean getActif() {
		return actif;
	}

	/**
	 * @param actif the actif to set
	 */
	public void setActif(Boolean actif) {
		this.actif = actif;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", identifiant=" + identifiant
				+ ", motDePasse=" + motDePasse + "]";
	}
	
	
}
