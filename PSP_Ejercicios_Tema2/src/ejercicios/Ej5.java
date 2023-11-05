package ejercicios;

public class Ej5 implements Runnable {
    public final void run() {
        Thread hebra = Thread.currentThread(); // Obtiene una referencia al hilo actual
        boolean sigue = true; // Variable para controlar si el hilo debe continuar
        for (int i = 0; i < 100 && sigue; i++) {
            try {
                System.out.println(hebra.getName() + " :" + i); // Imprime el nombre del hilo actual y el valor de 'i'
                Thread.sleep(500); // Hace una pausa de 500 milisegundos (0.5 segundos)
            } catch (InterruptedException e) {
                System.out.println(hebra.getName() + " interrumpido..."); // Maneja la excepción de interrupción
                sigue = false; // Establece 'sigue' en falso para salir del bucle
            }
        }
    }

    public static final void main(String[] args) {
        Thread p = new Thread(new Ej5(), "Hilo "); // Crea un objeto Thread con una instancia de Ej5 y le asigna el nombre "Hilo "
        p.start(); // Inicia la ejecución del hilo
    }
}
