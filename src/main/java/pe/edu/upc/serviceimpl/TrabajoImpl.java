package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.dao.ITrabajoDao;
import pe.edu.upc.entities.Trabajo;
@RequestScoped
@Named
public class TrabajoImpl implements ITrabajoDao{

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
