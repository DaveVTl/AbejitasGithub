package pe.edu.upc.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Freelancers")
public class Freelancers implements Serializable{

	private static final long serialVersionUID = 1L;
	
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

	@Column(name = "fotoFreelancers", nullable = false, length = 100)
	private String fotoFreelancers;
	
	private Date fechaInscripcionFreelancers;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "freelancer")
	private UsuarioFreelancer usuario;
	
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

	public String getFotoFreelancers() {
		return fotoFreelancers;
	}

	public void setFotoFreelancers(String fotoFreelancers) {
		this.fotoFreelancers = fotoFreelancers;
	}

	public Date getFechaInscripcionFreelancers() {
		return fechaInscripcionFreelancers;
	}

	public void setFechaInscripcionFreelancers(Date fechaInscripcionFreelancers) {
		this.fechaInscripcionFreelancers = fechaInscripcionFreelancers;
	}

}
