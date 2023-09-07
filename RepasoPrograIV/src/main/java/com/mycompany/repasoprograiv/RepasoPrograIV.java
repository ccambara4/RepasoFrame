/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.repasoprograiv;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * Instanciar objetos
 * Formatear la fecha y hora
 * Acceder a los métodos Get y Set de la clase Usuario
 * Uso de constructores
 * Asignnar valores a los atributos usando metodos set
 * Mostrar en pantalla los valores de los atributos usando los metodos Get
 * uso de Try Catch
 *  Instanciar objeto usando Clase ExecutorFramekor para uso de hilos
 *      ExecutorService para ejecutar los hilos de forma concurrente
 *      Esperar que terminen todos los hilos para terminar la ejecución del método principal 
 */
public class RepasoPrograIV {

    public static void main(String[] args) {
        
        try {
            Usuario usuario = new Usuario("Carlos", "Archila", "CARCHILA", "123");
            Usuario usuario2 = new Usuario("ARCHILA", "321");
            
            System.out.println("El nombre del primer usuario es : " + usuario.getNombres() + " " + usuario.getApellidos());
            System.out.println("Ingresará al sistema con :" +usuario.getUser() + " con la clave temporal " + usuario.getPwd() + " estado del usuario " + usuario.getEstado());
            
            System.out.println("*****");
            
            usuario2.setNombres("JUAN");
            usuario2.setApellidos("PEREZ");
            usuario2.setEstado("I");
            
            System.out.println("El segundo usuario se llama " + usuario2.getNombres() + " " + usuario2.getApellidos());
            System.out.println("Estdo del segundo usuario " + usuario2.getEstado() + " usuario para ingresar " + usuario2.getUser() + " " + usuario2.getPwd());
            
            
            System.out.println("*** Ejemplo hilos ***\n");
            
            DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd/MM/YYYY HH:mm:ss");
            
            ExecutorFramekor hilo = new ExecutorFramekor("HiloUno", 1);
            ExecutorFramekor hilo2 = new ExecutorFramekor("HiloDos", 1);
            ExecutorFramekor hilo3 = new ExecutorFramekor("HiloTres", 2);
            
            System.out.println("Inicia en clase principal Main" + formatoFecha.format(LocalDateTime.now()));
                        
            ExecutorService executorService = Executors.newCachedThreadPool();
            
            executorService.execute(hilo);
            executorService.execute(hilo2);
            executorService.execute(hilo3);
            
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.HOURS);
            
            System.out.println("Termino" + formatoFecha.format(LocalDateTime.now()));
            
            
        } catch (InterruptedException ex) {
            Logger.getLogger(RepasoPrograIV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
