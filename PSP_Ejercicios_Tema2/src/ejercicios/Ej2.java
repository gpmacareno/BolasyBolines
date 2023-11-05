package ejercicios;

public class Ej2 implements Runnable {
	String nombre;

	public Ej2(String n) {
		this.nombre = n;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Este es el Hilo: " + nombre); // No existe el método getName()
		}
	}

	public static void main(String[] args) {
		Ej2 h = new Ej2("Hilo de Prueba");
		Thread miHilo = new Thread(h);
		miHilo.start();
	}
}