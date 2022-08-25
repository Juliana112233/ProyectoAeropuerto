
package Proyecto;

public class Vuelo {
    private String identificador;
    private String ciudadOrigen;
    private String ciudadDestino;
    private Double precio;
    private int numActualPasajeros;
    private Pasajero listaPasajeros[]; //arreglo de objetos

    public Vuelo(String identificador, String ciudadOrigen, String ciudadDestino, Double precio) {
        this.identificador = identificador;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.precio = precio;
        this.numActualPasajeros = 0;
        this.listaPasajeros = new Pasajero[5];
        
    }
    public void insertarPasajero(Pasajero pasajero){
        listaPasajeros[numActualPasajeros] = pasajero;// numActualPasajero se usa como iterador
        numActualPasajeros++;
        
    }

    public String getIdentificador() {
        return identificador;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public Double getPrecio() {
        return precio;
    }


    public int getNumActualPasajeros() {
        return numActualPasajeros;
    }
    
    public Pasajero getPasajero(int i){
        return listaPasajeros[i];
        
    }
    
    public Pasajero getPasajero(String pasaporte){
        boolean encontrado = false;
        int i=0;
        Pasajero pas=null;
        while((!encontrado) && (i<listaPasajeros.length)){ //encontrado==false = !encontrado
            if(pasaporte == listaPasajeros[i].getPasaporte()){ //if(pasaporte.equals(listaPasajeros[i].getPasaporte())){
                encontrado = true;
                pas = listaPasajeros[i];
        
            }
            i++;
        }   
        return pas;
    }
    
}
