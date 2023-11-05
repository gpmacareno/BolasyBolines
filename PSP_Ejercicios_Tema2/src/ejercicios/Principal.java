package ejercicios;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Principal extends Frame implements WindowListener {
    private static final long serialVersionUID = 1L;
    static RectanguloMovimiento rectanguloMovimiento = new RectanguloMovimiento(); // Creamos una instancia de RectanguloMovimiento
    static Thread hilo = new Thread(rectanguloMovimiento); // Creamos un hilo y le pasamos la instancia de RectanguloMovimiento

    public Principal() {
        addWindowListener(this); // Agregamos un escuchador de eventos de ventana
        setSize(300, 220); // Tamaño de la ventana
        setResizable(false); // La ventana no es redimensionable
        setVisible(true); // Hacemos la ventana visible
    }

    public static void main(String[] args) {
        Principal principal = new Principal(); // Creamos una instancia de Principal, que representa la ventana
        principal.add(rectanguloMovimiento); // Agregamos el panel con el rectángulo a la ventana
        hilo.start(); // Iniciamos el hilo para la animación
    }

    // Métodos de la interfaz WindowListener 
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        rectanguloMovimiento.setSeguir(false); // Detenemos el hilo al cerrar la ventana
        System.exit(0); // Salimos de la aplicación
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
}
