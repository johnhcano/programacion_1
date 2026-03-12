package PatronBuilder;

public class PostScriptConverter extends Converter {

    public PostScriptConverter(String document){
        super(document);
    }

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

