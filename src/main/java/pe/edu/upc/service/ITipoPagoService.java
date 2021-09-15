package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.entities.TipoPago;
public interface ITipoPagoService {

	public void insert(TipoPago tp);
	public List<TipoPago> list();
}
