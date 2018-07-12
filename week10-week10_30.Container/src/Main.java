
import containers.ProductContainer;
import containers.ProductContainerRecorder;


public class Main {

    public static void main(String[] args) {
        // write test code here
        
        // 30.1 & 30.2
        /*ProductContainer juice = new ProductContainer("Juice", 1000);
        juice.addToTheContainer(1000);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName());
        juice.addToTheContainer(1.0);
        System.out.println(juice); */
        
        // 30.6 & 30.7
        ProductContainerRecorder juice = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice.takeFromTheContainer(11.3);
        //System.out.println(juice.getName());
        juice.addToTheContainer(1.0);
        //System.out.println(juice);
        //System.out.println(juice.history());
        
        juice.printAnalysis();
    }

}
