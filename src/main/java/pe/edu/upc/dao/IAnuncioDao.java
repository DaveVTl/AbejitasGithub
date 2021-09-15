package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Anuncio;


public interface IAnuncioDao {

	public void insert(Anuncio a);

	public List<Anuncio> list();
}
