
package Proyecto;

import java.util.Scanner;

public class Principal {
    
        static Scanner entrada = new Scanner(System.in);
        final static int num = 3; // numero de aeropuertos
        static Aeropuerto aeropuertos[] = new Aeropuerto[num];
                
        public static void main(String[] args){
            
            //insertar datos de los aeropuertos
            insertarDatosAeropuerto(aeropuertos);
            menu();
        }
   //PARA RELLENAR LOS DATOS
        public static void insertarDatosAeropuerto(Aeropuerto aero[]){
            //AEROPUERTO 1 PUBLICO
            aero[0] = new AeropuertoInternacional(80000000, "Jorge Chavez", "Lima", "Peru"); //Primero se crea un aeropuerto
            aero[0].insertarCompañia(new Compañia("AeroPeru")); //se insertan las compañías
            aero[0].insertarCompañia(new Compañia("LATAM")); //se insertan las compañías
            aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB20","Lima", "Mexico", 150.90, 150)); //obtener cada compañia e insertar los vuelos
            aero[0].getCompañia("AeroPeru").insertarVuelo(new Vuelo("IB21","Lima", "Buenos Aires", 180.99, 120));
            aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("FC12","Lima", "Londres", 500.90, 180));
            aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Alejandro", "20BGHP", "Peruana"));//luego obtener la compañia, obtener el vuelo e insertar el pasajero
            aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertarPasajero(new Pasajero("Maria", "PJKL20", "Mexicana"));
            aero[0].getCompañia("LATAM").getVuelo("FC12").insertarPasajero(new Pasajero("Raul", "JH21KL", "Peruana"));
            
