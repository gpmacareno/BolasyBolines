package ejercicios;

import java.util.Random;

public class Ej3 extends Thread {
    public Ej3(String nombre) {
        super(nombre); // Asigna un nombre al hilo
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Este es el Hilo: " + getName()); // Imprime el nombre del hilo
        }
    }

    public static void main(String args[]) {
        String nombres[] = { "Venus", "Marte", "Júpiter", "Mercurio", "Saturno", "Tierra", "Urano", "Plutón", "Neptuno" };
        Random aleatorio = new Random(); // Objeto para generar números aleatorios

        for (int i = 0; i < 3; i++) {
            // Crea y arranca 3 hilos con nombres aleatorios de la matriz 'nombres'
            new Ej3(nombres[aleatorio.nextInt(9)]).start();
        }
    }
}
