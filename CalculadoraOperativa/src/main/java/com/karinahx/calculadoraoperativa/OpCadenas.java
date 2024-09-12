/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.karinahx.calculadoraoperativa;

/**
 *
 * @author karyj
 */
public class OpCadenas {
    
    public String concatenar(String cadena1, String cadena2) {
        return cadena1 + cadena2;
    }

    public boolean compararCadenas(String cadena1, String cadena2) {
        return cadena1.equals(cadena2);
    }

    public int longitud(String cadena) {
        return cadena.length();
    }

    public String subcadena(String cadena, int startIndex) {
        if (startIndex >= 0 && startIndex < cadena.length()) {
            return cadena.substring(startIndex);
        } else {
            return "Índice fuera de rango.";
        }
    }

}

