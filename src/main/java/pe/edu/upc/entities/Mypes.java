package pe.edu.upc.entities;

import java.util.Date;

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
	private int rucMypes;
	
	@Column(name = "nameGerenteMypes", nullable = false, length = 254)
	private String nameGerenteMypes;
	
	
	private Date fechaInscripcionMypes;
	
	@Column(name = "logoMypes", nullable = false, length = 100)
	private String logoMypes;

	public Mypes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mypes(int idMypes, String nameEmpresaMypes, int rucMypes, String nameGerenteMypes,
			Date fechaInscripcionMypes, String logoMypes) {
		super();
		this.idMypes = idMypes;
		this.nameEmpresaMypes = nameEmpresaMypes;
		this.rucMypes = rucMypes;
		this.nameGerenteMypes = nameGerenteMypes;
		this.fechaInscripcionMypes = fechaInscripcionMypes;
		this.logoMypes = logoMypes;
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

	public int getRucMypes() {
		return rucMypes;
	}

	public void setRucMypes(int rucMypes) {
		this.rucMypes = rucMypes;
	}

	public String getNameGerenteMypes() {
		return nameGerenteMypes;
	}

	public void setNameGerenteMypes(String nameGerenteMypes) {
		this.nameGerenteMypes = nameGerenteMypes;
	}

	public Date getFechaInscripcionMypes() {
		return fechaInscripcionMypes;
	}

	public void setFechaInscripcionMypes(Date fechaInscripcionMypes) {
		this.fechaInscripcionMypes = fechaInscripcionMypes;
	}

	public String getLogoMypes() {
		return logoMypes;
	}

	public void setLogoMypes(String logoMypes) {
		this.logoMypes = logoMypes;
	}

}
