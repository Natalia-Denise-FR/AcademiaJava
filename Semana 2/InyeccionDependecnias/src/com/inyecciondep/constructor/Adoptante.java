package com.inyecciondep.constructor;

public class Adoptante {
	
	private String nombre;
	private Gato gatoAdoptado;

	//Se define el constructor
	public Adoptante(String nombre, Gato gatoAdoptado) {
		this.nombre = nombre;
		this.gatoAdoptado = gatoAdoptado;
	}
	

	void adoptarGato() {
		System.out.println(nombre);
		gatoAdoptado.adoptar();
	}
	
	

}
