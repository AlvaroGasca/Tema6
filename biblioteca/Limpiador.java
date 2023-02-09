/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.biblioteca;

/**
 *
 * @author alvarogasca
 */
public class Limpiador extends Empleado {
    boolean findes;
    
    Limpiador(){
    }
    Limpiador(String n, String d, int s, boolean findes){
        this.nombre=n;
        this.findes=findes;
    }

    public boolean isFindes() {
        return findes;
    }

    public void setFindes(boolean findes) {
        this.findes = findes;
    }

    @Override
    public String toString() {
        return "Limpiador{" + "findes=" + findes + '}';
    }
    
    
}
