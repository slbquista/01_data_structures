package PreAssessment;

/**
 * The Stock class uses a Singleton Pattern.
 * This stock object will have a list of items. This will be used to check what
 * items are available within the system and return an item for adding to an
 * Order. 
 * @author  Kevin McDonald
 * @version 1.0
 * @since   05-03-2018 
 */
public class Stock {
    
    
    private static Stock instance;

    private Stock() {
        //  Create a collection of items that we hold in stocks
    }

    public static Stock getInstance() {
        if(instance == null)
            instance = new Stock();
        return instance;
    }

    public Item getItem(String name){
        //  Iterate through items and return item if found
        
        //  Elses
        return null;
    }
}
