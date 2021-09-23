package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.entities.Freelancers;


public interface IAnuncioDao {

	public void insert(Anuncio a);
	
	public void eliminar(int idAnuncio);
	
	public void modificar(Anuncio anuncio);

	public List<Anuncio> list();
}
