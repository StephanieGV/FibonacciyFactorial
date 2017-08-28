/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
    
 */
package javaapplication1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
/**
 *
 * @author Stephanie Gonzalez
   @version 1.0
 */

public class FactorialyFibonacci implements ActionListener{
    /*Se definen los atributos */
    public JFrame ventana;
    public JTextField Numero, Resultado;
    public JButton Fibonacci, Factorial;
    public JLabel Instruccion;
    private Container cont;
    public double resultadoN;
    
    public FactorialyFibonacci(){
        ventana = new JFrame();
        ventana.setSize(500, 500);
        ventana.setTitle("Factorial y Fibonacci");
        ventana.setResizable(false);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
        ventana.setLayout(null);
        cont = ventana.getContentPane();
        Compi();
        ventana.setVisible(true);
    }
    
    /*Se declaran los recuadros a usar*/
    public void Compi(){
        Instruccion = new JLabel();
        Instruccion.setText("Escriba un numero aqui:");
        Instruccion.setBounds(0, 100, 200, 50);
        cont.add(Instruccion);
        
        Numero = new JTextField();
        Numero.setBounds(200, 100, 200, 50);
        Numero.setVisible(true);
        cont.add(Numero);
        
        Resultado = new JTextField();
        Resultado.setBounds(100, 300, 200, 50);
        Numero.setVisible(true);
        cont.add(Resultado);
        
        Fibonacci = new JButton("Fibonacci");
        Fibonacci.setBounds(150, 200, 100, 70);
        Numero.setVisible(true);
        Fibonacci.addActionListener(this);
        cont.add(Fibonacci);
                
        Factorial = new JButton("Factorial");
        Factorial.setBounds(250, 200, 100, 70);
        Numero.setVisible(true);
        Factorial.addActionListener(this);
        cont.add(Factorial);
    }
    
    /*Declaran acciones a realizar*/
    @Override
    public void actionPerformed(ActionEvent e){
        
        if(e.getSource() == Factorial){
            
            int numero = Integer.parseInt(Numero.getText());
            String serie = "" + numero;
            for (int i = (numero - 1) ; i > 0; i--) {
                numero *= i;
                serie += " * "+i;
            }
            
            Resultado.setText(serie + " = " + numero);
            
        }else if(e.getSource() == Fibonacci){
            String serie = " " + 0;
            int numero = Integer.parseInt(Numero.getText());
            int nums = 0;
            int nums2=1;
        
            String fibo="0 1 ";
            for(int i=0; i<=numero-2; i++){
                int nums3;
                fibo+=(nums2+nums)+" ";
                nums3=nums;
                nums=nums2;
                nums2=nums3+nums2;
                
                
                
            }
           
            Resultado.setText(String.valueOf(fibo));
        }
    }
    
}
