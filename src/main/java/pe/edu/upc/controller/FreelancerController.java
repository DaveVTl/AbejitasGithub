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
		freelancer = new Freelancers();
		listaFreelancers = new ArrayList<Freelancers>();
		listTipoTrabajo();
	}

	// boton redirigir registro freelancer
	public String newFreelancer() {
		this.setFreelancer(new Freelancers());
		return "freelancer.xhtml";
	}

	public void RegistrarFreelancer() {
		fService.insert(freelancer);
		listTipoTrabajo();
	}

	// boton ver lista de freelancers
	public void listTipoTrabajo() {
		listaFreelancers = fService.list();
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
