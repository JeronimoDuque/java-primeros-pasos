/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.karinahx.calculadoraoperativa;

/**
 *
 * @author karyj
 */
public class OpDeBits {
    
    public int and(int a, int b) {
        int resultado = a & b;
        System.out.println("Operador lógico AND: ");
        System.out.println(a + " & " + b + " = " + resultado);
        return resultado;
    }

    public int or(int a, int b) {
        int resultado = a | b;
        System.out.println("Operador lógico OR: ");
        System.out.println(a + " | " + b + " = " + resultado);
        return resultado;
    }

    public int xor(int a, int b) {
        int resultado = a ^ b;
        System.out.println("Operador lógico XOR esclusivo: ");
        System.out.println(a + " ^ " + b + " = " + resultado);
        return resultado;
    }

    public int complemento(int a) {
        int resultado = ~a;
        System.out.println("Operador lógico Complemento: ");
        System.out.println("~" + a + " = " + resultado);
        return resultado;
    }

    public void desplazarIzquierda(int a, int desplazamiento) {
        int resultado = a << desplazamiento;
        System.out.println("Desplazamiento a la izquierda: ");
        System.out.println(a + " << " + desplazamiento + " = " + resultado);
    }

    public void desplazarDerecha(int a, int desplazamiento) {
        int resultado = a >> desplazamiento;
        System.out.println("Desplazamiento a la derecha: ");
        System.out.println(a + " >> " + desplazamiento + " = " + resultado);
    }
    // Método para realizar el desplazamiento a la derecha sin signo
    public void desplazarDerechaSinSigno(int a, int desplazamiento) {
        int resultado = a >>> desplazamiento;
        System.out.println(a + " >>> " + desplazamiento + " = " + resultado);
    }


}
