package pe.edu.upc.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.service.IAnuncioService;

@Named
@RequestScoped
public class AnuncioController {
	@Inject
private IAnuncioService aService;

}
-