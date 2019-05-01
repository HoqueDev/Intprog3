package JavaCourseworkUP918631;

import JavaCourseworkUP918631.pizza_attributes.*;

public class TestPizza {

    public static void main(String[] args) {

        System.out.println("********RETURN INVOICES********");

        Pizza Pizza1 = new Pizza(PizzaSize.MEDIUM, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.EXTRA_CHEESE, PizzaTopping.CHILLI);
        Pizza Pizza2 = new Pizza(PizzaSize.MEDIUM, PizzaCrust.STUFFED, PizzaSauce.PESTO, PizzaTopping.OLIVES, PizzaTopping.ONION);
        Pizza Pizza3 = new Pizza(PizzaSize.SMALL, PizzaCrust.THIN, PizzaSauce.PESTO, PizzaTopping.OLIVES, PizzaTopping.OLIVES);

        System.out.println(Pizza1.getInvoice());
        System.out.println();
        System.out.println(Pizza2.getInvoice());
        System.out.println();
        System.out.println(Pizza3.getInvoice());

    }
}
