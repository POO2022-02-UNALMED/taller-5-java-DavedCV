package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public int halcones;
    public int aguilas;
    private String colorPlumas;

    public Ave(){}

    public Ave(String nombre, int edad, String habitat, String genero, Zona zonas, String colorPlumas) {
        super(nombre, edad, habitat, genero, zonas);
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "volar";
    }

    public Ave crearHalcon(String nombre, int edad, String genero, Zona zonas){
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, zonas, "cafe glorioso");
    }

    public Ave crearAguila(String nombre, int edad, String genero, Zona zonas){
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, zonas, "blanco y amarillo");
    }

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }
}
