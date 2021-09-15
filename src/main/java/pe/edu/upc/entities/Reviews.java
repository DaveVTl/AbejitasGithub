package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Reviews")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMypesReviews;
	

	@Column(name = "numeroCalificacion", length = 2, nullable = false)
	private int numeroCalificacion;
	
	@Column(name = "DescripcionReviews", length = 254, nullable = false)
	private int DescripcionReviews;
	
	@Column(name = "TipoReviews", length = 10, nullable = false)
	private int TipoReviews;
	
	@ManyToOne
    @JoinColumn(name="idTrabajo", nullable = false)
    private Anuncio idAnuncio;
	

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Reviews(int idMypesReviews, int numeroCalificacion, int descripcionReviews, int tipoReviews,
			Anuncio idAnuncio) {
		super();
		this.idMypesReviews = idMypesReviews;
		this.numeroCalificacion = numeroCalificacion;
		DescripcionReviews = descripcionReviews;
		TipoReviews = tipoReviews;
		this.idAnuncio = idAnuncio;
	}


	public int getIdMypesReviews() {
		return idMypesReviews;
	}


	public void setIdMypesReviews(int idMypesReviews) {
		this.idMypesReviews = idMypesReviews;
	}


	public int getNumeroCalificacion() {
		return numeroCalificacion;
	}


	public void setNumeroCalificacion(int numeroCalificacion) {
		this.numeroCalificacion = numeroCalificacion;
	}


	public int getDescripcionReviews() {
		return DescripcionReviews;
	}


	public void setDescripcionReviews(int descripcionReviews) {
		DescripcionReviews = descripcionReviews;
	}


	public int getTipoReviews() {
		return TipoReviews;
	}


	public void setTipoReviews(int tipoReviews) {
		TipoReviews = tipoReviews;
	}


	public Anuncio getIdAnuncio() {
		return idAnuncio;
	}


	public void setIdAnuncio(Anuncio idAnuncio) {
		this.idAnuncio = idAnuncio;
	}


	
}
