package swing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SwingDemo {

  public static void main(String[] args) {

    JFrame frame = new JFrame("Hello World Java Swing");

    frame.setMinimumSize(new Dimension(800, 600));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
    JLabel lblText2 = new JLabel("XXXXXXXX!", SwingConstants.CENTER);

    frame.getContentPane().add(lblText);
    frame.getContentPane().add(lblText2, BorderLayout.NORTH);

    frame.pack();
    frame.setVisible(true);

  }
}
