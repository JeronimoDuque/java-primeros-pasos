/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.karinahx.calculadoraoperativa;

/**
 *
 * @author karyj
 */
public class CalculadoraOperativa {
    
    // Método para ejecutar operadores aritméticos
    public static void aritmeticosIntEjecutar(Lectura lectura, OpAritmeticos aritmeticos) {
        int num1 = lectura.leerEntero("Ingrese el primer número: ");
        int num2 = lectura.leerEntero("Ingrese el segundo número: ");
        aritmeticos.sumar(num1, num2);
        aritmeticos.restar(num1, num2);
        aritmeticos.multiplicar(num1, num2);
        aritmeticos.dividir(num1, num2);
        aritmeticos.modulo(num1, num2);
    }    
    
    public static void aritmeticosDoublesEjecutar(Lectura lectura, OpAritmeticos aritmeticos) {
        double num1 = lectura.leerDouble("Ingrese el primer número: ");
        double num2 = lectura.leerDouble("Ingrese el segundo número: ");
        aritmeticos.sumar(num1, num2);
        aritmeticos.restar(num1, num2);
        aritmeticos.multiplicar(num1, num2);
        aritmeticos.dividir(num1, num2);
        aritmeticos.modulo(num1, num2);
    }

    // Método para ejecutar operadores relacionales
    public static void relacionalesEjecutar(Lectura lectura, OpRelacionales relacionales) {
        int a = lectura.leerEntero("Ingrese el primer número: ");
        int b = lectura.leerEntero("Ingrese el segundo número: ");
        relacionales.esMayor(a, b);
        relacionales.esMenor(a, b);
        relacionales.esIgual(a, b);
        relacionales.esDiferente(a, b);
        relacionales.esMayorOIgual(a, b);
        relacionales.esMenorOIgual(a, b);

    }

    // Método para ejecutar operadores de bits
    public static void bitsEjecutar(Lectura lectura, OpDeBits bits) {
        int num1 = lectura.leerEntero("Ingrese el primer número: ");
        int num2 = lectura.leerEntero("Ingrese el segundo número: ");
        bits.and(num1, num2);
        bits.or(num1, num2);
        bits.xor(num1, num2);
        bits.complemento(num1);
        int desplazamiento = lectura.leerEntero("Ingrese el número de posiciones para desplazar: ");
        bits.desplazarIzquierda(num1, desplazamiento);
        bits.desplazarDerecha(num1, desplazamiento);
        bits.desplazarDerechaSinSigno(num1, desplazamiento);
    
    }
    
    public static void booleanosEjecutar(Lectura lectura, OpBooleanos booleanos) {
        boolean valor1 = lectura.leerBooleano("Ingrese el primer valor booleano ");
        boolean valor2 = lectura.leerBooleano("Ingrese el segundo valor booleano ");
        
        // Operaciones booleanas con impresiones
        System.out.println("Resultado de AND:");
        booleanos.and(valor1, valor2);

        System.out.println("Resultado de OR:");
        booleanos.or(valor1, valor2);

        System.out.println("Resultado de NOT en el primer valor:");
        booleanos.not(valor1);

        System.out.println("Resultado de NOT en el segundo valor:");
        booleanos.not(valor2);
    }
    
    public static void incrementalesEjecutar(Lectura lectura, OpIncrementales incrementales) {
        int valor = lectura.leerEntero("Ingrese un valor inicial: ");
        int patron = lectura.leerEntero("Ingrese el valor con el que se va a asociar:");
        System.out.println("Incremento prefijo (++valor):");
        incrementales.incrementarPrefijo(valor);
        System.out.println("\nIncremento sufijo (valor++):");
        incrementales.incrementarSufijo(valor);
        System.out.println("\nDecremento prefijo (--valor):");
        incrementales.decrementarPrefijo(valor);
        System.out.println("\nDecremento sufijo (valor--):");
        incrementales.decrementarSufijo(valor);
        System.out.println("\nSuma combinada (valor = valor + patron):");
        incrementales.sumaCombinada(valor,patron);
        System.out.println("\nResta combinada (valor = valor - patron):");
        incrementales.restaCombinada(valor,patron);
        System.out.println("\nProducto combinado (valor = valor * patron):");
        incrementales.productoCombinado(valor,patron);
        System.out.println("\nDivicion combinada (valor = valor / patron):");
        incrementales.divicionCombinada(valor,patron);
        System.out.println("\nResto combinado (valor = valor % patron):");
        incrementales.restoCombinado(valor,patron);
    }
    
