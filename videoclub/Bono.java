/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.videoclub;

/**
 *
 * @author alvarogasca
 */
class Bono {
    private int credito;
    private int periodo;
    private int costo;
    
    public Bono(){
    }
    
    public Bono(int credito, int periodo, int costo){
        this.credito=credito;
        this.periodo=periodo;
        this.costo=costo;
    }

    public int getCredito() {
        return credito;
    }

    public int getPeriodo() {
        return periodo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }
    
    
}
