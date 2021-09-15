package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.entities.TipoTrabajo;
public interface ITipoTrabajoService {

	public void insert(TipoTrabajo tt);
	public List<TipoTrabajo> list();
}
