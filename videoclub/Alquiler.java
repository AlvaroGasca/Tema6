/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.videoclub;

/**
 *
 * @author alvarogasca
 */
public class Alquiler {
    private int numero;
    private Cabecera cabecera;
    private Cuerpo cuerpo;
    private Ejemplar ejemplar;
    
    public Alquiler(){
    }
    
    public Alquiler(int numero, Cabecera cabecera, Cuerpo cuerpo, Ejemplar ejemplar){
        this.cabecera=cabecera;
        this.cuerpo=cuerpo;
        this.ejemplar=ejemplar;
        this.numero=numero;
    }
    
    
    
}
