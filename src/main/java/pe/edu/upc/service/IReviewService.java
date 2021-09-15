package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entities.Anuncio;
import pe.edu.upc.entities.Reviews;
public interface IReviewService {

	public void insert(Reviews r);
	public List<Reviews> list();
}
