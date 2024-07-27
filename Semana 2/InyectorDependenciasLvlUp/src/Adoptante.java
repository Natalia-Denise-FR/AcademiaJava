
// Clase del adoptante
public class Adoptante {
    private String nombre;

    public Adoptante(String nombre) {
        this.nombre = nombre;
    }

    //Se definen los getters y setters para obtener los datos de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void adoptarGato(RefugioGatos refugio, String color) {
        Gato gato = refugio.adoptarGato(color);
        if (gato != null) {
            System.out.println(nombre + " ha adoptado al gato " + gato.getNombre() + " de color " + gato.getColor());
        } else {
            System.out.println(nombre + " no pudo adoptar un gato de color " + color);
        }
    }
}
