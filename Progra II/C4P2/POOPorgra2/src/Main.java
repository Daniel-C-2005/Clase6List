import PIzzas.Pizza;
import PIzzas.PizzaItaliana;
import Topping.Topping;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
            Pizza pizza = new Pizza("5 Carnes", 100, Collections.singletonList("carne, queso, tomate, cebolla, pimenton, salami"));
            PizzaItaliana pizzaItaliana = new PizzaItaliana("Hawaiana", 150, Collections.singletonList("piña, jamon, queso"), "tomate");
            System.out.println(pizza);
            System.out.println(pizzaItaliana);




    }
}