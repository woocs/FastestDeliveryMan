
package fastestdeliveryman;

/**
 *
 * @author woo
 */
public class Order {
    private String id, item, status, cname;
    private int quantity;
    
    public Order(String ID, String Item, int Quantity, String Status, String Cname){
        this.id = ID;
        this.item = Item;
        this.quantity = Quantity;
        this.status = Status;   
        this.cname = Cname;
    }
    
     public String getId()
    {
        return id;
    }
    
    public String getItem()
    {
        return item;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public String getCname()
    {
        return cname;
    }
    
}