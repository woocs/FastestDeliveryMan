/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastestdeliveryman;

/**
 *
 * @author woo
 */
public class Customer {
    private String name;
    private int total;
    
    public Customer(String Name, int Total){
        this.name = Name;
        this.total = Total;
    }
    
     public String getName()
    {
        return name;
    }
    
    public Integer getTotal()
    {
        return total;
    }
}
