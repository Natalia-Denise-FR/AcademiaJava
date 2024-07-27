
// Clase que representa el refugio de gatos
public class RefugioGatos {
    private PapeleoGatos gatoPapeleo;

    // Inyección de dependencias a través del constructor
    public RefugioGatos(PapeleoGatos papeleoGatos) {
        this.gatoPapeleo = papeleoGatos;
    }

    public void recibirGato(Gato gato) {
    	gatoPapeleo.registrarGato(gato);
        System.out.println("El gato " + gato.getNombre() + " ha sido recibido en el refugio.");
    }

    public Gato adoptarGato(String color) {
        return gatoPapeleo.adoptarGato(color);
    }
}
