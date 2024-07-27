package com.inyecciondep.setter;

public class Inyector {
	
	static void inyectarGato(Adoptante adop) {
		adop.setGatoAdoptado(new GatoNaranja("naranjoso"));
	}

}
