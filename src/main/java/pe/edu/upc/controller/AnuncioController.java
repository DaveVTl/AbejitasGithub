package pe.edu.upc.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.entities.Mypes;
import pe.edu.upc.entities.TipoTrabajo;
import pe.edu.upc.service.IAnuncioService;
import pe.edu.upc.service.IMypesService;
import pe.edu.upc.service.ITipoTrabajoService;

@Named
@RequestScoped
public class AnuncioController {
	
	@Inject
	private IAnuncioService aService;
	
	@Inject
	private IMypesService mService;
	
	@Inject
	private ITipoTrabajoService ttService;
	
	private Anuncio anuncio;
	private TipoTrabajo tt;
	private Mypes mp;
	List<Anuncio>listaAnuncios;
	List<TipoTrabajo>listaTipoTrabajo;
	
	@PostConstruct
	public void init() {
		this.listaAnuncios = new ArrayList<Anuncio>();
		this.anuncio = new Anuncio();
		this.listaTipoTrabajo = new ArrayList<TipoTrabajo>();
		this.tt = new TipoTrabajo();
		this.mp = new Mypes();
		this.listTipoTrabajo(); //- - - Lista de Tipos de Trabajo
		//this.listVaccination(); - - Lista de Anuncios por mypes
	}
	
	//boton anuncio nuevo
	public String newAnuncio() {
		this.setAnuncio(new Anuncio());
		this.listTipoTrabajo();
		return "anuncio.xhtml";
	}
	
	public void CrearAnuncio() {
		aService.insert(anuncio);
	}
	
	//boton ver lista de tipos de  trabajos
	public void listTipoTrabajo() {
		listaTipoTrabajo=ttService.list();
	}
	
	
	//getters and setters

	public IAnuncioService getaService() {
		return aService;
	}

	public void setaService(IAnuncioService aService) {
		this.aService = aService;
	}

	public IMypesService getmService() {
		return mService;
	}

	public void setmService(IMypesService mService) {
		this.mService = mService;
	}

	public ITipoTrabajoService getTtService() {
		return ttService;
	}

	public void setTtService(ITipoTrabajoService ttService) {
		this.ttService = ttService;
	}

	public Anuncio getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public TipoTrabajo getTt() {
		return tt;
	}

	public void setTt(TipoTrabajo tt) {
		this.tt = tt;
	}

	public Mypes getMp() {
		return mp;
	}

	public void setMp(Mypes mp) {
		this.mp = mp;
	}

	public List<Anuncio> getListaAnuncios() {
		return listaAnuncios;
	}

	public void setListaAnuncios(List<Anuncio> listaAnuncios) {
		this.listaAnuncios = listaAnuncios;
	}

	public List<TipoTrabajo> getListTipoTrabajo() {
		return listaTipoTrabajo;
	}

	public void setListTipoTrabajo(List<TipoTrabajo> listTipoTrabajo) {
		this.listaTipoTrabajo = listTipoTrabajo;
	}
	
	
	
}
