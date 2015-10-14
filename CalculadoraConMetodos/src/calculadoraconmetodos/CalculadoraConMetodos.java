/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraconmetodos;

import java.util.Scanner;

/**
 *
 * @author danie
 */
public class CalculadoraConMetodos {

    public static void main(String[] args) {
        Scanner intro = new Scanner (System.in);
        menu(intro);
    }
	
    public static void menu (Scanner intro){

        int opc = 0;
        double num1 = 0;
        double num2 = 0;
        int salir = 0;

        do{
        System.out.println("Eliga la operación a realizar");
        System.out.println("opc. 1 Sumar");
        System.out.println("opc. 2 restar");
        System.out.println("opc. 3 multiplicar");
        System.out.println("opc. 4 dividir");
        System.out.println("opc. 5 calcular el mayor");
        System.out.println("opc. 6 calcular potencia");
        System.out.println("opc. 7 salir");
        opc = intro.nextInt();

        if (opc >=1 && opc <7){
                System.out.println("Ingrese el 1er numero");
                num1 = intro.nextInt();
                System.out.println("Ingrese el 2do numero");
                num2 = intro.nextInt();
        }

        switch (opc){
            case 1:
                System.out.println("La suma da: " + (int)sumar (num1, num2));
                System.out.println("-------------------");
                break;
            case 2: 
                System.out.println("La resta da: " + (int)restar (num1, num2));
                System.out.println("-------------------");
                break;
            case 3:
                System.out.println("La multiplicacion da: " + (int)multiplicacion (num1, num2));
                System.out.println("-------------------");
                break;
            case 4:
                System.out.println("La division da: " + division (num1, num2));
                System.out.println("-------------------");
                break;
            case 5:
                System.out.println("El numero mayor es: " + (int)calcularMayor (num1, num2));
                System.out.println("-------------------");
                break;
            case 6:
                System.out.println("El numero "+(int)num1+" elevado a "+(int)num2+" da: " + (int)calcularPotencia (num1, num2));
                System.out.println("-------------------");
                break;
            case 7:
                System.out.println("¿Desea salir?");
                System.out.println("opcion 1. Si");
                System.out.println("opcion 2. No");
                salir = intro.nextInt();
                break;
        }
        }while (opc != 7 || salir == 2);
        System.out.println("Hasta Luego");
    }

    public static double sumar (double num1, double num2){
        double suma = 0;
        suma = (num1 + num2);
        return suma;
    }

    public static double restar (double num1, double num2){
        double resta = 0;
        resta = (num1 - num2);
        return resta;
    }

    public static double multiplicacion (double num1, double num2){
        double multiplicar = 0;
        multiplicar = (num1 * num2);
        return multiplicar;
    }

    public static double division (double num1, double num2){
        double dividir = 0;
        dividir = (num1 / num2);
        return dividir;
    }

    public static double calcularMayor (double num1, double num2){
        double mayor = 0;
        mayor = Math.max(num1, num2);
        return mayor;
    }

    public static double calcularPotencia (double num1, double num2){
        double potencia = 0;
        potencia = Math.pow(num1, num2);
        return potencia;
    }
    
}
