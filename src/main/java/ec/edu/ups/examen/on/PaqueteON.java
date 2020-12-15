package ec.edu.ups.examen.on;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.Query;

import ec.edu.ups.examen.dao.DireccionesDAO;
import ec.edu.ups.examen.dao.PaqueteDAO;
import ec.edu.ups.examen.modelo.Direccion;
import ec.edu.ups.examen.modelo.*;

@Stateless
public class PaqueteON implements GestionPaquetesONRemoto{
	
	
	
	@Inject
	private DireccionesDAO daoD;
	@Inject
	private PaqueteON daoPaquete;
	
	

	    public boolean guardarDireccion(Direccion dir){
	     try {
	    	 daoD.guardar(dir);
	   
		} catch (Exception e) {

			e.printStackTrace();
	        
	    }
	     return true;
	    }
	    
	    

	    public boolean registraPaquete(Paquetes paquete){
	     try {
	    	 daoPaquete.registraPaquete(paquete);
	   
		} catch (Exception e) {

			e.printStackTrace();
	        
	    }
	     return true;
	    }
	    
	    
		public double calcularValor(int t){
		    double valor=(0.50);
		      return t*valor;
		}
		
	
		
	    
	 
			   
}


