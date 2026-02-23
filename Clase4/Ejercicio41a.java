package Clase4;

import java.util.Scanner;

public class Ejercicio41a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Pedir el ángulo por parte del usuario
        System.out.println("Digite el ángulo: ");
        int angulo = sc.nextInt();
        // Condicional
        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo no es un ángulo recto");
        }
        sc.close();

    }
}
