package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.mindrot.jbcrypt.BCrypt;

import pe.edu.upc.entities.Freelancers;
import pe.edu.upc.entities.Rol;
import pe.edu.upc.entities.Usuario;
import pe.edu.upc.service.IFreelancersService;
import pe.edu.upc.service.IRolService;



@Named
@ViewScoped
public class RegistroController implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private IFreelancersService cS;

	@Inject
	private IRolService rS;

	private Freelancers f;
	private Usuario user;

	@PostConstruct
	public void init() {
		this.f = new Freelancers();
		this.user = new Usuario();
	}

	public String registerUser() {
		String redirect = null;
		try {
			String password = this.user.getPassword();
			String passwordHash = BCrypt.hashpw(password, BCrypt.gensalt());
			this.user.setPassword(passwordHash);
			this.user.setState("A");
			this.f.setUser(user);
			this.user.setFreelancer(f);
			this.cS.insert(f);

			List<Rol> roles = new ArrayList<Rol>();
			int TIPO_USUARIO = 1;
			Rol r = new Rol();
			r.setId(TIPO_USUARIO);
			roles.add(r);
			rS.assignRolesToUser(user, roles);
		
			redirect = "login?faces-redirect=true";
		} catch (Exception e) {
			
		}

		return redirect;
	}
	
 


	public Freelancers getFreelancers() {
		return f;
	}

	public void setFreelancers(Freelancers f) {
		this.f = f;
	}

	public Usuario getUser() {
		return user;
	}

	public void setUser(Usuario user) {
		this.user = user;
	}

}
