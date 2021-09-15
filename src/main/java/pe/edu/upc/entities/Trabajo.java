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

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTrabajo;

	@Column(name = "nuevaDescriptionTrabajo", nullable = false, length = 254)
	private String descriptionAnuncio;
	
	private Date dateCreacionTrabajo;
	
	@Column(name = "EstadoTrabajo", nullable = false, length = 01)
	private Boolean EstadoTrabajo;
	
	private Money pagosAnuncio;

	@ManyToOne
    @JoinColumn(name="idFreelancers", nullable = false)
    private Freelancers freelancers;
	
	@ManyToOne
    @JoinColumn(name="idTipoTrabajo", nullable = false)
    private TipoTrabajo tipoTrabajo;
	
	@ManyToOne
    @JoinColumn(name="idTipoPago", nullable = false)
    private TipoPago tipoPago;

	public Trabajo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trabajo(int idTrabajo, String descriptionAnuncio, Date dateCreacionTrabajo, Boolean estadoTrabajo,
			Money pagosAnuncio, Freelancers freelancers, TipoTrabajo tipoTrabajo, TipoPago tipoPago) {
		super();
		this.idTrabajo = idTrabajo;
		this.descriptionAnuncio = descriptionAnuncio;
		this.dateCreacionTrabajo = dateCreacionTrabajo;
		EstadoTrabajo = estadoTrabajo;
		this.pagosAnuncio = pagosAnuncio;
		this.freelancers = freelancers;
		this.tipoTrabajo = tipoTrabajo;
		this.tipoPago = tipoPago;
	}

	public int getIdTrabajo() {
		return idTrabajo;
	}

	public void setIdTrabajo(int idTrabajo) {
		this.idTrabajo = idTrabajo;
	}

	public String getDescriptionAnuncio() {
		return descriptionAnuncio;
	}

	public void setDescriptionAnuncio(String descriptionAnuncio) {
		this.descriptionAnuncio = descriptionAnuncio;
	}

	public Date getDateCreacionTrabajo() {
		return dateCreacionTrabajo;
	}

	public void setDateCreacionTrabajo(Date dateCreacionTrabajo) {
		this.dateCreacionTrabajo = dateCreacionTrabajo;
	}

	public Boolean getEstadoTrabajo() {
		return EstadoTrabajo;
	}

	public void setEstadoTrabajo(Boolean estadoTrabajo) {
		EstadoTrabajo = estadoTrabajo;
	}

	public Money getPagosAnuncio() {
		return pagosAnuncio;
	}

	public void setPagosAnuncio(Money pagosAnuncio) {
		this.pagosAnuncio = pagosAnuncio;
	}

	public Freelancers getFreelancers() {
		return freelancers;
	}

	public void setFreelancers(Freelancers freelancers) {
		this.freelancers = freelancers;
	}

	public TipoTrabajo getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	public TipoPago getTipoPago() {
		return tipoPago;
	}

	public void setTipoPago(TipoPago tipoPago) {
		this.tipoPago = tipoPago;
	}
	
	
	
}
