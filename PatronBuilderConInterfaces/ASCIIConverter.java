package PatronBuilderConInterfaces;

public class ASCIIConverter implements Converter {

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
