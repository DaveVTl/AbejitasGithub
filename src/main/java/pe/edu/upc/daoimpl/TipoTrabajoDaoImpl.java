package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ITipoTrabajoDao;

import pe.edu.upc.entities.TipoTrabajo;

public class TipoTrabajoDaoImpl implements ITipoTrabajoDao {

	@PersistenceContext(unitName = "demoCrudSV61")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(TipoTrabajo tp) {
		try {
			em.persist(tp);
		} catch (Exception e) {
			System.out.println("Error al insertar anuncio");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TipoTrabajo> list() {
		List<TipoTrabajo> lista = new ArrayList<TipoTrabajo>();
		try {
			Query q = em.createQuery("select a from Anuncio a");
			lista = (List<TipoTrabajo>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar anuncio");
		}
		return lista;
	}

}
