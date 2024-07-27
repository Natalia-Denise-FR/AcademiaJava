
import java.util.ArrayList;
import java.util.List;

public class PapeleoGatosImpl implements PapeleoGatos {
    private List<Gato> gatos = new ArrayList<>();

    @Override
    public void registrarGato(Gato gato) {
        gatos.add(gato);
        System.out.println("Se registró al gato: " + gato.getNombre());
    }

    @Override
    public Gato adoptarGato(String color) {
        for (Gato gato : gatos) {
            if (gato.getColor().equalsIgnoreCase(color)) {
                gatos.remove(gato);
                System.out.println("El gato " + gato.getNombre() + " de color " + color + " ha sido adoptado.");
                return gato;
            }
        }
        System.out.println("No tenemos del color " + color + " disponibles para adoptar.");
        return null;
    }
}