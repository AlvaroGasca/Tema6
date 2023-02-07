/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.videoclub;

/**
 *
 * @author alvarogasca
 */
public class Ejemplar {
    private int codigo;
    private String nombre;
    private int precio;
    
    public Ejemplar(){
    }
    
    public Ejemplar(int codigo, String nombre, int precio){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
    
}
