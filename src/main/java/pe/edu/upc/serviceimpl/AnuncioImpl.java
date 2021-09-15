package pe.edu.upc.serviceimpl;

import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IAnuncioDao;
import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.service.IAnuncioService;
@Named
public class AnuncioImpl implements IAnuncioService{
@Inject	
private IAnuncioDao aDao;
	@Override
	public void insert(Anuncio a) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Anuncio> list() {
		// TODO Auto-generated method stub
		return null;
	}


}
