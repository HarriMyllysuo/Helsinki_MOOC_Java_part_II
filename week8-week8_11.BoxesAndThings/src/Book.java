
public class Book implements ToBeStored {
    
    private String writer;
    private String name;
    private double weight;
    
    public Book(String writer, String name, double weight) {
        this.writer = writer;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public double weight() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.writer + ": " + this.name;
    }
    
}
