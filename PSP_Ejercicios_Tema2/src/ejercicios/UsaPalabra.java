// Clase principal que utiliza la clase Palabra para verificar palíndromos
package ejercicios;

public class UsaPalabra {
    public static void main(String[] args) throws InterruptedException {
        // Crear instancias de la clase Palabra con palabras diferentes
        Palabra pal1 = new Palabra("casa");
        Palabra pal2 = new Palabra("ala");
        Palabra pal3 = new Palabra("Oso");
        
        // Iniciar los hilos para verificar palíndromos
        pal1.start();
        pal2.start();
        pal3.start();
        
        // Esperar a que todos los hilos terminen
        pal1.join();
        pal2.join();
        pal3.join();
        
        System.out.println("Hilos terminados.");
    }
}
