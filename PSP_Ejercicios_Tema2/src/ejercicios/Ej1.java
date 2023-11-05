package ejercicios;

public class Ej1 extends Thread {
	public Ej1(String nombre) {
		super(nombre);
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Este es el Hilo: " + getName());
		}
	}

	public static void main(String args[]) {
		Ej1 h = new Ej1("Hilo de Prueba");
		h.start();
	}
}
