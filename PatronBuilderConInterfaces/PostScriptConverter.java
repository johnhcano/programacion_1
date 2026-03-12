package PatronBuilderConInterfaces;

public class PostScriptConverter implements Converter {

    public void makeLine(){
        System.out.println("makeLine -> PostScript");
    }

    public void makeParagraph(){
        System.out.println("makeParagraph -> PostScript");
    }

    public void makeTable(){
        System.out.println("makeTable -> PostScript");
    }
}
