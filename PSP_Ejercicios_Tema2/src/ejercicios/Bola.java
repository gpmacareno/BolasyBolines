package ejercicios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.util.Random;

public class Bola {
    private int x, y;
    private int velocidad;
    private Color color;
    Random aleatorio = new Random();

    public Bola(int xx, int yy, int v, Color c) {
        this.x = xx;
        this.y = yy;
        this.velocidad = v;
        this.color = c;
    }

    public int getVelocidad() {
        return velocidad; // Devuelve la velocidad de la bola
    }

    public void mover() {
        // Generamos un número aleatorio entre 0 y 3 para determinar la dirección del movimiento
        int direccion = aleatorio.nextInt(4);
        
        // Utilizamos un switch para manejar las cuatro posibles direcciones (0: derecha, 1: abajo, 2: izquierda, 3: arriba)
        switch (direccion) {
            case 0:
                // Si la dirección es 0 (derecha) y la posición x es menor que 450 (límite derecho), incrementamos la posición x
                if (x < 450)
                    x++;
                break;
            case 1:
                // Si la dirección es 1 (abajo) y la posición y es menor que 536 (límite inferior), incrementamos la posición y
                if (y < 536)
                    y++;
                break;
            case 2:
                // Si la dirección es 2 (izquierda) y la posición x es mayor que 0 (límite izquierdo), decrementamos la posición x
                if (x > 0)
                    x--;
                break;
            case 3:
                // Si la dirección es 3 (arriba) y la posición y es mayor que 0 (límite superior), decrementamos la posición y
                if (y > 0)
                    y--;
                break;
        }
    }


    public void pinta(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(color); // Establece el color de la bola
        g2d.fillOval(x, y, 50, 50); // Dibuja la bola
    }
}