    public static void cadenasEjecutar(Lectura lectura, OpCadenas cadenas) {
        String cadena1 = lectura.leerCadena("Ingrese la primer frase: ");
        String cadena2 = lectura.leerCadena("Ingrese la segunda frase: ");
        System.out.println("\nLa unión o concatenación de las frases es: " + cadena1 + " + " + cadena2 + " = " + cadenas.concatenar(cadena1, cadena2));
        System.out.println("Comparación de frases (equals): " + cadena1 + " == " + cadena2 + " = " + cadenas.compararCadenas(cadena1, cadena2));
        System.out.println("Longitud de la frase 1: " + cadenas.longitud(cadena1));
        System.out.println("Longitud de la frase 2: " + cadenas.longitud(cadena2));
        
        int startIndex = lectura.leerEntero("Ingrese el índice de inicio para la subfrase de la primera frase: ");
        System.out.println("Subfrase de la frase 1 desde el índice es " + startIndex + ": " + cadenas.subcadena(cadena1, startIndex));
    }
    
    public static void bienvenida(){
        System.out.println("============================================");
        System.out.println("=       BIENVENIDO(A) A TU PROGRAMA        =");
        System.out.println("=  Técnicas de programación y laboratorio  =");
        System.out.println("============================================");
        System.out.println("\n===========  CALCULADORA GK :)  ===========\n");
    }
    
    public static void menu() {
        Lectura lectura = new Lectura();
        OpAritmeticos aritmeticos = new OpAritmeticos();
        OpRelacionales relacionales = new OpRelacionales();
        OpDeBits bits = new OpDeBits();
        OpBooleanos booleanos = new OpBooleanos();
        OpIncrementales incrementales = new OpIncrementales();
        OpCadenas cadenas = new OpCadenas();

        int opcion;
        do {
            
            System.out.println("Seleccione, ¿cuál de los siguientes operadores desea utilizar?:\n ");
            System.out.println("1. Operadores Aritméticos");
            System.out.println("2. Operadores Relacionales");
            System.out.println("3. Operadores de Bits");
            System.out.println("4. Operadores Booleanos");
            System.out.println("5. Operadores Incrementales y Aritmeticos combinados");
            System.out.println("6. Operadores de cadenas");
            System.out.println("7. Salir de la calculadora");
            opcion = lectura.leerEntero("\nIngrese su opción: ");

            switch (opcion) {
                case 1 -> {
                    System.out.println("Seleccione el tipo de números:\n1. Enteros\n2. Dobles");
                    int tipo = lectura.leerEntero("Ingrese su opción: ");
                switch (tipo) {
                    case 1 -> aritmeticosIntEjecutar(lectura, aritmeticos);
                    case 2 -> aritmeticosDoublesEjecutar(lectura, aritmeticos);
                    default -> System.out.println("Opción no válida.");
                }
                }
                case 2 -> relacionalesEjecutar(lectura, relacionales);
                case 3 -> bitsEjecutar(lectura, bits);
                case 4 -> booleanosEjecutar(lectura, booleanos);
                case 5 -> incrementalesEjecutar(lectura, incrementales);
                case 6 -> cadenasEjecutar(lectura, cadenas);
                case 7 -> {
                    System.out.println("Saliendo...");
                    System.out.println("Vuelve pronto :)");
                }
                default -> System.out.println("Opción no válida.");
            }
        } while (opcion != 7);
    }


    
    public static void main(String[] args) {
        bienvenida();
        menu();
    }


}
