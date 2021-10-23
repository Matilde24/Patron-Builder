package org.matilde;

public class BarbacoaPizzaB extends PizzaBuil {
    @Override
    public void ponerNombre() {
        pizza.setNombre("Barbacoa");
    }
    @Override
    public void crearMasa() {
        pizza.setMasa("gorda");
    }
    @Override
    public void crearSalsa() {
        pizza.setSalsa("barbacoa");
    }

    public void crearIngredientes() {
        pizza.setIngredientes("mozzarella, ternera, cebolla, maíz");
    }
}
