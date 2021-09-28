package pe.edu.upc.entities;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Trabajo")
public class Trabajo {
//a
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTrabajo;

	@Column(name = "nameTrabajo", length = 45, nullable = false)
	private String nameTrabajo;

	@Column(name = "descriptionTrabajo", nullable = false, length = 254)
	private String descriptionTrabajo;

	@Column(name = "EstadoTrabajo", nullable = false, length = 10)
	private String EstadoTrabajo;

	private Date dateCreacionAnuncio;

	@Column(name = "nuevoPagoTrabajo", nullable = false)
	private double nuevoPagoTrabajo;

	@ManyToOne
	@JoinColumn(name = "idFreelancers", nullable = false)
	private Freelancers freelancers;

	public Trabajo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trabajo(int idTrabajo, String nameTrabajo, String descriptionTrabajo, String estadoTrabajo,
			Date dateCreacionAnuncio, double nuevoPagoTrabajo, Freelancers freelancers, Anuncio anuncio,
			TipoPago tipoPago) {
		super();
		this.idTrabajo = idTrabajo;
		this.nameTrabajo = nameTrabajo;
		this.descriptionTrabajo = descriptionTrabajo;
		EstadoTrabajo = estadoTrabajo;
		this.dateCreacionAnuncio = dateCreacionAnuncio;
		this.nuevoPagoTrabajo = nuevoPagoTrabajo;
		this.freelancers = freelancers;
	}

	public int getIdTrabajo() {
		return idTrabajo;
	}

	public void setIdTrabajo(int idTrabajo) {
		this.idTrabajo = idTrabajo;
	}

	public String getNameTrabajo() {
		return nameTrabajo;
	}

	public void setNameTrabajo(String nameTrabajo) {
		this.nameTrabajo = nameTrabajo;
	}

	public String getDescriptionTrabajo() {
		return descriptionTrabajo;
	}

	public void setDescriptionTrabajo(String descriptionTrabajo) {
		this.descriptionTrabajo = descriptionTrabajo;
	}

	public String getEstadoTrabajo() {
		return EstadoTrabajo;
	}

	public void setEstadoTrabajo(String estadoTrabajo) {
		EstadoTrabajo = estadoTrabajo;
	}

	public Date getDateCreacionAnuncio() {
		return dateCreacionAnuncio;
	}

	public void setDateCreacionAnuncio(Date dateCreacionAnuncio) {
		this.dateCreacionAnuncio = dateCreacionAnuncio;
	}

	public double getNuevoPagoTrabajo() {
		return nuevoPagoTrabajo;
	}

	public void setNuevoPagoTrabajo(double nuevoPagoTrabajo) {
		this.nuevoPagoTrabajo = nuevoPagoTrabajo;
	}

	public Freelancers getFreelancers() {
		return freelancers;
	}

	public void setFreelancers(Freelancers freelancers) {
		this.freelancers = freelancers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(EstadoTrabajo, dateCreacionAnuncio, descriptionTrabajo, freelancers, idTrabajo, nameTrabajo,
				nuevoPagoTrabajo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trabajo other = (Trabajo) obj;
		return Objects.equals(EstadoTrabajo, other.EstadoTrabajo)
				&& Objects.equals(dateCreacionAnuncio, other.dateCreacionAnuncio)
				&& Objects.equals(descriptionTrabajo, other.descriptionTrabajo)
				&& Objects.equals(freelancers, other.freelancers) && idTrabajo == other.idTrabajo
				&& Objects.equals(nameTrabajo, other.nameTrabajo)
				&& Double.doubleToLongBits(nuevoPagoTrabajo) == Double.doubleToLongBits(other.nuevoPagoTrabajo);
	}
	
	

}
