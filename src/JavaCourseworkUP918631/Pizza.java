package JavaCourseworkUP918631;

import JavaCourseworkUP918631.pizza_attributes.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * UP918631
 */
public class Pizza {

    private PizzaSize size;
    private PizzaCrust crust;
    private PizzaSauce sauce;
    private PizzaTopping topping1;
    private PizzaTopping topping2;

    public Pizza(
            PizzaSize size,
            PizzaCrust crust,
            PizzaSauce sauce,
            PizzaTopping topping1,
            PizzaTopping topping2) {

        this.size = size;
        this.crust = crust;
        this.sauce = sauce;
        this.topping1 = topping1;
        this.topping2 = topping2;

    }

    //get
    public PizzaSize getSize() {
        return size;
    }

    public PizzaCrust getCrust() {
        return crust;
    }

    public PizzaSauce getSauce() {
        return sauce;
    }

    public PizzaTopping getTopping1() {
        return topping1;
    }

    public PizzaTopping getTopping2() {
        return topping2;
    }

    //set
    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public void setCrust(PizzaCrust crust) {
        this.crust = crust;
    }

    public void setSauce(PizzaSauce sauce) {
        this.sauce = sauce;
    }

    public void setTopping1(PizzaTopping topping1) {
        this.topping1 = topping1;
    }

    public void setTopping2(PizzaTopping topping2) {
        this.topping2 = topping2;
    }

    //get total Pizza cost
    public double getCost() {
        double price;
        price = 0;

        //Size costs
        price += size.getPrice();

        //crust costs
        price += crust.getPrice();

        //sauce costs
        price += sauce.getPrice();

        // topping1 costs
        price += 5 * topping1.getPrice();

        // topping2 costs
        price += 4 * topping2.getPrice();

        return Math.round(price * 100D) / 100D;
    }

    //get Pizza attribute prices
    public double getTopping1Price() {
        return Math.round(5 * topping1.getPrice() * 100D) / 100D;
    }

    public double getTopping2Price() {
        return Math.round(4 * topping2.getPrice() * 100D) / 100D;
    }

    private String getSizeInfo() {
        return size.getDisplayName() + " Size: £" + size.getPrice();
    }

    private String getCrustInfo() {
        return crust.getDisplayName() + " Crust: £" + crust.getPrice();
    }

    private String getBaseInfo() {
        return "BASE COST: £" + (size.getPrice() + crust.getPrice());
    }

    private String getTopping1Info() {
        return topping1.getDisplayName() + " Topping: 5 * £" + topping1.getPrice() + " = £" + getTopping1Price();
    }

    private String getTopping2Info() {
        return topping2.getDisplayName() + " Topping: 4 * £" + topping2.getPrice() + " = £" + getTopping2Price();
    }

    private String getSauceInfo() {
        return sauce.getDisplayName() + " Sauce: £" + sauce.getPrice();
    }

    //return formatted Invoice
    public String getInvoice() {
        return "Total Cost: £" + getCost() + "\r\n"
                + getSizeInfo() + "\r\n"
                + getCrustInfo() + "\r\n"
                + getBaseInfo() + "\r\n"
                + getTopping1Info() + "\r\n"
                + getTopping2Info() + "\r\n"
                + getSauceInfo();
    }

}
