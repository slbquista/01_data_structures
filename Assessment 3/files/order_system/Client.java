package order_system;

import java.util.Queue;
import java.util.LinkedList;

/**
 * @author 1516392
 */

public class Client {
    
    private static Stock stock;
    private static Queue orders;
    
    public static void main(String[] args) {
        
        //  Get Stock Instance
        stock = Stock.getInstance();
        orders = new LinkedList();
        
        //  Create orders and add to Queue
        Order order_0 = new Order(0, "Finn Turnbull");
        order_0.add("Whisky");
        orders.add(order_0);
        
        Order order_1 = new Order(1, "A Name");
        order_1.add("Bread");
        order_1.add("Cereal");
        orders.add(order_1);
        
        //  Output All orders information
        System.out.println(orders);
    }
}