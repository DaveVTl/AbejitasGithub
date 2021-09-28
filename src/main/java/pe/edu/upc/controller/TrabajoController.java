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
	List<Freelancers>listaFreelancerss;
	
	@PostConstruct
	public void init() {
		this.listaTrabajos = new ArrayList<Trabajo>();
		this.trabajo = new Trabajo();
		this.listaFreelancerss = new ArrayList<Freelancers>();
		this.f = new Freelancers();
		this.listTrabajo(); //- - - Lista de Tipos de Trabajo
		this.listFreelancerss(); //- - Lista de Anuncios por mypes
	
	}
	
	//boton anuncio nuevo
	public String newTrabajo() {
		this.setTrabajo(new Trabajo());
		this.listTrabajo();
		return "trabajo.xhtml";/////
	}
	
	
	public void CrearTrabajo() {
		tService.insert(trabajo);
		listTrabajo();
		
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
		try {
			listaTrabajos=tService.list();
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public void listFreelancerss() {
		
		try {
			listaFreelancerss=fService.list();
		} catch (Exception e) {
			e.getMessage();
		}
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



	public List<Freelancers> getListaFreelancerss() {
		return listaFreelancerss;
	}



	public void setListaFreelancerss(List<Freelancers> listaFreelancerss) {
		this.listaFreelancerss = listaFreelancerss;
	}
	
	
}
