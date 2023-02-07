/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.videoclub;

/**
 *
 * @author alvarogasca
 */
public class Cabecera {
    private Cliente cliente;
    private Fecha_entrega fecha;
    
    public Cabecera(){
    }
    
    public Cabecera(Cliente cliente,Fecha_entrega fecha){
        this.fecha=fecha;
        this.cliente=cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
