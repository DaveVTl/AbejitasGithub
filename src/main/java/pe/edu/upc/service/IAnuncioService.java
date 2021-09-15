package pe.edu.upc.service;

import pe.edu.upc.entities.Anuncio;
public interface IAnuncioService {

	public void insert(Anuncio a);
	List<Anuncio> list();
}
