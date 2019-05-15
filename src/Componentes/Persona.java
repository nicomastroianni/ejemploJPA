package Componentes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="tablajpa")
public class Persona {

	@Id
	@Column(name ="id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
	
	public Persona(int unId,String unNombre) {
		this.id = unId;
		this.nombre = unNombre;
	}
	
	public Persona() {}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
