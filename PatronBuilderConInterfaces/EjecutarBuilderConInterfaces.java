package PatronBuilderConInterfaces;

public class EjecutarBuilderConInterfaces {
    
    public static void main(String[] args) {
        
        //Crear los objetos del convertidor
        Converter objASCII = new ASCIIConverter();
        Converter objPostScript = new PostScriptConverter();
        Converter objPDF = new PDFConverter();

        Reader objLector1 = new Reader("LINE", objASCII);
        Reader objLector2 = new Reader("LINE", objPDF);
        Reader objLector3 = new Reader("TABLE", objPostScript);
        

        objLector1.parseInput(); //makeLine -> ASCII
        objLector2.parseInput(); //makeLine -> PDF
        objLector3.parseInput(); //makeTable -> PostScript
    } 
}