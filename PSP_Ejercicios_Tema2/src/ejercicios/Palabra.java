// Clase que implementa Runnable para verificar si una palabra es un palíndromo
package ejercicios;

public class Palabra implements Runnable {
	String palabra; // La palabra a verificar
	Thread hilo; // El hilo que se creará para esta palabra

	Palabra(String pal) {
		palabra = pal;
		hilo = new Thread(this); // Crear un nuevo hilo y asignar esta instancia como objeto a ejecutar en el
									// hilo
	}

	public void start() {
		hilo.start(); // Método personalizado para iniciar el hilo
	}

	public void join() {
		try {
			hilo.join(); // Método personalizado para esperar a que el hilo termine
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Método que verifica si la palabra es un palíndromo
	public void run() {
		boolean palindromo = true; // Suponemos que la palabra es un palíndromo
		int i = 0;
		int j = palabra.length() - 1;

		while (palindromo && i < j) {
			if (palabra.charAt(i) == palabra.charAt(j)) {
				++i;
				--j;
			} else {
				palindromo = false; // Si se encuentra una diferencia, no es un palíndromo
			}
		}

		if (palindromo)
			System.out.println("La palabra " + palabra + " sí es un palíndromo.");
		else
			System.out.println("La palabra " + palabra + " no es un palíndromo.");
	}
}
