package ejercicios;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JPanel;

public class PanelBola extends JPanel implements Runnable, KeyListener {
    private static final long serialVersionUID = 1L;
    private int numBolas = 5;
    Thread[] hilosBola;
    Bola[] bola;
    Bolin bolin;
    int direccionBolin = -1;

    public PanelBola() {
        hilosBola = new Thread[numBolas];
        bola = new Bola[numBolas];
        for (int i = 0; i < hilosBola.length; i++) {
            hilosBola[i] = new Thread(this);
            Random aleatorio = new Random();
            int velocidad = aleatorio.nextInt(50);
            int posX = aleatorio.nextInt(250) + 50;
            int posY = aleatorio.nextInt(300) + 50;
            Color color = new Color(aleatorio.nextInt(254), aleatorio.nextInt(254), aleatorio.nextInt(254));
            bola[i] = new Bola(posX, posY, velocidad, color);
        }
        for (int i = 0; i < hilosBola.length; ++i) {
            hilosBola[i].start();
        }
        bolin = new Bolin(200, 530, Color.BLACK);
        setBackground(Color.white);
        setFocusable(true);
        addKeyListener(this);
        requestFocus();
    }

    // Método del bucle para mover las bolas y el Bolin.
    public void run() {
        while (true) {
            try {
                Thread.sleep(50); // Pausa para controlar la velocidad
            } catch (InterruptedException e) {
            }
            if (direccionBolin != -1) {
                bolin.mover(direccionBolin);
            }
            for (int i = 0; i < hilosBola.length; ++i) {
                try {
                    Thread.sleep(bola[i].getVelocidad());
                    bola[i].mover();
                } catch (InterruptedException e) {
                }
            }
            repaint();
        }
    }

    // Método para dibujar bolas y el Bolin en el panel.
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < bola.length; ++i) {
            bola[i].pinta(g);
        }
        bolin.pinta(g);
    }

    // Métodos para manejar eventos del teclado.
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_LEFT) {
            direccionBolin = 2; // Izquierda
        } else if (key == KeyEvent.VK_RIGHT) {
            direccionBolin = 0; // Derecha
        } else if (key == KeyEvent.VK_UP) {
            direccionBolin = 3; // Arriba
        } else if (key == KeyEvent.VK_DOWN) {
            direccionBolin = 1; // Abajo
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        direccionBolin = -1; // Detiene el movimiento cuando se suelta una tecla.
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }
}

