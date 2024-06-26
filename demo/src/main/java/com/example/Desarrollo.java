package com.example;

import javax.swing.*;
import com.example.eventos.*;

public class Desarrollo extends JFrame {
    public Desarrollo() {
        setVisible(true); // Hacer visible la ventana
        setSize(600, 400); // Establecer el tamaño de la ventana
        setLocation(400, 200); // Establecer la posición de la ventana
        // setTitle("Ventana de desarrollo"); // Establecer el título de la ventana
        // PrimerCapa capa1 = new PrimerCapa(); // Crear una capa
        // add(capa1); // Agregar la capa a la ventana
        // SegundaCapaColor capa2 = new SegundaCapaColor(); // Crear una capa
        // add(capa2); // Agregar la capa a la ventana
        // TerceraCapaImagenes capa3 = new TerceraCapaImagenes(); // Crear una capa
        // add(capa3); // Agregar la capa a la ventana

        // setTitle("Botones y eventos");
        // Eventos1 eventoLamina = new Eventos1();
        // add(eventoLamina);

        // setTitle("Eventos de Ventana");
        // Eventos2 eventoVentana = new Eventos2();
        // addWindowListener(eventoVentana); // Agrego el evento a la ventana

        // setTitle("Eventos de ventana con adaptador");
        // Adapter adaptadorVentana = new Adapter();
        // addWindowListener(adaptadorVentana); // Agrego el adaptador a la ventana

        // setTitle("Eventos de Teclado");
        // Eventos3 eventoTeclado = new Eventos3();
        // addKeyListener(eventoTeclado); // Agrego el evento al teclado

        setTitle("Eventos de Ratón");
        Eventos4 eventoRaton = new Eventos4();
        addMouseListener(eventoRaton); // Agrego el evento al ratón

    }

}