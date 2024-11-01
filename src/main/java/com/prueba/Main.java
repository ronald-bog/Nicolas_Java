// Github: Graffhe01
// nicolasgraffhe3@gmail.com

package com.prueba;

public class Main {
    public static void main(String[] args) {
        String a = ejecutar2("Hola");
        System.out.println(a);

    }

    // Metodo void sin params
    public static void funcion() {
        System.out.println("Hola mundo");
    }

    // Metodo void con params
    public static void funcionP(int num1) {
        System.out.println(num1);
    }

    // Metodos return con params
    public static int funcionR(int a, int b) {
        int var = a + b;
        return var;
    }

    // varargs(...)
    public static void mostrarNumeros(int... numeros) {
        for (int num : numeros) {
            System.out.println(num);
        }
    }

    public static int sumar(int... numeros) {
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    // Sobrecarga de metodos

    public static void metodo1(String frase) {
        System.out.printf("Primer parametro: %s", frase);
    }

    public static void metodo1(String frase, String frase2) {
        System.out.printf("Primer parametro: %s \n", frase);
        System.out.printf("Segundo parametro: %s", frase2);
    }

    // Retorno condicionado
    public static String retornoCondicionado(String clima) {
        if (clima.equals("frio"))return "El clima esta frio";
         else if (clima.equals("calido")) return "El clima esta calido";
        return "no me diste un estado del tiempo";
    }

    // Parametros Genericos
    public static <T> void ejecutar(T param){
        System.out.println(param);
    }

    // Retorno generico
    public static <T> T ejecutar2(T x){
        return x;
    }
}
