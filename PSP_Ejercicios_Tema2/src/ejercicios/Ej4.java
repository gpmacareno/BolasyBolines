package ejercicios;

public class Ej4 extends Thread {
    public Ej4(String s) {
        super(s); // Asigna un nombre al hilo
    }

    public final void run() {
        boolean sigue = true; // Variable para controlar si el hilo debe continuar
        for (int i = 0; i < 100 && sigue; i++) {
            try {
                System.out.println(getName() + ": " + i); // Imprime el nombre del hilo y el valor de 'i'
                sleep(500); // Hace una pausa de 500 milisegundos (0.5 segundos)
                if (i == 10) {
                    interrupt(); // Interrumpe el hilo cuando 'i' alcanza el valor 10
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + " interrumpido..."); // Maneja la excepción de interrupción
                sigue = false; // Establece 'sigue' en falso para salir del bucle
            }
        }
    }

    public static final void main(String[] args) {
        Ej4 p = new Ej4("Hilo"); // Crea una instancia de la clase Ej4 con nombre "Hilo"
        p.start(); // Inicia la ejecución del hilo
    }
}
