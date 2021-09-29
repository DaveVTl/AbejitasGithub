package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.inject.Named;
import javax.transaction.Transactional;

import org.mindrot.jbcrypt.BCrypt;

import pe.edu.upc.dao.IUsuarioDao;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IUsuarioService;

@Named
public class UsuarioServiceImpl implements IUsuarioService, Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IUsuarioDao uD;

	@Transactional
	@Override
	public Integer insert(Usuario t) throws Exception {
		return uD.insert(t);
	}

	@Transactional
	@Override
	public Integer update(Usuario t) throws Exception {
		return uD.update(t);
	}

	@Transactional
	@Override
	public Integer delete(Usuario t) throws Exception {
		return uD.delete(t);
	}

	@Override
	public List<Usuario> getAll() throws Exception {
		return uD.findAll();
	}

	@Override
	public Optional<Usuario> getOne(Usuario t) throws Exception {
		return uD.findById(t);
	}

	@Override
	public Optional<Usuario> authentication(Usuario user) throws Exception {
		String password = user.getPassword();

		String passwordHash = uD.getPassworHashedByUserName(user.getUsername());

		if (BCrypt.checkpw(password, passwordHash)) {
			user.setPassword(passwordHash);
			return uD.findUserByUsername(user);
		}

		return Optional.of(new Usuario());
	}

}
