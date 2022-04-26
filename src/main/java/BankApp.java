import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome in our bank!");
        System.out.println("How much users You want to register?");
        int usersAmount = scanner.nextInt();
        Account newUsersTable[] = new Account[usersAmount]; // Dopisz zmienną user ID
        for (int i = 0; i < newUsersTable.length; i++) {
            newUsersTable[i] = new Account();
            newUsersTable[i].createAccount();
            newUsersTable[i].showAccount();
        }
        Account account = new Account();
        account.createAccount();

        int inputNumber;

        do {
            System.out.println("1. Display all account details");
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
                    System.out.println("Which account You want to use?");
                    String accountNumber = scanner.next();
                    boolean found = false;
                    for (int i = 0; i < newUsersTable.length; i++) {
                        found = newUsersTable[i].search(accountNumber);
                    }
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
