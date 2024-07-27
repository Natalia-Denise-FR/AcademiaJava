package com.inyecciondep;

//Se declara la clase inyector
public class Inyector {
	
	//Se declara método estático 
	static void inyectarGato(Adoptante adop) {
		adop.gatoAdoptado = new GatoNaranja("naranjoso"); 
	}

}
