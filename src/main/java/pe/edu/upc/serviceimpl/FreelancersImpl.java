package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IFreelancersDao;
import pe.edu.upc.entities.Freelancers;
import pe.edu.upc.service.IFreelancersService;

@Named
@RequestScoped
public class FreelancersImpl implements IFreelancersService{
	
@Inject
private IFreelancersDao fDao;

	@Override
	public void insert(Freelancers f) {
		// TODO Auto-generated method stub
		fDao.insert(f);
	}

	@Override
	public List<Freelancers> list() {
		// TODO Auto-generated method stub
		return fDao.list();
	}

	@Override
	public void eliminar(int idFreelancer) {
		fDao.eliminar(idFreelancer);
	}

	@Override
	public void modificar(Freelancers freelancer) {
		fDao.modificar(freelancer);		
	}
	

}
