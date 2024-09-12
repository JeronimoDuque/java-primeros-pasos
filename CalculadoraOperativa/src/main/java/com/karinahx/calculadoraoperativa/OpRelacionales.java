/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.karinahx.calculadoraoperativa;

/**
 *
 * @author karyj
 */
public class OpRelacionales {
    public boolean esMayor(int a, int b) {
        boolean resultado = a > b;
        System.out.println(a + " > " + b + " = " + resultado);
        return resultado;
    }

    public boolean esMenor(int a, int b) {
        boolean resultado = a < b;
        System.out.println(a + " < " + b + " = " + resultado);
        return resultado;
    }

    public boolean esIgual(int a, int b) {
        boolean resultado = a == b;
        System.out.println(a + " == " + b + " = " + resultado);
        return resultado;
    }

    public boolean esDiferente(int a, int b) {
        boolean resultado = a != b;
        System.out.println(a + " != " + b + " = " + resultado);
        return resultado;
    }
    // Método para verificar si el primer número es mayor o igual que el segundo
    public boolean esMayorOIgual(int a, int b) {
        boolean resultado = a >= b;
        System.out.println(a + " >= " + b + " = " + resultado);
        return resultado;
    }

    // Método para verificar si el primer número es menor o igual que el segundo
    public boolean esMenorOIgual(int a, int b) {
        boolean resultado = a <= b;
        System.out.println(a + " <= " + b + " = " + resultado + "\n");
        return resultado;
    }

    
}
