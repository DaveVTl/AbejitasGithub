package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Freelancers")
public class Freelancers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFreelancers;

	@Column(name = "nameFreelancers", length = 45, nullable = false)
	private String nameFreelancers;

	@Column(name = "dniFreelancers", nullable = false, length = 15)
	private int dniFreelancers;
	
	@Column(name = "descriptionFreelancers", nullable = false, length = 254)
	private String descriptionFreelancers;
	
	@Column(name = "CVFreelancers", nullable = false, length = 100)
	private String CVFreelancers;

	public Freelancers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Freelancers(int idFreelancers, String nameFreelancers, int dniFreelancers, String descriptionFreelancers,
			String cVFreelancers) {
		super();
		this.idFreelancers = idFreelancers;
		this.nameFreelancers = nameFreelancers;
		this.dniFreelancers = dniFreelancers;
		this.descriptionFreelancers = descriptionFreelancers;
		CVFreelancers = cVFreelancers;
	}

	public int getIdFreelancers() {
		return idFreelancers;
	}

	public void setIdFreelancers(int idFreelancers) {
		this.idFreelancers = idFreelancers;
	}

	public String getNameFreelancers() {
		return nameFreelancers;
	}

	public void setNameFreelancers(String nameFreelancers) {
		this.nameFreelancers = nameFreelancers;
	}

	public int getDniFreelancers() {
		return dniFreelancers;
	}

	public void setDniFreelancers(int dniFreelancers) {
		this.dniFreelancers = dniFreelancers;
	}

	public String getDescriptionFreelancers() {
		return descriptionFreelancers;
	}

	public void setDescriptionFreelancers(String descriptionFreelancers) {
		this.descriptionFreelancers = descriptionFreelancers;
	}

	public String getCVFreelancers() {
		return CVFreelancers;
	}

	public void setCVFreelancers(String cVFreelancers) {
		CVFreelancers = cVFreelancers;
	}
	
	/*
	@Column(name = "FotoPerfilFreelancers", nullable = false)
	private bytea FotoPerfilFreelancers;
	*/

}
