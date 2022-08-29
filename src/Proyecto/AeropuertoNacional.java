/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto;


public class AeropuertoNacional extends Aeropuerto {
    private String listaEmpresas[] = new String[1];
    private int numEmpresa;

    public AeropuertoNacional(String nombre, String ciudad, String pais) {
        super(nombre, ciudad, pais);
    }

    public AeropuertoNacional(String nombre, String ciudad, String pais, Compañia[] c, String e[]) {
        super(nombre, ciudad, pais, c);
        this.listaEmpresas = e;
        numEmpresa = e.length;
    }
    //método para insertar todas las empresas 
    public void insertarEmpresas(String e[]){ //hay que mandarle todas las empresas en un arreglo e
        this.listaEmpresas = e; //estoy copiando de arreglo hacia arreglo (de e a listaEmpresas
        this.numEmpresa = e.length;//estoy diciendole cuantos elementos tiene el arreglo
           
    }
    //método para ingresar empresas una por una
    public void insertarEmpresa(String e){
        listaEmpresas[numEmpresa] = e;
        numEmpresa++;
    }
    //mostrar todas las empresas

    public String[] getListaEmpresas() {
        return listaEmpresas;
    }
    //mostrar un numero de empresa en particular

    public int getNumEmpresa() {
        return numEmpresa;
    }
    
}