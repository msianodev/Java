package com.example.eventos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Adapter extends WindowAdapter { // Implemento la interfaz WindowListener, NO estoy obligado a implementar
                                             // los 7
                                             // métodos, ya se encuentran implementados en la clase WindowAdapter

    public void windowIconified(WindowEvent e) { // Minimizar ventana, sucede el evento al minimizar la ventana, también
                                                 // al
                                                 // minimizar va a lanzar ventana desactivada
        System.out.println("Ventana minimizada");
    }

}
