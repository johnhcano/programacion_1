package PatronBuilder;

public class PDFConverter extends Converter {

    public PDFConverter(String document){
        super(document);
    }

    public void makeLine(){
        System.out.println("makeLine -> PDF");
    }

    public void makeParagraph(){
        System.out.println("makeParagraph -> PDF");
    }

    public void makeTable(){
        System.out.println("makeTable -> PDF");
    }
}

