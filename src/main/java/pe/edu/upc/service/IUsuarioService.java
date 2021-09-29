package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioService {
	Integer insert(Usuario user) throws Exception;

	Integer update(Usuario user) throws Exception;

	Integer delete(Usuario user) throws Exception;

	List<Usuario> getAll() throws Exception;

	Optional<Usuario> getOne(Usuario user) throws Exception;

	Optional<Usuario> authentication(Usuario us) throws Exception;
}