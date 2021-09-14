package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "A")
public class TipoTrabajo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoTrabajo;

	@Column(name = "nameTipoTrabajo", length = 45, nullable = false)
	private String nameTipoTrabajo;

	public TipoTrabajo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TipoTrabajo(int idTipoTrabajo, String nameTipoTrabajo) {
		super();
		this.idTipoTrabajo = idTipoTrabajo;
		this.nameTipoTrabajo = nameTipoTrabajo;
	}

	public int getIdTipoTrabajo() {
		return idTipoTrabajo;
	}

	public void setTipoTrabajor(int idTipoTrabajo) {
		this.idTipoTrabajo = idTipoTrabajo;
	}

	public String getNameTipoTrabajo() {
		return nameTipoTrabajo;
	}

	public void setNameTipoTrabajo(String nameTipoTrabajo) {
		this.nameTipoTrabajo = nameTipoTrabajo;
	}


}
