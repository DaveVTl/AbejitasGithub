package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITrabajoDao;
import pe.edu.upc.entities.Trabajo;




public class TrabajoDaoImpl implements ITrabajoDao, Serializable {
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "demoCrudSV61")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Trabajo tr) {

		try {
			em.persist(tr);
		} catch (Exception e) {

			System.out.println("Error al insertar Trabajo");
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
			System.out.println("Error al listar Trabajos");
		}
		return lista;
	}
	
	@Transactional
	@Override
	public void eliminar(int idTrabajo) {
		Trabajo spec = new Trabajo();
		try {
			spec = em.getReference(Trabajo.class, idTrabajo);
			em.remove(spec);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Trabajo trabajo) {
		try {
			em.merge(trabajo);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	

	@SuppressWarnings("unchecked")
	@Override
	public List<Trabajo> finByStatus(Trabajo t) {
		List<Trabajo> lista = new ArrayList<Trabajo>();
		try {
			Query q = em.createQuery("from Trabajo t where t.EstadoTrabajo like ?1");
			q.setParameter(1, "%" + t.getEstadoTrabajo() + "%");
			lista = (List<Trabajo>) q.getResultList();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return lista;
	}

	

}
