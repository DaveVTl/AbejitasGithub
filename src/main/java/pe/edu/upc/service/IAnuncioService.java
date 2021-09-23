package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.entities.Freelancers;

public interface IAnuncioService {

	public void insert(Anuncio a);
	
	public List<Anuncio> list();
	
	public void eliminar(int idAnuncio);
	
	public void modificar(Anuncio anuncio);
	
	
}
