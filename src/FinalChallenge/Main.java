package FinalChallenge;


public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic" , "sausage", 3.5, "White");
        hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Tomato", 1.5);
        hamburger.addHamburgerAddition2("Lattuce", 1.2);
        hamburger.addHamburgerAddition3("Cheese", 1.1);
        double price;
        price = hamburger.itemizeHamburger();
        System.out.println("Total price of the burger is " + price);

        System.out.println("The Second Class");
        HealthyBurger healthyBurger = new HealthyBurger( 3.0, "White");
        healthyBurger.addHamburgerAddition1("Tomato", 2);
        healthyBurger.addHealthyAddition1("Mushroom", 1);
        price = healthyBurger.itemizeHamburger();
        System.out.println("Total Price of Health Burger = " + price);

        System.out.println("Third Class is running");

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("Salt", 0.2);
        System.out.println("Total Price is = " + deluxeBurger.itemizeHamburger());
    }
}
