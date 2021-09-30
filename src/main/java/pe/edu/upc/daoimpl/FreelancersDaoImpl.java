package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IFreelancersDao;
import pe.edu.upc.entities.Freelancers;



public class FreelancersDaoImpl implements IFreelancersDao, Serializable{
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "demoCrudSV61")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Freelancers f) {

		try {
			em.persist(f);
		} catch (Exception e) {

			System.out.println("Error al insertar el freelancer");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Freelancers> list() {
		List<Freelancers> lista = new ArrayList<Freelancers>();
		try {

			Query q = em.createQuery("select f from Freelancers f");
			lista = (List<Freelancers>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al insertar freelancers");
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idFreelancer) {
		Freelancers spec = new Freelancers();
		try {
			spec = em.getReference(Freelancers.class, idFreelancer);
			em.remove(spec);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Freelancers freelancer) {
		try {
			em.merge(freelancer);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//a

}
