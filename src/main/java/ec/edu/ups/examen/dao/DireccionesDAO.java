package ec.edu.ups.examen.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.examen.modelo.Direccion;


@Stateless
public class DireccionesDAO {
	
	@PersistenceContext(name = "ExamenAPPPersistenceUnit")
	private EntityManager em;
	public boolean guardar(Direccion direccion) throws Exception {

		try {
			em.persist(direccion);
		} catch (Exception e) {
			throw new Exception(e.toString());
		}
		return true;
	}

	public Direccion buscar(int codigo) throws Exception {
		try {
			String jpql = "SELECT a FROM Direccion a WHERE a.codigo = :codigo";
			Query query = em.createQuery(jpql, Direccion.class);
			query.setParameter("cedula", codigo);
			Direccion dir = (Direccion) query.getSingleResult();
			return dir;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public List<Direccion> listar() throws SQLException {
		try {
			String jpql = "SELECT l FROM Direccion l";
			Query query = em.createQuery(jpql, Direccion.class);
			Direccion cliente = (Direccion) query.getSingleResult();
			List<Direccion> clientes = query.getResultList();

			return clientes;
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return null;

	}

	public void editar(Direccion dir) throws Exception {
		try {
			em.merge(dir);
		} catch (Exception e) {
			throw new Exception(e.toString());
		}
	}
	





}
