package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Freelancers;
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
		listaMypes();
	}

	// boton redirigir registro freelancer
	public String newMypes() {
		this.setMypes(new Mypes());
		return "mypes.xhtml";
	}

	public void RegistrarMypes() {
		mService.insert(mypes);
		listaMypes();
	}

	// boton ver lista de freelancers
	public void listaMypes() {
		listaMypes = mService.list();
	}
	
	//boton de eliminar
	public void eliminar(Mypes mypes) {
		try {
			mService.eliminar(mypes.getIdMypes());
			listaMypes();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	//boton de modificar
	public void modificar() {
		try {
			mService.modificar(this.mypes);
			this.listaMypes();

		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public String Modifmyp(Mypes mypes) {
		this.setMypes(mypes);
		return "mypesMod.xhtml";

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
