/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operador;
//importamos JOptionPane
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class Operador {

    // aqui declaramos el metodo main
    public static void main(String[] args) {

        //declaramos y asignamos del Array de Opciones
       String[] opciones = { "Suma", "Resta", "Multiplicación", "División" };
 //Mostramos  la Ventana de Diálogo usando JOptionPane.showOptionDialog():

    int seleccion = JOptionPane.showOptionDialog(
    null,                            
    "Seleccione una operación:",     
    "Calculadora",                   
    JOptionPane.DEFAULT_OPTION,      
    JOptionPane.QUESTION_MESSAGE,    
    null,                            
    opciones,                        
    opciones[0]                     
);
    //solicitamos numeros al usuario 
    int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
//realizacion de operacion 
int resultado = 0;

switch (seleccion) {
    case 0:
        resultado = num1 + num2;
        break;
    case 1:
        resultado = num1 - num2;
        break;
    case 2:
        resultado = num1 * num2;
        break;
    case 3:
        if (num2 != 0) {
            resultado = num1 / num2;
        } else {
            JOptionPane.showMessageDialog(null, "No es posible dividir por cero.");
            return; 
        }
        break;
    
    }
    }
