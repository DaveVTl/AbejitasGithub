package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TipoPago")
public class TipoPago {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoPago;

	@Column(name = "nameTipoPago", length = 45, nullable = false)
	private String nameTipoPago;

	public TipoPago() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param idTipoPago
	 * @param nameTipoPago
	 */
	public TipoPago(int idTipoPago, String nameTipoPago) {
		super();
		this.idTipoPago = idTipoPago;
		this.nameTipoPago = nameTipoPago;
	}

	public int getIdTipoPago() {
		return idTipoPago;
	}

	public void setIdTipoPago(int idTipoPago) {
		this.idTipoPago = idTipoPago;
	}

	public String getNameTipoPago() {
		return nameTipoPago;
	}

	public void setNameTipoPago(String nameTipoPago) {
		this.nameTipoPago = nameTipoPago;
	}
	
	

}
