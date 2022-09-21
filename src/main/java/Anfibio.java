package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Anfibio extends Animal{
    private static ArrayList<Anfibio> listado;
    public int ranas;
    public int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){}

    public Anfibio(String nombre, int edad, String habitat, String genero, Zona zonas, String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero, zonas);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static int cantidadAnfibios(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "saltar";
    }

    public Anfibio crearRana(String nombre, int edad, String genero, Zona zonas){
        ranas++;
        return new Anfibio(nombre, edad, "selva", genero, zonas, "rojo",true);
    }

    public Anfibio crearSalamandra(String nombre, int edad, String genero, Zona zonas){
        salamandras++;
        return new Anfibio(nombre, edad, "selva", genero, zonas, "negro y amarillo",false);
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
}
