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
@Table(name="MypesReview")
public class MypesReviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMypesReviews;
	

	@Column(name = "nCalificacion", length = 2, nullable = false)
	private int nCalificacion;
	
	@ManyToOne
    @JoinColumn(name="idAnuncio", nullable = false)
    private Anuncio idAnuncio;
	
	@ManyToOne
    @JoinColumn(name="idMypes", nullable = false)
    private Mypes idMypes;

	/**
	 * 
	 */
	public MypesReviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdMypesReviews() {
		return idMypesReviews;
	}

	public void setIdMypesReviews(int idMypesReviews) {
		this.idMypesReviews = idMypesReviews;
	}

	public int getnCalificacion() {
		return nCalificacion;
	}

	public void setnCalificacion(int nCalificacion) {
		this.nCalificacion = nCalificacion;
	}

	public Anuncio getIdAnuncio() {
		return idAnuncio;
	}

	public void setIdAnuncio(Anuncio idAnuncio) {
		this.idAnuncio = idAnuncio;
	}

	public Mypes getIdMypes() {
		return idMypes;
	}

	public void setIdMypes(Mypes idMypes) {
		this.idMypes = idMypes;
	}

	
	
	/*@Column(name = "descriptionAnuncio", nullable = false, length = 254) (Se repite en anuncio)
	private String descriptionAnuncio;*/
	

}
