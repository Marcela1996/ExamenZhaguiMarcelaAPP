package ec.edu.ups.examen.modelo;

import javax.inject.Inject;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Direccion {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
    private String direccionRecogida;
    private String direcccionEntrega;
    
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDireccionRecogida() {
		return direccionRecogida;
	}
	public void setDireccionRecogida(String direccionRecogida) {
		this.direccionRecogida = direccionRecogida;
	}
	public String getDirecccionEntrega() {
		return direcccionEntrega;
	}
	public void setDirecccionEntrega(String direcccionEntrega) {
		this.direcccionEntrega = direcccionEntrega;
	}

}
