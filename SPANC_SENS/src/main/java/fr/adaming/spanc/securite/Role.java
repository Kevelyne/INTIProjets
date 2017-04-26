package fr.adaming.spanc.securite;

import javax.persistence.*;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRole;
	
	private String nomRole;
	
	//Relation ManyToOne bidirectionnelle mise en Lazy avec User
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_user")
	private User user;

	/**
	 * Constructeur de la classe Role sans paramètres (constructeur par défaut)
	 * */
	public Role() {
		// TODO Auto-generated constructor stub
	}

	
	
	/**
	 * Constructeur de la classe Role avec paramètre
	 * @param nomRole
	 */
	public Role(String nomRole) {
		this.nomRole = nomRole;
	}



	/**
	 * @return the nomRole
	 */
	public String getNomRole() {
		return nomRole;
	}

	/**
	 * @param nomRole the nomRole to set
	 */
	public void setNomRole(String nomRole) {
		this.nomRole = nomRole;
	}

	/**
	 * @return the idRole
	 */
	public Integer getIdRole() {
		return idRole;
	}

	/**
	 * @param idRole the idRole to set
	 */
	public void setIdRole(Integer idRole) {
		this.idRole = idRole;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", nomRole=" + nomRole + "]";
	}
	
	



}
