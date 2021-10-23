package org.matilde;

public class CarbonaraPizzaB extends PizzaBuil {
    @Override
    public void ponerNombre() {
        pizza.setNombre("Carbonara");
    }
    @Override
    public void crearMasa() {
        pizza.setMasa("fina");
    }
    @Override
    public void crearSalsa() {
        pizza.setSalsa("carbonara");
    }
    @Override
    public void crearIngredientes() {
        pizza.setIngredientes("mozzarella, bacon, cebolla");
    }
}
