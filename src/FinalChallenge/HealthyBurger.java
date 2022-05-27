package FinalChallenge;

public class HealthyBurger extends Hamburger{

    private String additionHealth1Name;
    private double additionHealth1Price;

    private String additionHealth2Name;
    private double additionHealth2Price;

    public HealthyBurger(double price, String meat) {
        super("Healthy", "Brown Rye", price, meat);
    }

    public void addHealthyAddition1(String name, double price) {
        this.additionHealth1Name = name;
        this.additionHealth1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.additionHealth2Name = name;
        this.additionHealth2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (additionHealth1Name != null) {
            hamburgerPrice += additionHealth1Price;
            System.out.println("Added " + additionHealth1Name + " for an extra " + additionHealth1Price);
        }

        if (additionHealth2Name != null) {
            hamburgerPrice += additionHealth2Price;
            System.out.println("Added " + additionHealth2Name + " for an extra " + additionHealth2Price);
        }

        return hamburgerPrice;
    }

}
