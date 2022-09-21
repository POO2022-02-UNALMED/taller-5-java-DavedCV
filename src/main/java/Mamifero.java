package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Mamifero extends Animal{
    private static ArrayList<Mamifero> listado;
    public int caballos;
    public int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero(){}

    public Mamifero(String nombre, int edad, String habitat, String genero, Zona zonas, boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero, zonas);
        this.listado = listado;
        this.caballos = caballos;
        this.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;
    }

    public static int cantidadMamiferos(){
        return listado.size();
    }

    public Mamifero crearCaballo(String nombre,int edad, String genero, Zona zonas){
        caballos++;
        return new Mamifero(nombre, edad, "pradera", genero, zonas, true,4);
    }

    public void crearLeon(String nombre,int edad, String genero, Zona zonas){
        leones++;
        return new Mamifero(nombre, edad, "selva", genero, zonas, true, 4);
    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
}
