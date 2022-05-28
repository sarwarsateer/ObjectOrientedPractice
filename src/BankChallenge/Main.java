package BankChallenge;

public class Main {
    public static void main(String[] args) {
    Bank bank = new Bank("Afghanistan National Bank");
    bank.addBrach("Kabul");
    bank.addCustomer("Kabul", "Sarwar", 26.4);
    bank.addCustomer("Kabul", "Ahmad", 255.15);
    bank.addCustomer("Kabul", "Khalid", 404.2);

    bank.addBrach("Mazar");
    bank.addCustomer("Mazar", "Omer", 128.5);

    bank.addCustomerTransaction("Kabul", "Sarwar", 10.5);
    bank.addCustomerTransaction("Kabul", "Khalid", 30.5);
    bank.addCustomerTransaction("Kabul", "Sarwar", 20.5);

    bank.listCustomers("Kabul", false);
    }

}
