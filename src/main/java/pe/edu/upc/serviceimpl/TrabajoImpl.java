package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.ITrabajoDao;
import pe.edu.upc.entities.Trabajo;
import pe.edu.upc.service.ITrabajoService;
@RequestScoped
@Named
public class TrabajoImpl implements ITrabajoService{

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

}
