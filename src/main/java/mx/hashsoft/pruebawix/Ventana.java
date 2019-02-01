/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.hashsoft.pruebawix;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author david
 */
public class Ventana extends JFrame implements ActionListener{
    public Ventana(){
        JButton boton = new  JButton("Salir");        
        
        this.getContentPane().add(boton, BorderLayout.CENTER);
        
        this.getContentPane().add( Box.createHorizontalStrut(70), BorderLayout.WEST );
        this.getContentPane().add( Box.createHorizontalStrut(70), BorderLayout.EAST );
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Programa de prueba");
        
        boton.addActionListener(this);
        
        this.pack();        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
}
