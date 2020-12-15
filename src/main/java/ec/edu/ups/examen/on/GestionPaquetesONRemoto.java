package ec.edu.ups.examen.on;

import javax.ejb.Remote;


import ec.edu.ups.examen.modelo.Direccion;
import ec.edu.ups.examen.modelo.Paquetes;

@Remote
public interface GestionPaquetesONRemoto {
	
	public boolean guardarDireccion(Direccion dir);
	 public boolean registraPaquete(Paquetes paquete);

	}
	
	
	

