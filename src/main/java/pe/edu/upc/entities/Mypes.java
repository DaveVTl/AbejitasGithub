package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mypes")
public class Mypes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMypes;

	@Column(name = "nameEmpresaMypes", length = 45, nullable = false)
	private String nameEmpresaMypes;

	@Column(name = "rucMypes", nullable = false, length = 15)
	private int dniFreelancers;
	
	@Column(name = "nameGerenteMypes", nullable = false, length = 254)
	private String descriptionFreelancers;
	
	@Column(name = "fechaInscripcionMypes", nullable = false, length = 100)
	private String fechaInscripcionMypes;

	public Mypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mypes(int idMypes, String nameEmpresaMypes, int dniFreelancers, String descriptionFreelancers,
			String fechaInscripcionMypes) {
		super();
		this.idMypes = idMypes;
		this.nameEmpresaMypes = nameEmpresaMypes;
		this.dniFreelancers = dniFreelancers;
		this.descriptionFreelancers = descriptionFreelancers;
		this.fechaInscripcionMypes = fechaInscripcionMypes;
	}

	public int getIdMypes() {
		return idMypes;
	}

	public void setIdMypes(int idMypes) {
		this.idMypes = idMypes;
	}

	public String getNameEmpresaMypes() {
		return nameEmpresaMypes;
	}

	public void setNameEmpresaMypes(String nameEmpresaMypes) {
		this.nameEmpresaMypes = nameEmpresaMypes;
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

	public String getFechaInscripcionMypes() {
		return fechaInscripcionMypes;
	}

	public void setFechaInscripcionMypes(String fechaInscripcionMypes) {
		this.fechaInscripcionMypes = fechaInscripcionMypes;
	}

}
