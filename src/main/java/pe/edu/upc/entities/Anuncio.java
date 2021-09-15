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
@Table(name = "Anuncio")
public class Anuncio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAnuncio;

	@Column(name = "nameAnuncio", length = 45, nullable = false)
	private String nameAnuncio;

	@Column(name = "descriptionAnuncio", nullable = false, length = 254)
	private String descriptionAnuncio;
	
	private Date dateCreacionAnuncio;
	
	private Money pagosAnuncio;
	
	@ManyToOne
    @JoinColumn(name="idMypes", nullable = false)
    private Mypes mypes;
	
	@ManyToOne
    @JoinColumn(name="idTipoTrabajo", nullable = false)
    private TipoTrabajo tipoTrabajo;

	public Anuncio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Anuncio(int idAnuncio, String nameAnuncio, String descriptionAnuncio, Date dateCreacionAnuncio,
			Money pagosAnuncio, Mypes mypes, TipoTrabajo tipoTrabajo) {
		super();
		this.idAnuncio = idAnuncio;
		this.nameAnuncio = nameAnuncio;
		this.descriptionAnuncio = descriptionAnuncio;
		this.dateCreacionAnuncio = dateCreacionAnuncio;
		this.pagosAnuncio = pagosAnuncio;
		this.mypes = mypes;
		this.tipoTrabajo = tipoTrabajo;
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

	public Money getPagosAnuncio() {
		return pagosAnuncio;
	}

	public void setPagosAnuncio(Money pagosAnuncio) {
		this.pagosAnuncio = pagosAnuncio;
	}

	public Mypes getMypes() {
		return mypes;
	}

	public void setMypes(Mypes mypes) {
		this.mypes = mypes;
	}

	public TipoTrabajo getTipoTrabajo() {
		return tipoTrabajo;
	}

	public void setTipoTrabajo(TipoTrabajo tipoTrabajo) {
		this.tipoTrabajo = tipoTrabajo;
	}

	
}
