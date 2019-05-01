/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP918631.pizza_attributes;

/**
 *
 * @author M
 */
public enum PizzaSize {
    
    SMALL("Small", 9.45),
    MEDIUM("Medium", 11.87),
    LARGE("Large", 15.90)
    ;
    
    
    
    
    private final String displayName;
    private final double price;
    
    public String getDisplayName(){
        return displayName;
    }
    
    public double getPrice(){
        return price;
    }
    
    private PizzaSize(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }
}
