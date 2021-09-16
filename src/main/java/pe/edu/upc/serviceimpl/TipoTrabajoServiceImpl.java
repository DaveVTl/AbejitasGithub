package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ITipoTrabajoDao;
import pe.edu.upc.entities.TipoTrabajo;
import pe.edu.upc.service.ITipoTrabajoService;

@Named
@RequestScoped
public class TipoTrabajoServiceImpl implements ITipoTrabajoService{
	
@Inject
private ITipoTrabajoDao ttDao;

	@Override
	public void insert(TipoTrabajo f) {
		// TODO Auto-generated method stub
		ttDao.insert(f);
	}

	@Override
	public List<TipoTrabajo> list() {
		// TODO Auto-generated method stub
		return ttDao.list();
	}




}
