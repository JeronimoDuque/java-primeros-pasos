/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.karinahx.calculadoraoperativa;

/**
 *
 * @author karyj
 */
public class OpAritmeticos {
    
    public int sumar(int a, int b) {
        int resultado = a + b;
        System.out.println("\nLa suma es: ");
        System.out.println(a + " + " + b + " = " + resultado);
        return resultado;
    }
    
    public double sumar(double a, double b) {
        double resultado = a + b;
        System.out.println("\nLa suma es: ");
        System.out.println(a + " + " + b + " = " + resultado);
        return resultado;
    }

    // Resta - Sobrecarga
    public int restar(int a, int b) {
        int resultado = a - b;
        System.out.println("La resta es: ");
        System.out.println(a + " - " + b + " = " + resultado);
        return resultado;
    }
    
    public double restar(double a, double b) {
        double resultado = a - b;
        System.out.println("La resta es: ");
        System.out.println(a + " - " + b + " = " + resultado);
        return resultado;
    }

    // Multiplicación - Sobrecarga
    public int multiplicar(int a, int b) {
        int resultado = a * b;
        System.out.println("La multiplicación es: ");
        System.out.println(a + " * " + b + " = " + resultado);
        return resultado;
    }
    
    public double multiplicar(double a, double b) {
        double resultado = a * b;
        System.out.println("La multiplicación es: ");
        System.out.println(a + " * " + b + " = " + resultado);
        return resultado;
    }

    // División con gestión de excepciones - Sobrecarga
    public double dividir(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
        double resultado = (double) a / b;
        System.out.println("La división es: ");
        System.out.println(a + " / " + b + " = " + resultado);
        return resultado;
    }

    public double dividir(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: División por cero.");
            return Double.NaN;
        }
        double resultado = a / b;
        System.out.println("La división es: ");
        System.out.println(a + " / " + b + " = " + resultado);
        return resultado;
    }
    public int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error: División por cero.");
            return Integer.MIN_VALUE; // Valor de error para el módulo
        }
        int resultado = a % b;
        System.out.println("El módilo es: ");
        System.out.println(a + " % " + b + " = " + resultado);
        return resultado;
    }

    public double modulo(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: División por cero.");
            return Double.NaN; // Valor de error para el módulo
        }
        double resultado = a % b;
        System.out.println("El módilo es: ");  
        System.out.println(a + " % " + b + " = " + resultado);
        return resultado;
    }
    
}    
