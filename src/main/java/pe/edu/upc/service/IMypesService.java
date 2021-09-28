package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Freelancers;
import pe.edu.upc.entities.Mypes;
public interface IMypesService {

	public void insert(Mypes m);
	
	public List<Mypes> list();
	
	public void eliminar(int idMypes);
	
	public void modificar(Mypes mypes);
}
