
public class Main {

    public static void main(String[] args) {
        // write some test code here
        
        Purchase purchase = new Purchase("milk", 4, 2);
        System.out.println("the total price of a purchase containing "
                + "four milks is " + purchase.price());
        System.out.println(purchase);
        purchase.increaseAmount();
        System.out.println(purchase);
        
        /* Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);
        
        System.out.println("products:");
        for (String product : store.products()) {
            System.out.println(product);
        } */
        
        /* System.out.println("stocks:");
        System.out.println("coffee: " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar"));
        
        System.out.println("\nwe take a coffee " + store.take("coffee"));
        System.out.println("we take a coffee " + store.take("coffee"));
        System.out.println("we take sugar " + store.take("sugar"));
        
        System.out.println("\nstocks:");
        System.out.println("coffee: " + store.stock("coffee"));
        System.out.println("sugar: " + store.stock("sugar")); */
    }
}
