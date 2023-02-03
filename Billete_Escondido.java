/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6.Billete_Escondido;

import java.util.Random;

/**
 *
 * @author alvarogasca
 */
public class Billete_Escondido {
    public static void main(String[] args) {
        int filas=8;
        int columnas=4;
        String[][] tabla;
        tabla = new String[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
         for (int j = 0; j < columnas; j++) {
            tabla[i][j] = " ";
         }
      }
            
        Random rd = new Random();
        int filaRandom = rd.nextInt(filas);
        int columnaRandom = rd.nextInt(columnas);
        tabla[filaRandom][columnaRandom] = "€";
        
        System.out.println("Coordenadas del billete (€):");
        for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("(" + i + "," + j + ") " + tabla[i][j] + "  ");
         }
        System.out.println();
        }
    }
}
