/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.karinahx.calculadoraoperativa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author karyj
 */

public class Lectura {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // Método para leer enteros con validación
    // Leer un entero
    public int leerEntero(String mensaje) {
        int valor = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                valor = Integer.parseInt(reader.readLine());
                valido = true;
            } catch (NumberFormatException | IOException e) {
            System.out.println("Error: debe ingresar un número entero válido.");
            }
        }
        return valor;
    }

    // Leer un double
    public double leerDouble(String mensaje) {
        double valor = 0.0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                valor = Double.parseDouble(reader.readLine());
                valido = true;
            } catch (NumberFormatException | IOException e) {
                System.out.println("Error: debe ingresar un número decimal válido.");
            }
        }
        return valor;
    }
    
    // Método para leer un valor booleano validado (true o false)
    public boolean leerBooleano(String mensaje) {
        boolean valor = false;
        boolean valido = false;

    while (!valido) {
            try {
                System.out.print(mensaje + "(true/false): ");
                String input = reader.readLine().trim();  // Leer la entrada como cadena y eliminar espacios

                // Validar entrada
                if (input.equalsIgnoreCase("true")) {
                    valor = true;
                    valido = true;
                } else if (input.equalsIgnoreCase("false")) {
                    valor = false;
                    valido = true;
                } else {
                    System.out.println("Error: Debe ingresar true o false.");
                }
            } catch (IOException e) {
                System.out.println("Error de entrada/salida. Intente nuevamente.");
            }
        }

        return valor;
    }
    // Leer una cadena
    public String leerCadena(String mensaje) {
        String valor = "";
        boolean valido = false;
        while (!valido) {
            try {
                System.out.print(mensaje);
                valor = reader.readLine();
                valido = true;
            } catch (IOException e) {
                System.out.println("Error de entrada/salida.");
            }
        }
        return valor;
    }
}

