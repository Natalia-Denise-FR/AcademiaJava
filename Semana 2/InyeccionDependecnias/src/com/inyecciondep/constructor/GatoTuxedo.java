package com.inyecciondep.constructor;

public class GatoTuxedo implements Gato{
	
	private String color;
	
	public GatoTuxedo(String color) {
		this.color = color;
	}
	
	@Override
	public void adoptar() {
		System.out.println("Adoptaste al gato " + color);
	}

}
