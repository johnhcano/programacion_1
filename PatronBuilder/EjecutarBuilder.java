package PatronBuilder;

public class EjecutarBuilder {
    public static void main(String[] args) {
        
        //Crear los objetos del convertidor
        Converter objASCII = new ASCIIConverter("ASCII");
        Converter objPostScript = new PostScriptConverter("PostScript");
        Converter objPDF = new PDFConverter("PDF");

        Reader objLector = new Reader("LINE", objASCII);

        objLector.parseInput(); 


    } 
}
