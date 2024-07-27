package com.inyecciondep;

//Se decalra la clase del Adoptante
public class Adoptante {
	
	//Se definen sus atributos 
	private String nombre;
	Gato gatoAdoptado;

	//Se genera el constructor del adoptante 
	public Adoptante(String nombre) {
		this.nombre = nombre;
	}
	
	
	//Se crea un métodos para adoptar un gato
	void adoptarGato() {
		System.out.println(nombre);
		gatoAdoptado.adoptar();
	}
	
	

}
