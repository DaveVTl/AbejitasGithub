package pe.edu.upc.entities;

import java.util.Date;

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

	@Column(name = "FotoPerfilFreelancers", nullable = false, length = 100)
	private String FotoPerfilFreelancers;
	
	@Column(name = "fechaInscripcionFreelancers", nullable = false, length = 100)
	private Date fechaInscripcionFreelancers;
	
	public Freelancers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Freelancers(int idFreelancers, String nameFreelancers, int dniFreelancers, String descriptionFreelancers,
			String cVFreelancers, String fotoPerfilFreelancers, Date fechaInscripcionFreelancers) {
		super();
		this.idFreelancers = idFreelancers;
		this.nameFreelancers = nameFreelancers;
		this.dniFreelancers = dniFreelancers;
		this.descriptionFreelancers = descriptionFreelancers;
		CVFreelancers = cVFreelancers;
		FotoPerfilFreelancers = fotoPerfilFreelancers;
		this.fechaInscripcionFreelancers = fechaInscripcionFreelancers;
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

	public String getFotoPerfilFreelancers() {
		return FotoPerfilFreelancers;
	}

	public void setFotoPerfilFreelancers(String fotoPerfilFreelancers) {
		FotoPerfilFreelancers = fotoPerfilFreelancers;
	}

	public Date getFechaInscripcionFreelancers() {
		return fechaInscripcionFreelancers;
	}

	public void setFechaInscripcionFreelancers(Date fechaInscripcionFreelancers) {
		this.fechaInscripcionFreelancers = fechaInscripcionFreelancers;
	}
	
}
