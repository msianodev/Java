package com.example;

import javax.swing.*;
import java.awt.*;
import javax.imageio.*;
import java.io.*;

public class TerceraCapaImagenes extends JPanel {
    private Image imagen; // Declarar una variable de tipo Image

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // Llamar al método paintComponent de la clase padre
        // File archivoImagen = new
        // File("C:\\Users\\matias.siano_nybbleg\\Workspace\\Java\\demo\\src\\main\\java\\com\\example\\image.jpeg");
        // Crear un archivo con la imagen desde la ruta absoluta
        // la ruta relativa

        try { // Intentar cargar la imagen
            imagen = ImageIO.read(new File("demo/src/main/java/com/example/image.jpeg")); // Leer la imagen

        } catch (IOException e) { // Capturar la excepción de lectura de la imagen
            System.out.println("No se pudo cargar la imagen"); // Mostrar un mensaje de error

        }
        g.drawImage(imagen, 50, 50, null); // Dibujar la imagen en la capa

    }

}
