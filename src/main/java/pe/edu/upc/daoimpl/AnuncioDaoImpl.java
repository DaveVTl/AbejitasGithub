package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAnuncioDao;
import pe.edu.upc.entities.Anuncio;

public class AnuncioDaoImpl implements IAnuncioDao {

	@PersistenceContext(unitName = "demoCrudSV61")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Anuncio a) {
		try {
			em.persist(a);
		} catch (Exception e) {
			System.out.println("Error al insertar anuncio");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Anuncio> list() {
		List<Anuncio> lista = new ArrayList<Anuncio>();
		try {
			Query q = em.createQuery("select a from Anuncio a");
			lista = (List<Anuncio>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar anuncio");
		}
		return lista;
	}

}
