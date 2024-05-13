package com.example;

import javax.swing.JPanel;
import java.awt.Graphics; // Import the Graphics class

public class PrimerCapa extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // llamar al método paintComponent de la clase padre
        g.drawString("Hola Mundo", 200, 100); // Dibujar un texto y posicionarlo en la ventana con coordenadas (200,
                                              // 100)
    }
}
