package ec.edu.ups.examen.modelo;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Paquetes {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String receptor;
	private String remitente;

	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Direccion>direccion;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getReceptor() {
		return receptor;
	}
	public void setReceptor(String receptor) {
		this.receptor = receptor;
	}
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public List<Direccion> getDireccion() {
		return direccion;
	}
	public void setDireccion(List<Direccion> direccion) {
		this.direccion = direccion;
	}

	
	
	
	
}
