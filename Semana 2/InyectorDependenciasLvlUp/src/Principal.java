
public class Principal {

	public static void main(String[] args) {
        // Crear la instancia de la implementación del servicio de gatos
        PapeleoGatos gatoPapeleo = new PapeleoGatosImpl();

        // Inyectar la dependencia en el refugio de gatos
        RefugioGatos refugio = new RefugioGatos(gatoPapeleo);

        // Crear y recibir algunos gatos en el refugio
        Gato gato1 = new Gato("Milanesa", "tuxedo");
        Gato gato2 = new Gato("Mandarino", "naranja");
        Gato gato3 = new Gato("Salem", "negro");
        refugio.recibirGato(gato1);
        refugio.recibirGato(gato2);
        refugio.recibirGato(gato3);

        // Crear un adoptante y adoptar un gato de color negro
        Adoptante adoptante = new Adoptante("Juan");
        adoptante.adoptarGato(refugio, "negro");
    }
}