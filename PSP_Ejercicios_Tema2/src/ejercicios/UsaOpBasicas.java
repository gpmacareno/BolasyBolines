// Clase principal que lanza los hilos para realizar operaciones matemáticas básicas
package ejercicios;

public class UsaOpBasicas {
    public static void main(String[] args) throws InterruptedException {
        // Crear tres instancias de la clase OpBasicas con diferentes nombres y números
        OpBasicas hilo1 = new OpBasicas("Uno", 0, 8);
        OpBasicas hilo2 = new OpBasicas("Dos", 3, 6);
        OpBasicas hilo3 = new OpBasicas("Tres", 82, 17);
        
        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        
        // Esperar a que todos los hilos terminen antes de continuar
        hilo1.join();
        hilo2.join();
        hilo3.join();
        
        System.out.println("Hilos terminados.");
    }
}
