package proyectoclase2;

import javax.swing.*;
import java.awt.*;

public class ByGonza extends JFrame {

    public ByGonza() {
        super("Hola a todos soy Gonza ❤️ !!!"); 

        ImageIcon imagenIcono = new ImageIcon("ProyectoClase2/src/proyectoclase2/img/Img.png");
        
        JLabel imagenLabel = new JLabel() {
            @Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(imagenIcono.getImage(), 0, 0, getWidth(), getHeight(), this);
            }
        };
        
        JPanel panel = new JPanel(new BorderLayout());
         panel.add(imagenLabel, BorderLayout.CENTER);
        add(panel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);
    }
  /*  Se comenta este metodo ya que la llamada se hace desde el main de la clase ProtectoClase2
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ByGonza();
            }
        });
    }
  */
}
