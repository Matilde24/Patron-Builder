package org.matilde;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        Pizza pizza;
        Cocinero cocinero = new Cocinero();
        PizzaBuil bpb = new BarbacoaPizzaB();
        PizzaBuil cpb = new CarbonaraPizzaB();
        cocinero.setPizzaBuil(bpb);
        cocinero.crearPizza();
        pizza = cocinero.getPizza();
        System.out.println(pizza.toString());
        cocinero.setPizzaBuil(cpb);
        cocinero.crearPizza();
        pizza = cocinero.getPizza();
        System.out.println(pizza.toString());
    }
}