            //AEROPUERTO 2 PRIVADO
            aero[1] = new AeropuertoNacional("Central ciudad Real", "Ciudad Real", "España");
            aero[1].insertarCompañia(new Compañia("AirEuropa"));
            String empresas[] = {"Cobresol","Anguila34"};
            ((AeropuertoNacional)aero[1]).insertarEmpresas(empresas);
            aero[1].getCompañia("AirEuropa").insertarVuelo(new Vuelo("AF025", "Madrid", "Buenos aires", 1000.99, 30));
            aero[1].getCompañia("AirEuropa").getVuelo("AF025").insertarPasajero(new Pasajero("David", "56784", "Español"));
            
           
            aero[2] = new AeropuertoInternacional(5000000, "El Dorado", "Bogotá", "Colombia");
            aero[2].insertarCompañia(new Compañia("Avianca"));
            aero[2].insertarCompañia(new Compañia("VivaAir"));
            aero[2].getCompañia("Avianca").insertarVuelo(new Vuelo("A001", "Bogotá", "Paris", 1000.0, 50));
            aero[2].getCompañia("Avianca").insertarVuelo(new Vuelo("A0002", "Bogotá", "Londres", 899.99, 45));
            aero[2].getCompañia("VivaAir").insertarVuelo(new Vuelo("V001", "Bogotá", "Roma", 999.99, 38));
            aero[2].getCompañia("VivaAir").insertarVuelo(new Vuelo("V002", "Bogotá", "Paris", 1250.99, 35));
            aero[2].getCompañia("Avianca").getVuelo("A001").insertarPasajero(new Pasajero("Juliana", "12345", "Colombiana"));
            aero[2].getCompañia("VivaAir").getVuelo("V001").insertarPasajero(new Pasajero("Juan", "34567", "Mexicana"));
            aero[2].getCompañia("Avianca").getVuelo("A001").insertarPasajero(new Pasajero("Victoria", "78901", "Argentina"));
            aero[2].getCompañia("VivaAir").getVuelo("V001").insertarPasajero(new Pasajero("Juan", "98765", "Uruguaya"));
            aero[2].getCompañia("Avianca").getVuelo("A001").insertarPasajero(new Pasajero("Karen", "4321", "Chilena"));
            aero[2].getCompañia("VivaAir").getVuelo("V001").insertarPasajero(new Pasajero("Marco", "11111", "Brasileño"));
            
        }
        public static void menu(){
            String nombreAeropuerto, nombreCompañia, origen, destino;
            int opcion;
            Aeropuerto aeropuerto;
            Compañia compañia;
            
            do{
                System.out.println("\t.:MENU:.");
                System.out.println("1. Ver Aeropuertos gestionados");
                System.out.println("2. Ver empresas (Privado) o Subvención (Público)");
                System.out.println("3. Lista de Compañias de un Aeropuerto");
                System.out.println("4. Lista de vuelos por Compañia");
                System.out.println("5. Listar posibles vuelos de origen a Destino");
                System.out.println("6. Salir");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();
                
                switch(opcion){
                    case 1: //Ver aeropuertos gestionados (publicos o privados)
                        System.out.println(""); //para separar del menu
                        mostrarDatosAeropuertos(aeropuertos);
                        break;
                    case 2: // Ver empresas (Privada) o subvencion (Pública)
                        System.out.println("");
                        mostrarPatrocinio(aeropuertos); 
                        break;
                    case 3: //Listas compañias de un aeropuerto
                        entrada.nextLine();
                        System.out.print("\nDigite el nombre del Aeropuerto: ");
                        nombreAeropuerto = entrada.nextLine();
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        if(aeropuerto==null){
                            System.out.println("El aeropuerto no existe");
                        }
                        else{
                            mostrarCompañias(aeropuerto);
                        }
                        break;
                    case 4: //Lista de vuelos por compañía
                        entrada.nextLine();
                        System.out.print("Digite el nombre del Aeropuerto: ");
                        nombreAeropuerto = entrada.nextLine();
                        aeropuerto = buscarAeropuerto(nombreAeropuerto, aeropuertos);
                        if(aeropuerto==null){
                            System.out.println("El Aeropuerto no existe");
                        }
                        else {
                            System.out.print("Digite el nombre de la compañia: ");
                            nombreCompañia = entrada.nextLine();
                            compañia = aeropuerto.getCompañia(nombreCompañia);
                            mostrarVuelos(compañia);
                        }
                        
                        break;
                    case 5://Listar posibles vuelos de origen a destino
                        entrada.nextLine();
                        System.out.print("Digite la ciudad de origen: ");
                        origen = entrada.nextLine();
                        System.out.print("Digite la ciudad de destino: ");
                        destino = entrada.nextLine();
                        mostrarVueloOrigenDestino(origen, destino, aeropuertos);
                        
                        break;
                    case 6:
                        break;
                    default: System.out.println("Se equivocó de opción de menú");             
                }
            }while(opcion!=6);
        }
            public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
                for (int i = 0; i < aeropuertos.length; i++) {
                    if (aeropuertos[i] instanceof AeropuertoNacional) {
                        System.out.println("Aeropuerto Privado");
                        System.out.println("Nombre: "+aeropuertos[i].getNombre());
                        System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                        System.out.println("Pais: "+aeropuertos[i].getPais());
                        
                    }
                    else{
                         System.out.println("Aeropuerto Publico");
                        System.out.println("Nombre: "+aeropuertos[i].getNombre());
                        System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                        System.out.println("Pais: "+aeropuertos[i].getPais());
                    }
                    System.out.println("");
                }
            }
            // para la opción 2 del menú
            public static void mostrarPatrocinio(Aeropuerto aeropuertos[]){
                String empresas[];
                for (int i = 0; i <aeropuertos.length; i++) {
                    if (aeropuertos[i] instanceof AeropuertoNacional){
                    System.out.println("Aeropuerto Privado: "+aeropuertos[i].getNombre());
                    empresas = ((AeropuertoNacional)aeropuertos[i]).getListaEmpresas(); // hacer downcasting para acceder a lo de aeropuerto privado
                        for (int j = 0; j < empresas.length; j++) {
                            System.out.println(empresas[j]);
                        }
                }
                    else{
                        System.out.println("Aeropuerto Publico: "+aeropuertos[i].getNombre());
                        System.out.println("Subvencion: "+((AeropuertoInternacional)aeropuertos[i]).getSubvencion());
                    }
                    System.out.println("");
                }
                
            }
            
            public static Aeropuerto buscarAeropuerto(String nombre, Aeropuerto aeropuertos[]){
                boolean encontrado = false;
                int i = 0;
                Aeropuerto aero = null; //aeropuerto nuevo aero
                while((!encontrado) && (i<aeropuertos.length)){
                    if(nombre.equals(aeropuertos[i].getNombre())){
                        encontrado = true;
                        aero = aeropuertos[i];
                    }
                    i++;
                }
                return aero;
            }
            //las compañias del aeropuerto
            public static void mostrarCompañias(Aeropuerto aeropuerto){
                System.out.println("\nLas compañias del aeropuerto: "+aeropuerto.getNombre());
                for (int i = 0; i < aeropuerto.getNumCompañia(); i++) { //recorrer tantas compañias hay en x aeropuerto
                    System.out.println(aeropuerto.getCompañia(i).getNombre());
                }
            }
            
            public static void mostrarVuelos(Compañia compañia){
                Vuelo vuelo;
                System.out.println("Los vuelos de la compañia: "+compañia.getNombre());
                for (int i = 0; i < compañia.getNumVuelo(); i++) {
                    vuelo = compañia.getVuelo(i);
                    System.out.println("Identificador: "+vuelo.getIdentificador());
                    System.out.println("Ciudad de Origen: "+vuelo.getCiudadDestino());
                    System.out.println("Ciudad de Destino "+vuelo.getCiudadDestino());
                    System.out.println("Precio: $"+vuelo.getPrecio());
                    System.out.println("");           
                }
}
            public static Vuelo[] buscarVuelosOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
                Vuelo vuelo;
                int contador = 0;
                Vuelo listaVuelos[];
                //necesito crear un arreglo de vuelos y eso es lo que voy a retornar 
                
                for (int i = 0; i < aeropuertos.length; i++) { //recorremos los aeropuertos
                    for (int j = 0; j < aeropuertos[i].getNumCompañia(); j++) { //recorremos las compañias
                        for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumVuelo(); k++) {//recorremos los vuelos
                            vuelo = aeropuertos[i].getCompañia(j).getVuelo(k); // porque vamos a recorrer una por una las compañias, getcompañia (j)porque es el iterador que va a recorrer las compañias
                            if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){ // si el vuelo de la ciudad de origen es igual a alguna ciudad de origen que hay en algún vuelo 
                            contador++; //necesita crear un arreglo de vuelos y luego devolver ese arreglo
                            // conteo: contabilizar cuantos vuelos coinciden con esa ciudad de origen y de destino
                        }
                            
                        }
                        
                    }

                    }
                 listaVuelos = new Vuelo[contador];
                    int q=0;
                    for (int i = 0; i < aeropuertos.length; i++) { //recorremos aeropuertos y se guarda en i
                        for (int j = 0; j < aeropuertos[i].getNumCompañia(); j++) { //recorremos i para buscar las compañías
                            for (int k = 0; k < aeropuertos[i].getCompañia(j).getNumVuelo(); k++) { //recorremos j para buscar los vuelos
                                vuelo = aeropuertos[i].getCompañia(j).getVuelo(k);
                                if((origen.equals(vuelo.getCiudadOrigen())) && (destino.equals(vuelo.getCiudadDestino()))){
                                    listaVuelos[q] = vuelo;
                                q++; 
                                }
 
                            }
                            
                        }
                    }
                    return listaVuelos;
            }
            
        public static void mostrarVueloOrigenDestino(String origen, String destino, Aeropuerto aeropuertos[]){
             Vuelo vuelos[];
             vuelos = buscarVuelosOrigenDestino(origen, destino, aeropuertos); // toda la lista que he retornado ahora están en vuelos
             if(vuelos.length==0){
                 System.out.println("No existen vuelos de esa ciudad origen a destino");
             }
             else{
                 System.out.println("Vuelos Encontrados: ");
                 for (int i = 0; i < vuelos.length; i++) {
                     System.out.println("Identificador: "+vuelos[i].getIdentificador());
                     System.out.println("Ciudad de Origen: "+vuelos[i].getCiudadOrigen());
                     System.out.println("Ciudad de Destino: "+vuelos[i].getCiudadDestino());
                     System.out.println("Precio: $"+vuelos[i].getPrecio());
                     System.out.println("");
                 }
             }
        }
        
}
