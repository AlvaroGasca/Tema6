/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.libro;

/**
 *
 * @author alvarogasca
 */
public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;
    
    public Libro(){
    }
    
    Libro(String titulo, String autor, int ejemplares, int prestados){
        this.autor=autor;
        this.ejemplares=ejemplares-prestados;
        this.prestados=prestados;
        this.titulo=titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getEjemplares() {
        return ejemplares;
    }

    public int getPrestados() {
        return prestados;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }

    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }
    
    public boolean prestamo(){
        boolean res=false;
        prestados++;
        ejemplares--;
        if(ejemplares-prestados>=0){
            res=true;
        }
            return res;
    }
    
    public boolean devolucion(){
        boolean res=false;
        prestados--;
        ejemplares++;
        if(ejemplares-prestados>0){
            res=true;
        }
        return res;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
    
}
