/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operador;

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
    null,                            // Componente padre (en este caso, ninguno)
    "Seleccione una operación:",     // Mensaje a mostrar en la ventana
    "Calculadora",                   // Título de la ventana
    JOptionPane.DEFAULT_OPTION,      // Tipo de opción predeterminada
    JOptionPane.QUESTION_MESSAGE,    // Tipo de mensaje (pregunta)
    null,                            // Icono personalizado (en este caso, ninguno)
    opciones,                        // Opciones disponibles
    opciones[0]                      // Opción predeterminada seleccionada
);

    }
