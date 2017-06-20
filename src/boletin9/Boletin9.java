/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Boletin9 {

     public static void metodo(){
     int numero1= Integer.parseInt(JOptionPane.showInputDialog("Primer numero?"));
     int numero2=0;
     int numeroneg=0;
     int numeropos=0;
     int numcer=0;
     while (numero2!=10){
         numero2++;
         if(numero1%2==0){
         numeropos++;}
         else{
         numeroneg++;}
         if(numero1%10==0){
         numcer++;}
         numero1++;
         
     }
     JOptionPane.showMessageDialog(null, " numero de comezo "+numero1+ "con "+numeropos+ " pares "+ numeroneg+ " impares e "+numcer + " de ceros" );}
    public static void main(String[] args) {
        metodo();
    }
    
}
