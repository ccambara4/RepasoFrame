/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.repasoprograiv;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 *
 * Clase que implementa la interface Runnable para
 *  uso de hilos concurrentes
 * Implementando método abstracto de la interface Runnable
 * Uso de Random para generar aleatoriamente el tiempo de espera de cada ejecución
 * Formateo de la fecha
 * Creación de constructor
 * uso de Try Catch
 * uso de Switch para opciones del funcionamiento de la ejecución del hilo
 */
public class ExecutorFramekor implements Runnable{

    private static final Random generador = new Random();
    private final int tiempo;
    private final String nombreHilo;
    private final int opcion;

    public ExecutorFramekor(String nombreHilo, int opcion) {
        this.nombreHilo = nombreHilo;
        this.opcion = opcion;
        this.tiempo = generador.nextInt(8000);
    }
    
    
    @Override
    public void run() {
        int residuo = 0;
        
        try {
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
            
            switch (opcion) {
                case 1:
                    //Los numeros pares del 0 - 100
                    System.out.println("\nEl proceso se llama " + nombreHilo + " tardara " + tiempo + " inicio a las " + formatoFecha.format(LocalDateTime.now()));
                    Thread.sleep(tiempo);
                    for (int i = 0; i <= 100; i++) {
                        residuo = i % 2;
                        if (residuo == 0) {
                            System.out.print(" " + i);                            
                        }
                    }
                    System.out.println("\n"+ nombreHilo  + " Termino" + formatoFecha.format(LocalDateTime.now()));
                    break;
                case 2:
                    //Muestra la letras a - z
                    System.out.println("\nEl proceso se llama " + nombreHilo + " tardara " + tiempo + " inicio a las " + formatoFecha.format(LocalDateTime.now()));
                    Thread.sleep(tiempo);
                    for (char i = 'a'; i <= 'z'; i++) {
                        System.out.print(" " + i);
                    }
                    System.out.println("\n" + nombreHilo + " Termino" + formatoFecha.format(LocalDateTime.now()));
                    break;    
                default:
                    System.out.println("Opcion no valida");
            }
            
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("Error " + e.toString());
        }
    }
    
}
