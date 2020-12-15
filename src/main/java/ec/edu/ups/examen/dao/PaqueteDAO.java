package ec.edu.ups.examen.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.examen.modelo.Paquetes;


@Stateless
public class PaqueteDAO {
	
	
	@PersistenceContext(name = "ExamenAPPPersistenceUnit")
	
	@Inject
	private EntityManager em;

	public boolean guardar(Paquetes paquete) throws Exception {

		try {
			em.persist(paquete);

		} catch (Exception e) {
			throw new Exception(e.toString());

		}
		return true;
	}

	public Paquetes buscar(String codigo) throws Exception {
		try {
			String jpql = "SELECT a FROM Paquetes a WHERE a.codigo = :codigo";
			Query query = em.createQuery(jpql, Paquetes.class);
			query.setParameter("placa", codigo);
			Paquetes c = (Paquetes) query.getSingleResult();
			return c;

		} catch (Exception e) {
			throw new Exception(e.toString());
		}

	}


	public Paquetes read(String codigo) {
		return em.find(Paquetes.class, codigo);
	}

	public void eliminar(String codigo) throws Exception {
		Paquetes c = buscar(codigo);
		em.remove(c);
	}
	
	
	
	
	public void update(Paquetes paquete) {

		em.merge(paquete);
	}


	public List<Paquetes> listar() throws Exception {

		try {
			String jpql = "SELECT l FROM Paquete l";
			Query query = em.createQuery(jpql, Paquetes.class);
			List<Paquetes> pq = query.getResultList();
			return pq;
		} catch (Exception e) {
			throw new Exception(e.toString());
		}

	}
}
	

