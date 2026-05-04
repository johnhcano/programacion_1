package Clase13;

public class Modularizacion {
    public static void main(String[] args) {
        System.out.println(convertirDolares(500000));
        mostrarSaludo("Juan");
        System.out.println(descuento(100));
        System.out.println(calcularDescuento(100, 40.0));
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

}
