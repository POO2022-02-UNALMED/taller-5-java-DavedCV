package gestion;
import java.util.ArrayList;

public class Zoologico {

    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas;

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion, ArrayList<Zona> zona){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zona;
    }

    public void agregarZonas(Zona zona){
        this.zonas.add(zona);
    }

    public int cantidadTotalAnimales(){
        int total = zonas.stream().reduce(0,(subtotal,zona) -> subtotal+zona.cantidadAnimales(),Integer::sum);
        return total;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
}
