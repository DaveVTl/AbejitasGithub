package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITrabajoDao;
import pe.edu.upc.entities.Trabajo;

public class TrabajoDaoImpl implements ITrabajoDao {
	
	@PersistenceContext(unitName = "demoCrudSV61")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Trabajo tr) {

		try {
			em.persist(tr);
		} catch (Exception e) {

			System.out.println("Error al insertar mypes");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Trabajo> list() {
		List<Trabajo> lista = new ArrayList<Trabajo>();
		try {

			Query q = em.createQuery("select t from Trabajo t");
			lista = (List<Trabajo>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar trabajo");
		}
		return lista;
	}

}
