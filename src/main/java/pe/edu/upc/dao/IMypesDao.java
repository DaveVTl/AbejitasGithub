package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Freelancers;
import pe.edu.upc.entities.Mypes;

public interface IMypesDao {
	public void insert(Mypes mp);

	public List<Mypes> list();
	
	public void eliminar(int idMypes);
	
	public void modificar(Mypes mypes);
}
