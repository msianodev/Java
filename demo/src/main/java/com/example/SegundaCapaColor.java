package com.example;

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*; // Import the Rectangle2D class

public class SegundaCapaColor extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Remove the data type declaration from the method call
        g.drawString("Probando texto formato default", 100, 50);

        Graphics2D g2 = (Graphics2D) g; // creo un objeto Graphics2D
        Font fuente = new Font("Arial", Font.BOLD, 20); // creo una fuente
        g2.setFont(fuente); // Establecer la fuente en el objeto Graphics2D

        g.setColor(Color.BLUE); // Establecer el color de la tinta azul
        g.drawString("Texto en formato Arial Bold tamaño 20", 100, 150);

        Rectangle2D rectangulo = new Rectangle2D.Double(100, 300, 200, 150); // creo un rectángulo
        g2.setPaint(Color.BLACK); // Establecer el color de la línea negro
        g2.draw(rectangulo); // dibujo el rectángulo contorno negro
        g2.setPaint(Color.RED); // Establecer el color de relleno rojo
        Font fuente2 = new Font("Tahoma", Font.ITALIC, 30); // creo una fuente
        g2.setFont(fuente2);
        g2.drawString("Texto en formato Tahoma Italic tamaño 30", 100, 200);
        g2.fill(rectangulo); // Rellenar el rectángulo de rojo

        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rectangulo);
        g2.setPaint(Color.BLACK);
        g2.draw(elipse);
        g2.setPaint(Color.BLUE);
        g2.fill(elipse);
    }
}
