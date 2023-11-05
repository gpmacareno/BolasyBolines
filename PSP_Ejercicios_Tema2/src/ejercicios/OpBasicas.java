// Clase que extiende Thread y realiza operaciones matemáticas
package ejercicios;

public class OpBasicas extends Thread {
    int x, y;

    OpBasicas(String nombre, int num1, int num2) {
        super(nombre); // Asignar un nombre al hilo
        x = num1;
        y = num2;
    }

    public void run() {
        // Realizar y mostrar operaciones matemáticas básicas
        System.out.println(x + " + " + y + " = " + (x + y) + " de hilo " + getName());
        System.out.println(x + " - " + y + " = " + (x - y) + " de hilo " + getName());
        System.out.println(x + " * " + y + " = " + (x * y) + " de hilo " + getName());
        
        // Manejar la división por cero
        try {
            System.out.println(x + " / " + y + " = " + (x / y) + " de hilo " + getName());
        } catch (ArithmeticException e) {
            System.out.println("División por cero en hilo " + getName());
        }
    }
}
