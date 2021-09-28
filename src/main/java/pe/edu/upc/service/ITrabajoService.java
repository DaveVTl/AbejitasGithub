package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Trabajo;

public interface ITrabajoService {

	public void insert(Trabajo t);
	
	public List<Trabajo> list();
	
	public void eliminar(int idTrabajo);

	public void modificar(Trabajo trabajo);
	
	public List<Trabajo> finByStatus(Trabajo t) ;
}
