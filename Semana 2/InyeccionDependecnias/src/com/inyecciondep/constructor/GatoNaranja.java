package com.inyecciondep.constructor;

public class GatoNaranja implements Gato{
	
	private String color;
	
	public GatoNaranja(String color) {
		this.color = color;
	}
	
	@Override
	public void adoptar() {
		System.out.println("Adoptaste al gato " + color);
	}

}
