package pe.edu.upc.daoimpl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IMypesDao;
import pe.edu.upc.entities.Mypes;

public class MypesDaoImpl implements IMypesDao {
	
	@PersistenceContext(unitName = "demoCrudSV61")
	private EntityManager em;

	@Transactional
	@Override
	public void insert(Mypes mp) {

		try {
			em.persist(mp);
		} catch (Exception e) {

			System.out.println("Error al insertar mypes");
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Mypes> list() {
		List<Mypes> lista = new ArrayList<Mypes>();
		try {

			Query q = em.createQuery("select mp from Mypes mp");
			lista = (List<Mypes>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar mypes");
		}
		return lista;
	}

}
