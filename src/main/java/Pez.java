package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Pez extends Animal{
    private static ArrayList<Pez> listado;
    public int salmones;
    public int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez(){}

    public Pez(String nombre, int edad, String habitat, String genero, Zona zonas, String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero, zonas);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static int cantidadPeces(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "nadar";
    }

    public Pez crearSalmon(String nombre, int edad, String genero, Zona zonas){
        salmones++;
        return new Pez(nombre, edad, "oceano", genero, zonas, "rojo",6);
    }

    public Pez crearBacalao(String nombre, int edad, String genero, Zona zonas){
        bacalaos++;
        return new Pez(nombre, edad, "oceano", genero, zonas, "gris",6);
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }
}
