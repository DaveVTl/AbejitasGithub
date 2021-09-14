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
@Table(name="FreelancersReview")
public class FreelancersReviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFreelancersReviews;
	

	@Column(name = "nCalificacion", length = 2, nullable = false)
	private int nCalificacion;
	
	@ManyToOne
    @JoinColumn(name="idAnuncio", nullable = false)
    private Anuncio idAnuncio;
	
	@ManyToOne
    @JoinColumn(name="idFreelancer", nullable = false)
    private Freelancers idFreelancer;

	/**
	 * 
	 */
	public FreelancersReviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idFreelancersReviews
	 * @param nCalificacion
	 * @param idAnuncio
	 * @param idFreelancer
	 */
	public FreelancersReviews(int idFreelancersReviews, int nCalificacion, Anuncio idAnuncio,
			Freelancers idFreelancer) {
		super();
		this.idFreelancersReviews = idFreelancersReviews;
		this.nCalificacion = nCalificacion;
		this.idAnuncio = idAnuncio;
		this.idFreelancer = idFreelancer;
	}

	public int getIdFreelancersReviews() {
		return idFreelancersReviews;
	}

	public void setIdFreelancersReviews(int idFreelancersReviews) {
		this.idFreelancersReviews = idFreelancersReviews;
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

	public Freelancers getIdFreelancer() {
		return idFreelancer;
	}

	public void setIdFreelancer(Freelancers idFreelancer) {
		this.idFreelancer = idFreelancer;
	}
	
	
	
	/*@Column(name = "descriptionAnuncio", nullable = false, length = 254) (Se repite en anuncio)
	private String descriptionAnuncio;*/
	

}
