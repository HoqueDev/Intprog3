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
public enum PizzaSauce {
    
    TOMATO("Tomato", 0.00d),
    PESTO("Pesto", 0.50d)
    ;
    
    private final String displayName;
    private final double price;

    private PizzaSauce(String displayName, double price) {
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
