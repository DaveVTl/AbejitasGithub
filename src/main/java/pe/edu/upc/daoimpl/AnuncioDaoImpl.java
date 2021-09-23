package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IAnuncioDao;
import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.entities.Freelancers;

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
	
	@Transactional
	@Override
	public void eliminar(int idAnuncio) {
		Anuncio spec = new Anuncio();
		try {
			spec = em.getReference(Anuncio.class, idAnuncio);
			em.remove(spec);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	@Override
	public void modificar(Anuncio anuncio) {
		try {
			em.merge(anuncio);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
