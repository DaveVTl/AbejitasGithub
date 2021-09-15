package pe.edu.upc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.javamoney.moneta.Money;

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
	
	private Date dateCreacionAnuncio;
	
	@Column(name = "nuevoPagoTrabajo", nullable = false)
	private Money nuevoPagoTrabajo;

	@ManyToOne
    @JoinColumn(name="idFreelancers", nullable = false)
    private Freelancers freelancers;
	
	@ManyToOne
    @JoinColumn(name="idAnuncio", nullable = false)
    private Anuncio anuncio;
	
	@ManyToOne
    @JoinColumn(name="idTipoPago", nullable = false)
    private TipoPago tipoPago;

	public Trabajo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trabajo(int idTrabajo, String nameTrabajo, String descriptionTrabajo, Date dateCreacionAnuncio,
			Money nuevoPagoTrabajo, Freelancers freelancers, Anuncio anuncio, TipoPago tipoPago) {
		super();
		this.idTrabajo = idTrabajo;
		this.nameTrabajo = nameTrabajo;
		this.descriptionTrabajo = descriptionTrabajo;
		this.dateCreacionAnuncio = dateCreacionAnuncio;
		this.nuevoPagoTrabajo = nuevoPagoTrabajo;
		this.freelancers = freelancers;
		this.anuncio = anuncio;
		this.tipoPago = tipoPago;
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

	public Date getDateCreacionAnuncio() {
		return dateCreacionAnuncio;
	}

	public void setDateCreacionAnuncio(Date dateCreacionAnuncio) {
		this.dateCreacionAnuncio = dateCreacionAnuncio;
	}

	public Money getNuevoPagoTrabajo() {
		return nuevoPagoTrabajo;
	}

	public void setNuevoPagoTrabajo(Money nuevoPagoTrabajo) {
		this.nuevoPagoTrabajo = nuevoPagoTrabajo;
	}

	public Freelancers getFreelancers() {
		return freelancers;
	}

	public void setFreelancers(Freelancers freelancers) {
		this.freelancers = freelancers;
	}

	public Anuncio getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}

	
}
