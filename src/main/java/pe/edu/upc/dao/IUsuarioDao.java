package pe.edu.upc.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entities.Usuario;

public interface IUsuarioDao {
	Integer insert(Usuario user) throws Exception;

	Integer update(Usuario user) throws Exception;

	Integer delete(Usuario user) throws Exception;

	List<Usuario> findAll() throws Exception;

	Optional<Usuario> findById(Usuario user) throws Exception;

	String getPassworHashedByUserName(String username) throws Exception;

	Optional<Usuario> findUserByUsername(Usuario user) throws Exception;
}
