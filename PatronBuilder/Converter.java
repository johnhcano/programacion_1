package PatronBuilder;

public class Converter {
    
    private String document;

    public Converter(String document){
        this.document = document;
    }

    public String getDocument(){
        return document;
    }

    public void setDocument(String document){
        this.document = document;
    }

    public void makeLine(){
        System.out.println("Converter Line");
    }

    public void makeParagraph(){
        System.out.println("Converter Paragraph");
    }

    public void makeTable(){
        System.out.println("Converter Table");
    }
}
