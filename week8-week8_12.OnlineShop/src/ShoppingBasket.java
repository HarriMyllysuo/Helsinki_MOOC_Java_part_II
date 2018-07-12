
import java.util.Map;

public class ShoppingBasket {
    
    private Purchase purchase;
    private Map<String, Purchase> purchases;
    private int price;
    private String product;
    private int amount = 1;
    
    public ShoppingBasket() {
        
        this.purchase = new Purchase(product, amount, price);
        
    }
    
    public void add(String product, int price) {
        
    }
    
    public int price() {
        return 0;
    }
}
