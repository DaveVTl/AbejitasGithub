package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Freelancers;

public interface IFreelancersService {

	public void insert(Freelancers f);

	public List<Freelancers> list();

	public void eliminar(int idFreelancer);
	
	public void modificar(Freelancers freelancer);
	
}
