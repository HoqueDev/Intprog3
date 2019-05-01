/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCourseworkUP918631.pizza_attributes;

import java.text.DecimalFormat;

/**
 *
 * @author M
 */
public enum PizzaTopping {
    NONE("None", 0.00),
    OLIVES("Olive", 0.08),
    EXTRA_CHEESE("Extra Cheese", 0.02),
    CHILLI("Chilli", 0.06),
    PEPPERONI("Pepperoni", 0.10),
    MUSHROOM("Mushroom", 0.03),
    ROCKET("Rocket", 0.05),
    JALAPENOS("Jalapenos", 0.20),
    ONION("Onion", 0.07),
    ANCHOVY("Anchovy", 0.09);

    private final String displayName;
    private final double price;   

    public double getPrice() {
        return Math.round(price * 100D) / 100D;
    }
    
    public String getDisplayName() {
        return displayName;
    }

    private PizzaTopping(String displayName, double price) {
        this.displayName = displayName;
        this.price = price;
    }
}
