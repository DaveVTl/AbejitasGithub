package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAnuncioDao;
import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.entities.Freelancers;
import pe.edu.upc.service.IAnuncioService;

@Named
@RequestScoped
public class AnuncioServiceImpl implements IAnuncioService {

	@Inject
	private IAnuncioDao aDao;

	@Override
	public void insert(Anuncio a) {
		// TODO Auto-generated method stub
		aDao.insert(a);
	}

	@Override
	public List<Anuncio> list() {
		// TODO Auto-generated method stub
		return aDao.list();
	}
	@Override
	public void eliminar(int idAnuncio) {
		aDao.eliminar(idAnuncio);
	}

	@Override
	public void modificar(Anuncio anuncio) {
		aDao.modificar(anuncio);		
	}
	
}
