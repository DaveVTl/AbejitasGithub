package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITrabajoDao;
import pe.edu.upc.entities.Trabajo;
import pe.edu.upc.service.ITrabajoService;


@Named
@RequestScoped
public class TrabajoServiceImpl implements ITrabajoService, Serializable  {
	
	private static final long serialVersionUID = 1L;
	@Inject
	private ITrabajoDao tDao;

	@Override
	public void insert(Trabajo t) {
		// TODO Auto-generated method stub
		tDao.insert(t);
	}

	@Override
	public List<Trabajo> list() {
		// TODO Auto-generated method stub
		return tDao.list();
	}

	@Override
	public void eliminar(int idTrabajo) {
		// TODO Auto-generated method stub
		tDao.eliminar(idTrabajo);
	}

	@Override
	public void modificar(Trabajo trabajo) {
		// TODO Auto-generated method stub
		tDao.modificar(trabajo);
		;
	}

	@Override
	public List<Trabajo> finByStatus(Trabajo t) {
		return tDao.finByStatus(t);
		
	}

}
