package ejercicios;

import java.awt.Graphics;
import java.awt.Panel;

public class RectanguloMovimiento extends Panel implements Runnable {
    private static final long serialVersionUID = 1L;
    int x, y;
    boolean seguir = true;

    public RectanguloMovimiento() {
    }

    @Override
    public void run() {
        x = 50; // Posición inicial del rectángulo en el eje X
        y = 50; // Posición inicial del rectángulo en el eje Y
        setVisible(true); // Hacemos el panel visible

        for (int i = 0; i < 50; i++) { // Animación que se repite 50 veces
            if (seguir) {
                try {
                    Thread.sleep(1000); // Pausa de 1 segundo
                } catch (InterruptedException e) {
                }
                repaint(); // Redibujamos el panel
            }
        }
    }

    public void paint(Graphics g) {
        g.drawRect(x, y, 25, 25); // Dibujamos un rectángulo en la posición actual
        x++; // Movemos ligeramente el rectángulo hacia la derecha
        y++; // Movemos ligeramente el rectángulo hacia abajo
    }

    public void setSeguir(boolean seguir) {
        this.seguir = seguir; // Método para detener la animación
    }
}
