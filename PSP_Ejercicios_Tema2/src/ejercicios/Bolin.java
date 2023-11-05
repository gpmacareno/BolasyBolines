package ejercicios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Bolin {
    private int x, y;
    private Color color;

    // Constructor para crear un objeto Bolin con una posición inicial (x, y) y un color (c).
    public Bolin(int xx, int yy, Color c) {
        this.x = xx;
        this.y = yy;
        this.color = c;
    }

    // Método para mover el Bolin en una dirección dada (0: derecha, 1: abajo, 2: izquierda, 3: arriba).
    public void mover(int direccion) {
        switch (direccion) {
            case 0:
                if (x < 450)
                    x++;
                break;
            case 1:
                if (y < 550)
                    y++;
                break;
            case 2:
                if (x > 0)
                    x--;
                break;
            case 3:
                if (y > 0)
                    y--;
                break;
        }
    }

    // Método para dibujar el Bolin en el panel.
    public void pinta(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color);
        g2d.fillOval(x, y, 25, 25); // Dibuja un óvalo en la posición (x, y)
    }
}
