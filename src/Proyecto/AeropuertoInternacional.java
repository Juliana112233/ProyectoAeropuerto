
package Proyecto;

public class AeropuertoInternacional extends Aeropuerto {
    private int numeroDestinosInternacionales;

    public AeropuertoInternacional(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoInternacional(int numeroDestinosInternacionales, String nombre, String ciudad, String pais, Compañia[] c) {
        super(nombre, ciudad, pais, c);
        this.numeroDestinosInternacionales = numeroDestinosInternacionales;
    }

    public AeropuertoInternacional(int numeroDestinosInternacionales, String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
        this.numeroDestinosInternacionales = numeroDestinosInternacionales;
    }

    public int getnumeroDestinosInternacionales() {
        return numeroDestinosInternacionales;
    }

    
    
}
