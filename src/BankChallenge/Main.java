package BankChallenge;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Afghanistan National Bank");
        bank.addBranch("Kabul");
        bank.addCustomer("Kabul", "Sarwar", 26.4);
        bank.addCustomer("Kabul", "Ahmad", 255.15);
        bank.addCustomer("Kabul", "Khalid", 404.2);

        bank.addBranch("Mazar");
        bank.addCustomer("Mazar", "Omer", 128.5);

        bank.addCustomerTransaction("Kabul", "Sarwar", 10.5);
        bank.addCustomerTransaction("Kabul", "Khalid", 30.5);
        bank.addCustomerTransaction("Kabul", "Sarwar", 20.5);

        bank.listCustomers("Kabul", true);
        bank.listCustomers("Mazar", true);

        if (!bank.addCustomer("Herat", "Timor", 650.55)) {
            System.out.println("Error Herat branch does not exist");
        }
        if (bank.addBranch("Kundoz")) {
            System.out.println("Kundoz branch successfully created");
        }

        if (!bank.addCustomerTransaction("Kabul", "Sami", 64.5)) {
            System.out.println("Customer doesn't exist in that branch");
        }

        if (!bank.addCustomer("Kabul", "Sarwar", 22.2)) {
            System.out.println("Customer Sarwar already exist");
        }
    }


}
