/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.biblioteca;

/**
 *
 * @author alvarogasca
 */
public class Bibliotecario extends Empleado {
    int dias;
    
   Bibliotecario(){
   }
   Bibliotecario(String n, String d, int s, int dias){
       this.dias=dias;
       this.nombre=n;
       this.dni=d;
       this.sueldo=s;
   }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return "Bibliotecario{" + "dias=" + dias + '}';
    }
    
}
