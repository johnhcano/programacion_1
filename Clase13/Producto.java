package Clase13;

public class Producto {
    
    private String nombre;
    private double precio;
    private int stock;
    
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String realizarVenta(int cantidad){
        String cad = "";
        if(stock < cantidad){
            cad = "No hay stock disponible";
        }else{
            stock -= cantidad;
            cad = "Venta realizada del producto " + 
                   nombre + ", nuevo stock es: " + stock +
                   " valor a pagar es: " + (precio * cantidad);
        }
        return cad;
    }
}
