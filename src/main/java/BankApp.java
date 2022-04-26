import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account account = new Account();

        account.createAccount();
        System.out.println("Welcome in our bank!");
        System.out.println("1. display account details");
        System.out.println("2. Deposit money");
        System.out.println("3. Take back Your money");
        System.out.println("4. Exit app");
        System.out.print("Enter Your choice: ");

        int inputNumber = scanner.nextInt();

        switch (inputNumber) {
            case 1: {
                account.showAccount();
            }
            case 2: {
                account.depositMoney();
            }
            case 3: {
                account.takeMoney();
            }
            case 4: {
                System.out.println("We are waiting for You!");
            }
        }

    }
}
