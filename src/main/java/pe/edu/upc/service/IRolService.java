package pe.edu.upc.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.entities.Rol;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.entities.UsuarioRol;


public interface IRolService {
	Integer insert(Rol rol) throws Exception;

	Integer update(Rol rol) throws Exception;

	Integer delete(Rol rol) throws Exception;

	List<Rol> getAll() throws Exception;

	Optional<Rol> getOne(Rol rol) throws Exception;

	Integer assignRolesToUser(Usuario user, List<Rol> roles) throws Exception;

	List<UsuarioRol> findUserRolesByUser(Usuario user) throws Exception;

}
