/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.biblioteca;

/**
 *
 * @author alvarogasca
 */
public class TestBilio {
    public static void main(String[] args) {
        
    Bibliotecario b1 = new Bibliotecario("Miguel", "798fd", 1200, 5);
    Libro l = new Libro("0001", "Poeta en Nueva York", 12,Tematica.poesia , b1);

    System.out.println("El libro se llama: " + l.getTitulo());
    System.out.println("El ISBN es: " + l.getISBN());
    System.out.println("El bibliotecario es: " + b1.getNombre());
    System.out.println("El precio es: " + l.getPrecio());

    if (l.ISBN0()) {
      System.out.println("El ISBN es 0000");
    } else {
      System.out.println("El ISBN no es 0000");
    }
  }
    
}
