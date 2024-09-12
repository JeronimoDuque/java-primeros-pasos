/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.karinahx.calculadoraoperativa;

/**
 *
 * @author karyj
 */
public class OpBooleanos {

    // AND lógico
    public boolean and(boolean a, boolean b) {
        boolean resultado = a && b;
        System.out.println("Operador AND: ");
        System.out.println(a + " && " + b + " = " + resultado);
        return resultado;
    }

    // OR lógico
    public boolean or(boolean a, boolean b) {
        boolean resultado = a || b;
        System.out.println("Operador OR: ");
        System.out.println(a + " || " + b + " = " + resultado);
        return resultado;
    }

    // NOT lógico
    public boolean not(boolean a) {
        boolean resultado = !a;
        System.out.println("Operador NOT: ");
        System.out.println("!" + a + " = " + resultado + "\n");
        return resultado;
    }


}
