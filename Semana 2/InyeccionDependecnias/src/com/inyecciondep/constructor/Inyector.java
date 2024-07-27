package com.inyecciondep.constructor;

public class Inyector {
	
	static Adoptante getAdoptante() {
		Gato GatoNaranja = new GatoNaranja("naranjoso");
		Gato GatoTuxedo = new GatoTuxedo("tuxedo");
		return new Adoptante("Raúl", GatoTuxedo);
	}

}
