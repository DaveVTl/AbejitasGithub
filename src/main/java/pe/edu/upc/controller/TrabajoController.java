package pe.edu.upc.controller;

import java.io.Serializable;
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
public class TrabajoController implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Inject
	private ITrabajoService tService;
	
	@Inject
	private IFreelancersService fService;
	
	
	private Trabajo trabajo;
	private Freelancers f;
	
	List<Trabajo>listTrabajos;
	List<Freelancers>listFreelancerss;
	
	@PostConstruct
	public void init() {
		f = new Freelancers();
		trabajo = new Trabajo();
		listTrabajos = new ArrayList<>();
		listFreelancerss = new ArrayList<>();
		
		this.listTrabajo(); //- - - Lista de Tipos de Trabajo
		this.listFreelancer(); //- - Lista de Anuncios por mypes
	
	}
	
	//boton anuncio nuevo
	public String newTrabajo() {
		this.setTrabajo(new Trabajo());
		this.listTrabajo();
		return "trabajo.xhtml";/////
	}
	
	
	public void insert() {
		tService.insert(trabajo);
		clean();
		this.listTrabajo();
		
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
				listTrabajos = this.tService.finByStatus(this.getTrabajo());
			}
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	//boton ver lista de tipos de  trabajos
	public void listTrabajo() {
		try {
			listTrabajos=tService.list();
		} catch (Exception e) {
			e.getMessage();
		}
		
	}
	
	public void listFreelancer() {
		
		try {
			listFreelancerss=fService.list();
		} catch (Exception e) {
			e.getMessage();
		}
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

	public List<Trabajo> getListTrabajos() {
		return listTrabajos;
	}

	public void setListTrabajos(List<Trabajo> listTrabajos) {
		this.listTrabajos = listTrabajos;
	}

	public List<Freelancers> getListFreelancerss() {
		return listFreelancerss;
	}

	public void setListFreelancerss(List<Freelancers> listFreelancerss) {
		this.listFreelancerss = listFreelancerss;
	}

	
	
	//GETTERS & SETTERS




	
	
}
