/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.biblioteca;

/**
 *
 * @author alvarogasca
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private Tematica tematica;
    private int precio;
    private Bibliotecario b;
    
    Libro(){
    }
    Libro(String ISBN, String titulo, int precio, Tematica tematica, Bibliotecario b){
        this.ISBN=ISBN;
        this.b=b;
        this.precio=precio;
        this.tematica=tematica;
        this.titulo=titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public Tematica getTematica() {
        return tematica;
    }

    public int getPrecio() {
        return precio;
    }

    public Bibliotecario getB() {
        return b;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setTematica(Tematica tematica) {
        this.tematica = tematica;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setB(Bibliotecario b) {
        this.b = b;
    }
    
    public boolean ISBN0(){
        return this.ISBN.equals("0000");
    }
}

