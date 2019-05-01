package JavaCourseworkUP918631;

import JavaCourseworkUP918631.pizza_attributes.PizzaCrust;
import JavaCourseworkUP918631.pizza_attributes.PizzaSauce;
import JavaCourseworkUP918631.pizza_attributes.PizzaSize;
import JavaCourseworkUP918631.pizza_attributes.PizzaTopping;
import java.util.ArrayList;
import java.util.Arrays;

public class Order {

    private ArrayList<Pizza> pizzaList;

    public Order() {
        this.pizzaList = new ArrayList<>();
    }

    public Order(Pizza... pizzas) {
        this();
        pizzaList.addAll(Arrays.asList(pizzas));
    }

    public Pizza get(int index) {
        return pizzaList.get(index);
    }

    public void set(int index, Pizza pizza) {
        this.pizzaList.set(index, pizza);
    }

    public int pizzaSize() {
        return pizzaList.size();
    }

    public Pizza getPizza() {
        Order.this.get(0);
        return Order.this.get(0);
    }

    public String getInvoice() {
        String totalInvoice = "";

        for (int i = 0; i < pizzaList.size(); i++) {
            totalInvoice += pizzaList.get(i).getInvoice() + "\r\n\r\n";
        }

        return totalInvoice;
    }

    public double getTotalCost() {
        float cost = 0;

        for (int i = 0; i < pizzaList.size(); i++) {
            cost += pizzaList.get(i).getCost();
        }
        
        return Math.round(cost * 100D) / 100D;
    }

    public int getPizzaCount() {
        return pizzaList.size();
    }

    public void addPizza(Pizza pizzaToAdd) {
        pizzaList.add(pizzaToAdd);
    }

    //delete pizza(s)
    public void deletePizza(Pizza pizzaToRemove) {
        pizzaList.remove(pizzaToRemove);
    }

    public void deletePizza(int pizzaNumber) {
        pizzaList.remove(pizzaNumber);
    }

    //update pizza(s)
    public void updatePizza(Pizza pizzaToUpdate, Pizza pizzaNew) {
        if (pizzaList.contains(pizzaToUpdate)) {
            set(pizzaList.indexOf(pizzaToUpdate), pizzaNew);
        }
    }
}
