package org.matilde;

public class Cocinero {
    private PizzaBuil pizzaBuil;
    public void setPizzaBuil(PizzaBuil pb)
    {
        pizzaBuil = pb;
    }

    public Pizza getPizza()
    {
        return pizzaBuil.getPizza();
    }

    public void crearPizza()
    {
        pizzaBuil.crearNuevaPizza();
        pizzaBuil.ponerNombre();
        pizzaBuil.crearMasa();
        pizzaBuil.crearSalsa();
        pizzaBuil.crearIngredientes();
    }
}
