package pe.edu.upc.dao;

import java.util.List;


import pe.edu.upc.entities.Trabajo;


public interface ITrabajoDao {

	public void insert(Trabajo t);

	public List<Trabajo> list();
	
	public void eliminar(int idTrabajo);

	public void modificar(Trabajo trabajo);
	
	public List<Trabajo> finByStatus(Trabajo t) ;
	
}
