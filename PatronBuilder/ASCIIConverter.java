package PatronBuilder;

public class ASCIIConverter extends Converter {

    public ASCIIConverter(String document){
        super(document);
    }

    public void makeLine(){
        System.out.println("makeLine -> ASCII");
    }

    public void makeParagraph(){
        System.out.println("makeParagraph -> ASCII");
    }

    public void makeTable(){
        System.out.println("makeTable -> ASCII");
    }
}
