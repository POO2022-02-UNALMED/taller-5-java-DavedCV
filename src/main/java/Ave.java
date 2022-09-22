package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Ave extends Animal{
    private static ArrayList<Ave> listado;
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public Ave(){}

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
    }

    public static int cantidadAves(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "volar";
    }

    public static Ave crearHalcon(String nombre, int edad, String genero){
        halcones++;
        return new Ave(nombre, edad, "montanas", genero, zonas, "cafe glorioso");
    }

    public static Ave crearAguila(String nombre, int edad, String genero){
        aguilas++;
        return new Ave(nombre, edad, "montanas", genero, zonas, "blanco y amarillo");
    }

}
