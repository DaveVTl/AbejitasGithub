package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IMypesDao;
import pe.edu.upc.entities.Mypes;
import pe.edu.upc.service.IMypesService;

@Named
@RequestScoped
public class MypesImpl implements IMypesService{
	
@Inject
private IMypesDao mpDao;

	@Override
	public void insert(Mypes mp) {
		// TODO Auto-generated method stub
		mpDao.insert(mp);
		
	}

	@Override
	public List<Mypes> list() {
		// TODO Auto-generated method stub
		return mpDao.list();
	}

	@Override
	public void eliminar(int idFreelancer) {
		mpDao.eliminar(idFreelancer);
	}

	@Override
	public void modificar(Mypes mypes) {
		mpDao.modificar(mypes);	
}
}
