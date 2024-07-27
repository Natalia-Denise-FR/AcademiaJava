package com.inyecciondep.setter;

public class Adoptante {
	
	private String nombre;
	private Gato gatoAdoptado;

	public Adoptante(String nombre) {
		this.nombre = nombre;
	}
	
	//Se definieron los getters y setters
	public Gato getGatoAdoptado() {
		return gatoAdoptado;
	}

	public void setGatoAdoptado(Gato gatoAdoptado) {
		this.gatoAdoptado = gatoAdoptado;
	}

	void adoptarGato() {
		System.out.println(nombre);
		gatoAdoptado.adoptar();
	}
	
	

}
