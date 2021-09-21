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
@Table(name="Avances")
public class Avances {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMypesReviews;
	

	@Column(name = "foto1", length = 254, nullable = false)
	private String foto1;
	
	@Column(name = "foto2", length = 254, nullable = false)
	private String foto2;
	
	@Column(name = "foto3", length = 254, nullable = false)
	private String foto3;
	
	@ManyToOne
    @JoinColumn(name="idTrabajo", nullable = false)
    private Anuncio idAnuncio;

	public Avances() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avances(int idMypesReviews, String foto1, String foto2, String foto3, Anuncio idAnuncio) {
		super();
		this.idMypesReviews = idMypesReviews;
		this.foto1 = foto1;
		this.foto2 = foto2;
		this.foto3 = foto3;
		this.idAnuncio = idAnuncio;
	}

	public int getIdMypesReviews() {
		return idMypesReviews;
	}

	public void setIdMypesReviews(int idMypesReviews) {
		this.idMypesReviews = idMypesReviews;
	}

	public String getFoto1() {
		return foto1;
	}

	public void setFoto1(String foto1) {
		this.foto1 = foto1;
	}

	public String getFoto2() {
		return foto2;
	}

	public void setFoto2(String foto2) {
		this.foto2 = foto2;
	}

	public String getFoto3() {
		return foto3;
	}

	public void setFoto3(String foto3) {
		this.foto3 = foto3;
	}

	public Anuncio getIdAnuncio() {
		return idAnuncio;
	}

	public void setIdAnuncio(Anuncio idAnuncio) {
		this.idAnuncio = idAnuncio;
	}
	

	
}
