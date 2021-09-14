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

@Entity
@Table(name = "Anuncio")
public class Anuncio {
//a
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAnuncio;

	@Column(name = "nameAnuncio", length = 45, nullable = false)
	private String nameAnuncio;

	@Column(name = "descriptionAnuncio", nullable = false, length = 254)
	private String descriptionAnuncio;
	
	private Date dateCreacionAnuncio;
	
	@Column(name = "EstadoTrabajo", nullable = false, length = 01)
	private Boolean EstadoTrabajo;
	
	
	@Column(name = "pagosAnuncio", nullable = false, length = 60)
	private int pagosAnuncio;
	
	@ManyToOne
    @JoinColumn(name="idMypes", nullable = false)
    private Mypes mypes;

	
	@ManyToOne
    @JoinColumn(name="idFreelancers", nullable = false)
    private Freelancers freelancers;
	
	@ManyToOne
    @JoinColumn(name="idTipoTrabajo", nullable = false)
    private TipoTrabajo tipoTrabajo;
	
	@ManyToOne
    @JoinColumn(name="idTipoPago", nullable = false)
    private TipoPago tipoPago;

	/**
	 * 
	 */
	public Anuncio() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Anuncio(int idAnuncio, String nameAnuncio, String descriptionAnuncio, Date dateCreacionAnuncio,
			Boolean estadoTrabajo, int pagosAnuncio, Mypes mypes, Freelancers freelancers, TipoTrabajo tipoTrabajo,
			TipoPago tipoPago) {
		super();
		this.idAnuncio = idAnuncio;
		this.nameAnuncio = nameAnuncio;
		this.descriptionAnuncio = descriptionAnuncio;
		this.dateCreacionAnuncio = dateCreacionAnuncio;
		EstadoTrabajo = estadoTrabajo;
		this.pagosAnuncio = pagosAnuncio;
		this.mypes = mypes;
		this.freelancers = freelancers;
		this.tipoTrabajo = tipoTrabajo;
		this.tipoPago = tipoPago;
	}

	public int getIdAnuncio() {
		return idAnuncio;
	}

	public void setIdAnuncio(int idAnuncio) {
		this.idAnuncio = idAnuncio;
	}

	public String getNameAnuncio() {
		return nameAnuncio;
	}

	public void setNameAnuncio(String nameAnuncio) {
		this.nameAnuncio = nameAnuncio;
	}

	public String getDescriptionAnuncio() {
		return descriptionAnuncio;
	}

	public void setDescriptionAnuncio(String descriptionAnuncio) {
		this.descriptionAnuncio = descriptionAnuncio;
	}

	public Date getDateCreacionAnuncio() {
		return dateCreacionAnuncio;
	}

	public void setDateCreacionAnuncio(Date dateCreacionAnuncio) {
		this.dateCreacionAnuncio = dateCreacionAnuncio;
	}

	public Boolean getEstadoTrabajo() {
		return EstadoTrabajo;
	}

	public void setEstadoTrabajo(Boolean estadoTrabajo) {
		EstadoTrabajo = estadoTrabajo;
	}

	public int getPagosAnuncio() {
		return pagosAnuncio;
	}

	public void setPagosAnuncio(int pagosAnuncio) {
		this.pagosAnuncio = pagosAnuncio;
	}

	public Mypes getMypes() {
		return mypes;
	}

	public void setMypes(Mypes mypes) {
		this.mypes = mypes;
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
