package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Freelancers;
import pe.edu.upc.entities.Trabajo;
import pe.edu.upc.service.IFreelancersService;
import pe.edu.upc.service.ITrabajoService;

@Named
@RequestScoped
public class TrabajoController {
	
	@Inject
	private ITrabajoService tService;
	
	@Inject
	private IFreelancersService fService;
	
	
	private Trabajo trabajo;
	private Freelancers f;
	
	List<Trabajo>listaTrabajos;
	List<Freelancers>listaFreelancers;
	
	@PostConstruct
	public void init() {
		this.listaTrabajos = new ArrayList<Trabajo>();
		this.trabajo = new Trabajo();
		this.listaFreelancers = new ArrayList<Freelancers>();
		this.f = new Freelancers();
		this.listTrabajo(); //- - - Lista de Tipos de Trabajo
		this.listFreelancers(); //- - Lista de Anuncios por mypes
	}
	
	//boton anuncio nuevo
	public String newTrabajo() {
		this.setTrabajo(new Trabajo());
		this.listTrabajo();
		return "anuncio.xhtml";/////
	}
	
	public void RegistrarTrabajo() {
		tService.insert(trabajo);
		listTrabajo();
	}
	
	public void CrearTrabajo() {
		tService.insert(trabajo);
	}
	
	//boton de eliminar
	public void eliminar(Trabajo trabajo) {
		try {
			tService.eliminar(trabajo.getIdTrabajo());
			listTrabajo();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	//boton de modificar
	public void modificar() {
		try {
			tService.modificar(this.trabajo);
			this.listTrabajo();

		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public void clean() {
		this.init();
	}

	public String Modifpre(Trabajo trabajo) {
		this.setTrabajo(trabajo);
		return "trabajoMod.xhtml";///crear

	}
	
	public void findByEstado() {
		try {
			if (trabajo.getEstadoTrabajo().isEmpty()) {
				this.listTrabajo();
			} else {
				listaTrabajos = this.tService.finByStatus(this.getTrabajo());
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	//boton ver lista de tipos de  trabajos
	public void listTrabajo() {
		listaTrabajos=tService.list();
	}
	
	public void listFreelancers() {
		listaFreelancers=fService.list();
	}

	
	//GETTERS & SETTERS

	public ITrabajoService gettService() {
		return tService;
	}



	public void settService(ITrabajoService tService) {
		this.tService = tService;
	}



	public IFreelancersService getfService() {
		return fService;
	}



	public void setfService(IFreelancersService fService) {
		this.fService = fService;
	}



	public Trabajo getTrabajo() {
		return trabajo;
	}



	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}



	public Freelancers getF() {
		return f;
	}



	public void setF(Freelancers f) {
		this.f = f;
	}



	public List<Trabajo> getListaTrabajos() {
		return listaTrabajos;
	}



	public void setListaTrabajos(List<Trabajo> listaTrabajos) {
		this.listaTrabajos = listaTrabajos;
	}



	public List<Freelancers> getListaFreelancers() {
		return listaFreelancers;
	}



	public void setListaFreelancers(List<Freelancers> listaFreelancers) {
		this.listaFreelancers = listaFreelancers;
	}
	
	
}
