package com.example;

import javax.swing.JPanel;
import java.awt.*; // Import the Graphics class
import java.awt.geom.*;

public class PrimerCapa extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // llamar al método paintComponent de la clase padre
        g.drawString("Hola Mundo", 200, 100); // Dibujar un texto y posicionarlo en la ventana con coordenadas (200,
                                              // 100)
        Graphics2D g2 = (Graphics2D) g; // Crear un objeto Graphics2D
        Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150); // Crear un rectángulo
        g2.draw(rectangulo); // Dibujar el rectángulo
        Ellipse2D elipse = new Ellipse2D.Double(); // Crear una elipse
        elipse.setFrame(rectangulo); // Establecer el tamaño de la elipse al tamaño del rectángulo
        g2.draw(elipse); // Dibujar la elipse
    }
}
