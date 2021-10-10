package com.company;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price) {
        addHamburgerAddition1(name, price);
    }

    public void addHealthyAddition2(String name, double price) {
        addHamburgerAddition1(name, price);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
