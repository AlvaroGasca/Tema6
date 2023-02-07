/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.videoclub;

import java.time.LocalDate;

/**
 *
 * @author alvarogasca
 */
public class Fecha_entrega {
    private LocalDate fecha;
    private Cliente cliente;
    private Alquiler alquiler;
    
    public Fecha_entrega(){
    }
    
    public Fecha_entrega(LocalDate fecha,Cliente cliente,Alquiler alquiler){
        this.alquiler=alquiler;
        this.cliente=cliente;
        this.fecha=fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
