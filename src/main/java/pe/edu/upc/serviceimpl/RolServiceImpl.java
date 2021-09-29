package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRolDao;
import pe.edu.upc.entities.Rol;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.entities.UsuarioRol;
import pe.edu.upc.service.IRolService;

@Named
public class RolServiceImpl implements IRolService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IRolDao rD;

	@Transactional
	@Override
	public Integer insert(Rol t) throws Exception {
		return rD.insert(t);
	}

	@Transactional
	@Override
	public Integer update(Rol t) throws Exception {
		return rD.update(t);
	}

	@Transactional
	@Override
	public Integer delete(Rol t) throws Exception {
		return rD.delete(t);
	}

	@Override
	public List<Rol> getAll() throws Exception {
		return rD.findAll();
	}

	@Override
	public Optional<Rol> getOne(Rol t) throws Exception {
		return rD.findById(t);
	}

	@Transactional
	@Override
	public Integer assignRolesToUser(Usuario user, List<Rol> roles) throws Exception {
		List<UsuarioRol> userRoles = new ArrayList<>();

		roles.forEach(rol -> {
			UsuarioRol userRol = new UsuarioRol();
			userRol.setUser(user);
			userRol.setRol(rol);
			userRoles.add(userRol);
		});

		rD.insertUserRole(userRoles);

		return 1;
	}

	@Override
	public List<UsuarioRol> findUserRolesByUser(Usuario user) throws Exception {
		return rD.findUserRolesByUser(user);
	}

}
