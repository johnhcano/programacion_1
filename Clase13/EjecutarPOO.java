package Clase13;

public class EjecutarPOO {
    public static void main(String[] args) {
        
        //Ejecución del ejercicio #23
        //Instanciar
        Libro objLibro1 = new Libro("Tom Sawyer", "Mark Twain", 456);
        Libro objLibro2 = new Libro("100 Años de Soledad", "Gabriel García Márquez", 298);
        //Mostrar los objetos
        System.out.println(objLibro1);
        System.out.println(objLibro2);

        //Ejecución ejercicio #29
        Producto objP1 = new Producto("Detergente Ariel", 5000.0, 10);
        System.out.println(objP1.realizarVenta(5));
        System.out.println(objP1.realizarVenta(2));

    }
}
