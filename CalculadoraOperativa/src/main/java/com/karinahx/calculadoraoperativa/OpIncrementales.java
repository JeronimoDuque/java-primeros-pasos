/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.karinahx.calculadoraoperativa;

/**
 *
 * @author karyj
 */
public class OpIncrementales {
    
    // Método para mostrar el uso del operador incremento prefijo (++valor)
    public int incrementarPrefijo(int valor) {
        System.out.println("Valor antes del incremento: " + valor);
        ++valor;
        System.out.println("Valor después del incremento: " + valor);
        return valor;
    }

    // Método para mostrar el uso del operador incremento sufijo (valor++)
    public int incrementarSufijo(int valor) {
        System.out.println("Valor antes del incremento: " + valor);
        int resultado = valor++;
        System.out.println("Valor retornado antes de incremento: " + resultado);
        System.out.println("Valor después del incremento: " + valor);
        return valor;
    }

    // Método para mostrar el uso del operador decremento prefijo (--valor)
    public int decrementarPrefijo(int valor) {
        System.out.println("Valor antes del decremento prefijo: " + valor);
        --valor;
        System.out.println("Valor después del decremento prefijo: " + valor);
        return valor;
    }

    // Método para mostrar el uso del operador decremento sufijo (valor--)
    public int decrementarSufijo(int valor) {
        System.out.println("Valor antes del decremento sufijo: " + valor);
        int resultado = valor--;
        System.out.println("Valor retornado antes de decremento sufijo: " + resultado);
        System.out.println("Valor después del decremento sufijo: " + valor);
        return valor;
    }

    public int sumaCombinada(int valor ,int patron) {
        System.out.println("Valor antes de: " + valor);
        valor += patron;
        System.out.println("Valor retornado de la suma combinada: " + valor);
        return valor;
    }

    public int restaCombinada(int valor ,int patron) {
        System.out.println("Valor antes de: " + valor);
        valor -= patron;
        System.out.println("Valor retornado de la resta combinada: " + valor);
        return valor;
    }

    public int productoCombinado(int valor ,int patron) {
        System.out.println("Valor antes de: " + valor);
        valor *= patron;
        System.out.println("Valor retornado del producto combinado: " + valor);
        return valor;
    }

    public int divicionCombinada(int valor ,int patron) {
        System.out.println("Valor antes de: " + valor);
        if (patron != 0) {
            valor /= patron;
            System.out.println("Valor retornado de la divicion combinada: " + valor);
            return valor;
        }else{
            System.out.println("El patron no puede ser igual al 0 por que no se puede dividir sobre 0");
            return valor;
        }
    }

    public int restoCombinado(int valor ,int patron) {
        if (patron != 0) {
            valor %= patron;
            System.out.println("Valor retornado del resto combinado: " + valor);
            return valor;
        }else{
            System.out.println("El patron no puede ser igual al 0 por que no se puede dividir sobre 0");
            return valor;
        }
    }
}
