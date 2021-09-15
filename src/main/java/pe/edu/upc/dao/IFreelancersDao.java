package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entities.Freelancers;


public interface IFreelancersDao {

	public void insert(Freelancers f);

	public List<Freelancers> list();
}
