package pe.edu.upc.dao;

import java.util.List;


import pe.edu.upc.entities.TipoTrabajo;


public interface ITipoTrabajoDao {

	public void insert(TipoTrabajo tp);

	public List<TipoTrabajo> list();
}
