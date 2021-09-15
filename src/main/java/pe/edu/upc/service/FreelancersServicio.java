package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Freelancers;

public interface FreelancersServicio {
	public void insert (Freelancers f);
	List<Freelancers> list();

}
