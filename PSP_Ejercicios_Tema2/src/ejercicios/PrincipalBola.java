package ejercicios;

import javax.swing.JFrame;

public class PrincipalBola extends JFrame {
    private static final long serialVersionUID = 1L;

    // Constructor de la ventana principal.
    public PrincipalBola() {
        super();
    }

    public static void main(String args[]) {
        PrincipalBola f = new PrincipalBola();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Bolas");
        f.setContentPane(new PanelBola()); // Configura el contenido principal como un PanelBola.
        f.setSize(500, 600);
        f.setVisible(true);
    }
}
