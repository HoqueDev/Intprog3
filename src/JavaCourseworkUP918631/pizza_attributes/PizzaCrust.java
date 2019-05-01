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
public enum PizzaCrust {
    
    THIN("Thin", 1.08),
    DEEP("Deep", 1.10),
    STUFFED("Stuffed", 2.14)
    ;
    
    private final String displayName;
    private final double price;

    private PizzaCrust(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }
    
    public double getPrice(){
        return price;
    }

    public String getDisplayName() {
        return displayName;
    }
}
