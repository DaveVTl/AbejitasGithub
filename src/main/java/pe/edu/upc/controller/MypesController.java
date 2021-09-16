package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Mypes;
import pe.edu.upc.service.IMypesService;

@Named
@RequestScoped
public class MypesController {

	@Inject
	private IMypesService mService;

	private Mypes mypes;
	List<Mypes> listaMypes;

	@PostConstruct
	public void init() {
		mypes = new Mypes();
		listaMypes = new ArrayList<Mypes>();
		listarMypes();
	}

	// boton redirigir registro freelancer
	public String newMypes() {
		this.setMypes(new Mypes());
		return "mypes.xhtml";
	}

	public void RegistrarFreelancer() {
		mService.insert(mypes);
		listarMypes();
	}

	// boton ver lista de freelancers
	public void listarMypes() {
		listaMypes = mService.list();
	}

	public IMypesService getmService() {
		return mService;
	}

	public void setmService(IMypesService mService) {
		this.mService = mService;
	}

	public Mypes getMypes() {
		return mypes;
	}

	public void setMypes(Mypes mypes) {
		this.mypes = mypes;
	}

	public List<Mypes> getListaMypes() {
		return listaMypes;
	}

	public void setListaMypes(List<Mypes> listaMypes) {
		this.listaMypes = listaMypes;
	}

	

}
