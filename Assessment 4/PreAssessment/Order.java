package PreAssessment;

/**
* The Order class is the primary place that order details such as ID,
* Name of Customer and Items added will be stored.
* 
* @author  Kevin McDonald
* @version 1.0
* @since   05-03-2018 
*/
public class Order {
    
    private final int id;
    private final String customerName;
    
    public Order(int id, String name){
        this.id = id;
        this.customerName = name;
    }
    
    public boolean add(Item item){
        //  Add items to collection. This collection is unlikely
        //  to regularly adjust in size but is not static
        //  Placeholder return
        return false;
    }
    
    public boolean remove(Item item){
        //  Iterate through collection and remove item from order if found
        //  And return true. Else...
        return false;
    }
    
    public String getCustomerName(){
        return customerName;
    }
    
    public double getTotal(){
        double total = 0;
        //  Iterate through order and collate item cost
        return total;
    }

    @Override
    public String toString() {
        String output = "";
        output += "Order ID: " + id;
        output += "\nCustomer Name: " + customerName;
        output += "\nItems: ";
        //  Iterate through collection of items in order and add them to output
        return output;
    }
}
