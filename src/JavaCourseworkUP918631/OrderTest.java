package JavaCourseworkUP918631;

import JavaCourseworkUP918631.pizza_attributes.PizzaCrust;
import JavaCourseworkUP918631.pizza_attributes.PizzaSauce;
import JavaCourseworkUP918631.pizza_attributes.PizzaSize;
import JavaCourseworkUP918631.pizza_attributes.PizzaTopping;

/**
 *
 * @author M
 */
public class OrderTest {

    public static void main(String[] args) {

        //Make Standard order
        Order order = new Order();

        order.addPizza(new Pizza(PizzaSize.MEDIUM, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.EXTRA_CHEESE, PizzaTopping.CHILLI));
        order.addPizza(new Pizza(PizzaSize.MEDIUM, PizzaCrust.STUFFED, PizzaSauce.PESTO, PizzaTopping.OLIVES, PizzaTopping.ONION));
        order.addPizza(new Pizza(PizzaSize.SMALL, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.CHILLI, PizzaTopping.PEPPERONI));

        System.out.println("********GET INVOICES ********");
        System.out.println(order.getInvoice());

        System.out.println("********GET TOTAL COST********");
        System.out.println("Total cost: " + order.getTotalCost() + "\r\n");

        System.out.println("********GET PIZZA COUNT********");
        System.out.println("Pizza's in order: " + order.getPizzaCount() + "\r\n");

        System.out.println("********DELETE PIZZA********");
        order.deletePizza(2);
        //order.deletePizza(new Pizza(PizzaSize.SMALL, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.CHILLI, PizzaTopping.PEPPERONI));
        System.out.println(order.getInvoice());
        System.out.println("Total cost: " + order.getTotalCost() + "\r\n");
        System.out.println("Pizza's in order: " + order.getPizzaCount() + "\r\n");

        System.out.println("********ADD PIZZA********");
        Pizza pizza1 = new Pizza(PizzaSize.MEDIUM, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.EXTRA_CHEESE, PizzaTopping.CHILLI);
        order.addPizza(pizza1);
        System.out.println(order.getInvoice());
        System.out.println("Total cost: " + order.getTotalCost() + "\r\n");
        System.out.println("Pizza's in order: " + order.getPizzaCount() + "\r\n");

        System.out.println("********UPDATE PIZZA********");
        order.updatePizza(pizza1,
                 new Pizza(PizzaSize.SMALL, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.EXTRA_CHEESE, PizzaTopping.CHILLI));
        System.out.println(order.getInvoice());
        System.out.println("Total cost: " + order.getTotalCost() + "\r\n");
        System.out.println("Pizza's in order: " + order.getPizzaCount() + "\r\n");

    }
}
