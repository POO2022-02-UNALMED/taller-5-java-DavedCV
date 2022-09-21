package zooAnimales;

import gestion.Zona;

import java.util.ArrayList;

public class Reptil extends Animal{
    private static ArrayList<Reptil> listado;
    public int iguanas;
    public int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil(){}

    public Reptil(String nombre, int edad, String habitat, String genero, Zona zonas, String colorEscamas, int largoCola) {
        super(nombre, edad, habitat, genero, zonas);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static int cantidadReptiles(){
        return listado.size();
    }

    @Override
    public String movimiento(){
        return "reptar";
    }

    public Reptil crearIguana(String nombre, int edad, String genero, Zona zonas){
        iguanas++;
        return new Reptil(nombre, edad, "humedal", genero, zonas, "verde", 3);
    }

    public Reptil crearSerpiente(String nombre, int edad, String genero, Zona zonas){
        serpientes++;
        return new Reptil(nombre, edad, "jungla", genero, zonas, "blanco", 1);
    }

    public static ArrayList<Reptil> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Reptil> listado) {
        Reptil.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getLargoCola() {
        return largoCola;
    }

    public void setLargoCola(int largoCola) {
        this.largoCola = largoCola;
    }
}
