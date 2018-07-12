
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    
    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stocks = new HashMap<String, Integer>();
    
    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product) {
        for (String key : prices.keySet()) {
            if (key.equals(product)) {
                return prices.get(key);
            }
            // else return -99;
        }
        return -99;
    }
    
    public int stock(String product) {
        for (String key : stocks.keySet()) {
            if (key.equals(product)) {
                return stocks.get(key);
            }
        }
        return 0;
    }
    
    public boolean take(String product) {
        if (this.prices.containsKey(product) && this.stocks.get(product) > 0) {
            this.stocks.put(product, this.stocks.get(product) - 1);
            return true;
        } else { 
            return false;
        }
    }
    
    public Set<String> products() {
        Set<String> products = new HashSet<String>();
        for (String key : this.prices.keySet()) {
            products.add(key);
        }
        return products;
    }
}
