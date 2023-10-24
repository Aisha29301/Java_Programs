import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM {
    private BankAccount userAccount;

    public ATM(BankAccount account) {
        userAccount = account;
    }

    public void displayMenu() {
        System.out.println("ATM Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
    }

    public void executeTransaction() {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            displayMenu();
            System.out.print("Select an option (1-4): ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Balance: $" + userAccount.getBalance());
                    break;
                case 2:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    userAccount.deposit(depositAmount);
                    System.out.println("Deposited: $" + depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (userAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawn: $" + withdrawAmount);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM.");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please select 1-4.");
            }
        }

        scanner.close();
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Initial balance
        ATM atm = new ATM(userAccount);
        atm.executeTransaction();
    }
}
