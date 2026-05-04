package Clase13;

public class Modularizacion {
    public static void main(String[] args) {
        System.out.println(convertirDolares(500000));
        mostrarSaludo("Juan");
        System.out.println(descuento(100));
        System.out.println(calcularDescuento(100, 40.0));
        System.out.println(verificarNumeroPrimo(5));
        System.out.println(verificarNumeroPrimoContador(5));
        System.out.println(verificarNumeroPrimoWhile(5));
        
    }

    public static double convertirDolares(double monedaLocal) {
        return monedaLocal / 3631.44;
    }

    public static void mostrarSaludo(String nombre) {
        System.out.println("Bienvenido al curso " + nombre + "...");
    }

    public static double descuento(int precio) {
        return precio - (precio * 0.15);
    }

    public static double calcularDescuento(int precio, double descuento) {
        return precio - (precio * (descuento / 100));
    }

    //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53....
    public static boolean verificarNumeroPrimo(int numero){
        boolean esPrimo = true;
        for(int i = 2; i < numero; i++){
            if((numero % i == 0)){
                esPrimo = false;
            }
        } 
        return esPrimo;
    }

    public static String verificarNumeroPrimoContador(int numero){
        int contador = 0;
        for(int i = 2; i < numero; i++){
            if((numero % i == 0)){
                contador++;
            }
        } 
        if(contador == 0) {
            return "El número " + numero + " es primo";
        }else{
            return "El número " + numero + " no es primo";
        }
    }

    public static boolean verificarNumeroPrimoWhile(int numero){
        boolean esPrimo = true;
        int i = 2;
        while(i < numero){
            if((numero % i == 0)){
                esPrimo = false;
            }
            i++;
        }
        return esPrimo;
    }

}
