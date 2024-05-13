package com.example;

import javax.swing.*;
import java.awt.*;

public class Graficos extends JFrame {
    public Graficos() {
        Toolkit miPantalla = Toolkit.getDefaultToolkit(); // Obtener el kit de herramientas predeterminado
        Dimension tamanioPantalla = miPantalla.getScreenSize(); // Obtener el tamaño de la pantalla
        int alturaPantalla = tamanioPantalla.height; // Obtener la altura de la pantalla
        int anchoPantalla = tamanioPantalla.width; // Obtener el ancho de la pantalla
        setSize(anchoPantalla / 2, alturaPantalla / 2); // Establecer el tamaño de la ventana por la mitad de la
        // pantalla real
        setLocation(anchoPantalla / 4, alturaPantalla / 4); // Establecer la posición de la ventana en el centro de la
        // pantalla
        setTitle("Bienvenidos a la ventana de gráficos centrados!");
        Image miIcono = miPantalla.getImage("src/main/java/com/example/icono.png"); // Obtener la imagen del icono
        setIconImage(miIcono); // Establecer la imagen del icono
    }
}
