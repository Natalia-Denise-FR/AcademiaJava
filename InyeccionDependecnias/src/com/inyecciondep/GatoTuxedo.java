package com.inyecciondep;

//Se declara la clase GatoTuxedo que implementa a Gato
public class GatoTuxedo implements Gato{
	
	//Se define el atributo color de forma privada
	private String color;
	
	//Se declara el constructor del GAtoTuxedo
	public GatoTuxedo(String color) {
		this.color = color;
	}
	
	//Se implementa el método adoptar 
	@Override
	public void adoptar() {
		System.out.println("Adoptaste al gato " + color);
	}

}
