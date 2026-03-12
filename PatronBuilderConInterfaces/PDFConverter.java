package PatronBuilderConInterfaces;

public class PDFConverter implements Converter {

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