package FinalChallenge;

public class DeluxeBurger extends Hamburger{


    public DeluxeBurger() {
        super("Delux", "Sausage & Bacon", 5, "White");

        super.addHamburgerAddition1("Chips", 2.2);
        super.addHamburgerAddition2("Drink", 1.82);

    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items for the Deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items for the Deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items for the Deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items for the Deluxe burger");
    }
}
