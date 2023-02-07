/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.videoclub;

/**
 *
 * @author alvarogasca
 */
public class Cliente {
    int codigo;
    String nombre;
    Bono bono;
    
    public Cliente(){
    }
    
    public Cliente(int codigo, String nombre, Bono bono){
        this.bono=bono;
        this.codigo=codigo;
        this.nombre=nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
