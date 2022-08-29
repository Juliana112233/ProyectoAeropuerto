
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
            aero[0] = new AeropuertoInternacional(1, "El Eden", "Armenia", "Colombia"); //Primero se crea un aeropuerto
            aero[0].insertarCompañia(new Compañia("AVIANCA")); //se insertan las compañías
            aero[0].insertarCompañia(new Compañia("EASYFLY")); //se insertan las compañías
            aero[0].insertarCompañia(new Compañia("SPIRIT AIRLINES"));
            aero[0].insertarCompañia(new Compañia("LATAM"));
            aero[0].insertarCompañia(new Compañia("VIVA AIR"));
            aero[0].insertarCompañia(new Compañia("WINGO(Próximamente en oct-2022)"));
            aero[0].getCompañia("AVIANCA").insertarVuelo(new Vuelo("AV01","Armenia", "Bogota", 150.90)); //obtener cada compañia e insertar los vuelos
            aero[0].getCompañia("EASYFLY").insertarVuelo(new Vuelo("EF01","Armenia", "Bogota", 180.99));
            aero[0].getCompañia("EASYFLY").insertarVuelo(new Vuelo("EF02", "Armenia", "Medellin", 300.0));
            aero[0].getCompañia("SPIRIT AIRLINES").insertarVuelo(new Vuelo("SA01","Armenia", "Fort Lauderdale", 500.90));
            aero[0].getCompañia("LATAM").insertarVuelo(new Vuelo("LA01","Armenia", "Bogotá", 500.90));
            aero[0].getCompañia("AVIANCA").getVuelo("AV01").insertarPasajero(new Pasajero("Alejandro", "PER1BP", "Peruana", 22, "Hombre"));//luego obtener la compañia, obtener el vuelo e insertar el pasajero
            aero[0].getCompañia("EASYFLY").getVuelo("EF01").insertarPasajero(new Pasajero("Camila", "EC2IOT", "Ecuatoriana", 13, "Mujer"));
            aero[0].getCompañia("EASYFLY").getVuelo("EF02").insertarPasajero(new Pasajero("Adele", "BR3YEG", "Británica", 30, "Mujer"));
            aero[0].getCompañia("SPIRIT AIRLINES").getVuelo("SA01").insertarPasajero(new Pasajero("Carl", "US4GIE", "Estadounidense", 30, "Hombre"));
            aero[0].getCompañia("LATAM").getVuelo("LA01").insertarPasajero(new Pasajero("Juan", "CO5QRU", "Colombiana", 23, "Hombre"));
 
            //AEROPUERTO NACIONAL LA NUBIA
            
            aero[1] = new AeropuertoNacional("La Nubia", "Manizales", "Colombia");
            String empresas[] = {"Inficaldas"};
            ((AeropuertoNacional)aero[1]).insertarEmpresas(empresas);
            aero[1].insertarCompañia(new Compañia("EASYFLY"));
            aero[1].getCompañia("EASYFLY").insertarVuelo(new Vuelo("EF03", "Manizales", "Bogotá", 1000.99));
            aero[1].getCompañia("EASYFLY").insertarVuelo(new Vuelo("EF04", "Manizales", "Cartagena", 1000.99));
            aero[1].getCompañia("EASYFLY").insertarVuelo(new Vuelo("EF05", "Manizales", "Medellín", 1000.99));
            aero[1].getCompañia("EASYFLY").getVuelo("EF03").insertarPasajero(new Pasajero("David", "ES623", "Español", 45, "Hombre"));
            aero[1].getCompañia("EASYFLY").getVuelo("EF04").insertarPasajero(new Pasajero("Marta", "CO7IRG", "Colombiana", 37, "Mujer"));
            aero[1].getCompañia("EASYFLY").getVuelo("EF05").insertarPasajero(new Pasajero("Pablo", "AR8UEH", "Argentino", 60, "Hombre"));
            
           
            aero[2] = new AeropuertoInternacional(2, "Matecania", "Pereira", "Colombia");
            aero[2].insertarCompañia(new Compañia("AMERICAN AIRLINES"));
            aero[2].insertarCompañia(new Compañia("COPA AIRLINES"));
            aero[2].insertarCompañia(new Compañia("AVIANCA"));
            aero[2].insertarCompañia(new Compañia("LATAM"));
            aero[2].insertarCompañia(new Compañia("VIVA AIR"));
            aero[2].insertarCompañia(new Compañia("EASYFLY"));
            aero[2].insertarCompañia(new Compañia("ULTRA AIR"));
            aero[2].insertarCompañia(new Compañia("GCA AIRLINES"));
            aero[2].getCompañia("AMERICAN AIRLINES").insertarVuelo(new Vuelo("AA01", "Pereira", "Miami", 1000.0));
            aero[2].getCompañia("COPA AIRLINES").insertarVuelo(new Vuelo("CA01", "Pereira", "Panamá", 899.99));
            aero[2].getCompañia("AVIANCA").insertarVuelo(new Vuelo("AV02", "Pereira", "Bogotá", 999.99));
            aero[2].getCompañia("AVIANCA").insertarVuelo(new Vuelo("AV03", "Pereira", "Cartagena", 1250.99));
            aero[2].getCompañia("AVIANCA").insertarVuelo(new Vuelo("AV04", "Pereira", "Santa Marta", 1000.0));
            aero[2].getCompañia("LATAM").insertarVuelo(new Vuelo("LA02", "Pereira", "Bogotá", 899.99));
            aero[2].getCompañia("LATAM").insertarVuelo(new Vuelo("LA03", "Pereira", "Cartagena", 999.99));
            aero[2].getCompañia("LATAM").insertarVuelo(new Vuelo("LA04", "Pereira", "Medellín", 1250.99));
            aero[2].getCompañia("VIVA AIR").insertarVuelo(new Vuelo("A0002", "Pereira", "Bogotá", 899.99));
            aero[2].getCompañia("VIVA AIR").insertarVuelo(new Vuelo("V001", "Pereira", "Cartagena", 999.99));
            aero[2].getCompañia("VIVA AIR").insertarVuelo(new Vuelo("V002", "Pereira", "Medellín", 1250.99));
            aero[2].getCompañia("VIVA AIR").insertarVuelo(new Vuelo("A0002", "Pereira", "Santa Marta", 899.99));
            aero[2].getCompañia("VIVA AIR").insertarVuelo(new Vuelo("V001", "Pereira", "San Andrés", 999.99));
            aero[2].getCompañia("EASYFLY").insertarVuelo(new Vuelo("EF06", "Pereira", "Bogotá", 1250.99));
            aero[2].getCompañia("EASYFLY").insertarVuelo(new Vuelo("V002", "Pereira", "Medellín", 1250.99));
            aero[2].getCompañia("EASYFLY").insertarVuelo(new Vuelo("V002", "Pereira", "Medellín", 1250.99));
            aero[2].getCompañia("EASYFLY").insertarVuelo(new Vuelo("V002", "Pereira", "Villavicencio", 1250.99));
            aero[2].getCompañia("ULTRA AIR").insertarVuelo(new Vuelo("V002", "Pereira", "Cartagena", 1250.99));
            aero[2].getCompañia("ULTRA AIR").insertarVuelo(new Vuelo("V002", "Pereira", "San Andrés", 1250.99));
            aero[2].getCompañia("GCA AIRLINES").insertarVuelo(new Vuelo("V002", "Pereira", "San Andrés", 1250.99));
            aero[2].getCompañia("AMERICAN AIRLINES").getVuelo("AA01").insertarPasajero(new Pasajero("Marcus", "BS1RIH", "Brasileña", 31, "Hombre"));
            aero[2].getCompañia("COPA AIRLINES").getVuelo("CA01").insertarPasajero(new Pasajero("Sara", "CO1EUF", "Colombiana", 10, "Mujer"));
            aero[2].getCompañia("AVIANCA").getVuelo("AV02").insertarPasajero(new Pasajero("Penélope", "CA1YFY", "Canadiense", 20, "Mujer"));
            aero[2].getCompañia("AVIANCA").getVuelo("AV03").insertarPasajero(new Pasajero("Sebastián", "CO1UTY", "Colombiana", 29, "Hombre"));
            aero[2].getCompañia("AVIANCA").getVuelo("AV04").insertarPasajero(new Pasajero("Valentina", "CO1HGT", "Colombiana", 19, "Mujer"));
            aero[2].getCompañia("AVIANCA").getVuelo("AV02").insertarPasajero(new Pasajero("Andrés", "CO1FGR", "Colombiana", 23, "Hombre"));
            
            
            
            
            
            
            
        }
        public static void menu(){
            String nombreAeropuerto, nombreCompañia, origen, destino;
            int opcion;
            Aeropuerto aeropuerto;
            Compañia compañia;
            
            do{
                System.out.println("\t.:MENU:.");
                System.out.println("1. Ver Aeropuertos Nacionales e Internacionales del Eje Cafetero en Colombia");
                System.out.println("2. Ver número de destinos Internacionales (Aeropuerto Internacional) o Entidades financiadoras (Aeropuerto Nacional)");
                System.out.println("3. Lista de aerolíneas del Aeropuerto Elegido");
                System.out.println("4. Lista de vuelos que ofrecen las aerolíneas");
                System.out.println("5. Consultar vuelos de acuerdo al Origen y destino");
                System.out.println("6. Salir");
                System.out.println("Opcion: ");
                opcion = entrada.nextInt();
                
                switch(opcion){
                    case 1: //Ver aeropuertos gestionados Nacion1ales e Internacionales
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
                    default: System.out.println("La opción de menú que digitó no existe");             
                }
            }while(opcion!=6);
        }
            public static void mostrarDatosAeropuertos(Aeropuerto aeropuertos[]){
                for (int i = 0; i < aeropuertos.length; i++) {
                    if (aeropuertos[i] instanceof AeropuertoNacional) {
                        System.out.println("Aeropuerto Nacional");
                        System.out.println("Nombre: "+aeropuertos[i].getNombre());
                        System.out.println("Ciudad: "+aeropuertos[i].getCiudad());
                        System.out.println("Pais: "+aeropuertos[i].getPais());
                        
                    }
                    else{
                         System.out.println("Aeropuerto Internacional");
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
                    System.out.println("Aeropuerto Nacional: "+aeropuertos[i].getNombre());
                    empresas = ((AeropuertoNacional)aeropuertos[i]).getListaEmpresas(); // hacer downcasting para acceder a lo de aeropuerto privado
                        for (int j = 0; j < empresas.length; j++) {
                            System.out.println(empresas[j]);
                        }
                }
                    else{
                        System.out.println("Aeropuerto Internacional: "+aeropuertos[i].getNombre());
                        System.out.println("Numero de destinos internacionales: "+((AeropuertoInternacional)aeropuertos[i]).getnumeroDestinosInternacionales());
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
                    System.out.println("Ciudad de Origen: "+vuelo.getCiudadOrigen());
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
