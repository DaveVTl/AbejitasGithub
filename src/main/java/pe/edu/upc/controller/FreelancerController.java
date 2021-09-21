package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Freelancers;

import pe.edu.upc.service.IFreelancersService;

@Named
@RequestScoped
public class FreelancerController {

	@Inject
	private IFreelancersService fService;

	private Freelancers freelancer;
	List<Freelancers> listaFreelancers;

	@PostConstruct
	public void init() {
		this.freelancer = new Freelancers();
		this.listaFreelancers = new ArrayList<Freelancers>();
		this.listaFreelancer();
	}

	// boton redirigir registro freelancer
	public String newFreelancer() {
		this.setFreelancer(new Freelancers());
		return "freelancers.xhtml";
	}

	public void RegistrarFreelancer() {
		fService.insert(freelancer);
		listaFreelancer();
	}

	// boton ver lista de freelancers
	public void listaFreelancer() {
		listaFreelancers = fService.list();
	}
	//boton de eliminar
	public void eliminar(Freelancers medic) {
		try {
			fService.eliminar(medic.getIdFreelancers());
			listaFreelancer();
		} catch (Exception e) {
			e.getMessage();
		}
	}
	//boton de modificar
	public void modificar() {
		try {
			fService.modificar(this.freelancer);
			this.listaFreelancer();

		} catch (Exception e) {
			e.getMessage();
		}
	}
	

	public String Modifpre(Freelancers free) {
		this.setFreelancer(free);
		return "freelancersMod.xhtml";

	}
	
	//getters
	public IFreelancersService getfService() {
		return fService;
	}

	public void setaService(IFreelancersService fService) {
		this.fService = fService;
	}

	public Freelancers getFreelancer() {
		return freelancer;
	}

	public void setFreelancer(Freelancers freelancer) {
		this.freelancer = freelancer;
	}

	public List<Freelancers> getListaFreelancers() {
		return listaFreelancers;
	}

	public void setListaFreelancers(List<Freelancers> listaFreelancers) {
		this.listaFreelancers = listaFreelancers;
	}

	// getters and setters

}
