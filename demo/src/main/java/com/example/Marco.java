package com.example;

import javax.swing.JFrame;

public class Marco extends JFrame {
    public Marco() {
        // setSize(500, 300);
        // setLocation(500, 300);
        setBounds(500, 300, 600, 200);// Cambiar el tamaño y la posición de la ventana
        setResizable(true); // No permitir redimensionar la ventana
        // setExtendedState(JFrame.NORMAL);
        setTitle("Hola Mundo!");
    }
}
