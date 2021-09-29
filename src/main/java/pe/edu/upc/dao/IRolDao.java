package pe.edu.upc.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entities.Rol;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.entities.UsuarioRol;


public interface IRolDao {
	
	Integer insert(Rol rol) throws Exception;

	Integer update(Rol rol) throws Exception;

	Integer delete(Rol rol) throws Exception;

	List<Rol> findAll() throws Exception;

	Optional<Rol> findById(Rol rol) throws Exception;

	Integer insertUserRole(List<UsuarioRol> userRoles) throws Exception;

	List<UsuarioRol> findUserRolesByUser(Usuario user) throws Exception;
}
