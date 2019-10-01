/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerexepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author edgar
 */
public class Ejerexepciones {

    public static void main(String[] args) {
        double r,a,b;
        
        try {
        String jugar= JOptionPane.showInputDialog("ingrese el entero");
        a=  Double.parseDouble(jugar);     
        String jugar1= JOptionPane.showInputDialog("ingrese el divisor");
        b=  Double.parseDouble(jugar1);      
        
        if(a<10){
            throw new NumberFormatException();
        }
        if(b==0){
            throw new ArithmeticException();
        }
        r=a/b;
        System.out.println("entero  =" +a + "\ndivisor  =" +b + "\nresultado =" +r);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException ex) {
        System.out.println("excepcion");
        }
      
}
}
