package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;

@Named
public class UsuarioDaoImpl implements IUsuarioDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "demoCrudSV61")
	private EntityManager em;

	@Override
	public Integer insert(Usuario t) throws Exception {
		em.persist(t);
		return t.getFreelancer().getIdFreelancers();
	}

	@Override
	public Integer update(Usuario t) throws Exception {
		em.merge(t);
		return t.getFreelancer().getIdFreelancers();
	}

	@Override
	public Integer delete(Usuario t) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> findAll() throws Exception {
		List<Usuario> users = new ArrayList<>();

		Query query = em.createQuery("SELECT c FROM Usuario c");
		users = (List<Usuario>) query.getResultList();

		return users;
	}

	@Override
	public Optional<Usuario> findById(Usuario t) throws Exception {

		Usuario user;
		TypedQuery<Usuario> query = em.createQuery("SELECT u FROM Usuario u WHERE u.id = ?1", Usuario.class);
		query.setParameter(1, t.getFreelancer().getIdFreelancers());

		user = query.getSingleResult();

		return Optional.of(user);
	}

	@Override
	public String getPassworHashedByUserName(String username) throws Exception {
		Usuario user = new Usuario();
		try {

			Query query = em.createQuery("FROM Usuario u WHERE u.username = ?1");
			query.setParameter(1, username);
			@SuppressWarnings("unchecked")
			List<Usuario> lista = query.getResultList();
			if (!lista.isEmpty()) {
				user = lista.get(0);
			}
		} catch (Exception e) {
			throw e;
		}

		return user != null ? user.getPassword() : "";
	}

	@Override
	public Optional<Usuario> findUserByUsername(Usuario user) throws Exception {
		
		Usuario userFound;
		TypedQuery<Usuario> query = em.createQuery("FROM Usuario u WHERE u.username = ?1 and u.password = ?2", Usuario.class);
		query.setParameter(1, user.getUsername());
		query.setParameter(2, user.getPassword());

		userFound = query.getSingleResult();

		return Optional.of(userFound);
	}

}
