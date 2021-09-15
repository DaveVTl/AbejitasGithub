package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Trabajo;


public interface ITrabajoDao {

	public void insert(Trabajo t);

	public List<Trabajo> list();
}
