/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.libro;

/**
 *
 * @author alvarogasca
 */
public class TestLibro {
    public static void main(String[] args) {
        Libro l = new Libro("Harry Potter", "J.K. Rowling",10,3);
        
        l.getAutor();
        l.prestamo();
        System.out.println("Numero de ejemplares tras el prestamo: " + l.getEjemplares());
        System.out.println("Numero de prestados tras el prestamo: " +l.getPrestados());
        l.devolucion();
        System.out.println("Numero de ejemplares tras la devolucion: " +l.getEjemplares());
        System.out.println("Numero de prestados tras la devolucion: " +l.getPrestados());
    }
    
}
