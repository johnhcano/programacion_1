public class Ejecutar {
    public static void main(String[] args) {
        
        //Creación de los objetos
        //La palabra reservada "new" significa instanciar, crear, darle vida al objeto
        Estudiante objEstudiante1 = new Estudiante(1100256698, "Pepito", "Perez", 20); 
        Estudiante objEstudiante2 = new Estudiante(1001741896, "Julian", "Panameño", 21); 

        System.out.println(objEstudiante1.toString());
        System.out.println(objEstudiante2.toString());

        System.out.println("La nota final del estudiante " + 
                            objEstudiante1.getNombres() + " es: " + 
                            objEstudiante1.calcularNotaFinal(3.0, 2.0, 5.0));
        System.out.println("La nota final del estudiante " + 
                            objEstudiante2.getNombres() + " es: " + 
                            objEstudiante2.calcularNotaFinal(1.0, 1.0, 4.0));
        
    }
}
