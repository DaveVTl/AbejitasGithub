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
@Table(name="Review")
public class Reviews {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idReviews;
	

	@Column(name = "numeroCalificacionReviews", length = 2, nullable = false)
	private int numeroCalificacionReviews;
	
	
	@Column(name = "descripcionReviews", length = 254, nullable = false)
	private String descripcionReviews;
	
	@ManyToOne
    @JoinColumn(name="idTrabajo", nullable = false)
    private Mypes idMypes;

}
