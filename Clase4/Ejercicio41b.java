package Clase4;

import java.util.Scanner;

public class Ejercicio41b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // si la temperatura está por encima de 100 sube punto de ebullición
        System.out.println("Digite la temperatura...");
        int temp = sc.nextInt();
        if (temp >= 100){
            System.out.println("Punto ebullición");
        }else{
            System.out.println("No está en punto de ebullición");
        }
        sc.close();
    }
}
