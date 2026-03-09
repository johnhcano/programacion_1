package Clase6;

import java.util.Scanner;

public class Ejercicio412 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1, num2;
        int seleccion;

        System.out.println("Digite número 1");
        num1 = sc.nextDouble();
        System.out.println("Digite número 2");
        num2 = sc.nextDouble();
        System.out.println("Digite la selección 1, 2 o 3");
        seleccion = sc.nextInt();

        if(seleccion == 1){
            System.out.println("La suma es: " + (num1 + num2));
        }else{
            if(seleccion == 2){
                System.out.println("La multiplicación es: " + (num1 * num2));
            }else{
                if(seleccion == 3){
                    System.out.println("La división es: " + (num1 / num2));
                }else{
                    System.out.println("Opción no valida");
                }
            }
        }
        sc.close();
    }
}
