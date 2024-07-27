package com.inyecciondep;

public class Principal {
	
	public static void main(String[] args) {
		
		Adoptante adoptante = new Adoptante("Karen: ");
		
		Inyector.inyectarGato(adoptante);
		
		adoptante.adoptarGato();
	}

}
