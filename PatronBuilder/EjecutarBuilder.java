package PatronBuilder;

public class EjecutarBuilder {
    public static void main(String[] args) {
        
        //Crear los objetos del convertidor
        Converter objASCII = new ASCIIConverter("ASCII");
        Converter objPostScript = new PostScriptConverter("PostScript");
        Converter objPDF = new PDFConverter("PDF");

        Reader objLector1 = new Reader("LINE", objASCII);
        Reader objLector2 = new Reader("LINE", objPDF);
        Reader objLector3 = new Reader("TABLE", objPostScript);
        

        objLector1.parseInput(); //makeLine -> ASCII
        objLector2.parseInput(); //makeLine -> PDF
        objLector3.parseInput(); //makeTable -> PostScript
    } 
}
