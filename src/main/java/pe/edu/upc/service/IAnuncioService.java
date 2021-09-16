package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Anuncio;

public interface IAnuncioService {

	public void insert(Anuncio a);
	
	public List<Anuncio> list();
}
