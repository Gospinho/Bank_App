import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in our bank!");
        Account account = new Account();
        account.createAccount();

        int inputNumber;

        do {
            System.out.println("1. display account details");
            System.out.println("2. Deposit money");
            System.out.println("3. Take back Your money");
            System.out.println("4. Exit app");
            System.out.print("Enter Your choice: ");
            inputNumber = scanner.nextInt();
            switch (inputNumber) {
                case 1: {
                    account.showAccount();
                    break;
                }
                case 2: {
                    account.depositMoney();
                    break;
                }
                case 3: {
                    account.takeMoney();
                    break;
                }
                case 4: {
                    System.out.println("We are waiting for You!");
                    break;
                }
            }
        } while (inputNumber != 4);
    }
}
