/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ivann
 */
public class Ejercicio2PC {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        int totalPuntos = 0;
        
        System.out.println("Ingrese la cantidad de puntos que su equipo ha obtenido en cada juego de esta temporada o ingrese -1 cuando haya terminado: ");
        totalPuntos = scanner.nextInt();
        
        while (true) {
        try {
            System.out.println("Introduce puntos del juego o -1 para finalizar: ");
            
            
            int puntos = scanner.nextInt();

                if (puntos == -1) {
                    break;
                }
                    totalPuntos += puntos;
                
                } catch (InputMismatchException e) {
            System.out.println ("Programa finalizado. Debe ingresar un número válido");

            System.exit(0);
        } finally {
            scanner.nextLine();
        }
        }
           System.out.println("Los puntos totales son " + totalPuntos);
           
           scanner.close();
        }
    }

