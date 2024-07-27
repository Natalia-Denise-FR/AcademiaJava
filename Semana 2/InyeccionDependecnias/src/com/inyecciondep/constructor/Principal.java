package com.inyecciondep.constructor;

public class Principal {
	
	public static void main(String[] args) {
		
		Adoptante adoptante = Inyector.getAdoptante();

		adoptante.adoptarGato();
	}

}
