import java.util.Scanner;

public class Account {

    private String name;
    private String surname;
    private String accNumber;
    private long balance;

    Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public void createAccount() {
        System.out.print("Enter Your name: ");
        name = scanner.next();

        System.out.print("Enter Your surname: ");
        surname = scanner.next();

        System.out.print("Enter Your account number: ");
        accNumber = scanner.next();

        System.out.print("Enter Your balance: ");
        balance = scanner.nextLong();
    }

    public void showAccount() {
        System.out.println("Account owner: " + name + " " + surname);
        System.out.println("Account number: " + accNumber);
        System.out.println("Balance: " + balance);
    }

    public void depositMoney() {
        System.out.print("How much You want to deposit?: ");
        long amount = scanner.nextLong();
        balance = balance + amount;
        System.out.println("Your current balance is: " + balance + " PLN.");
    }

    public void takeMoney() {
        System.out.print("How much You want to take?: ");
        long amount = scanner.nextLong();

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("Your current amount is: " + balance);
        } else {
            System.out.println("Your current balance is less than " + amount + " PLN. You have: " + balance + " PLN.");
        }
    }
}
