package LearnCodingjava;
import java.util.Scanner;
public class ATMMachine {
    class ATM {
        private float balance;
        private final int PIN = 2046;
        public void checkPin() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your PIN: ");
            int enteredPin = sc.nextInt();
            if (enteredPin == PIN) {
                menu(sc);
            } else {
                System.out.println("Invalid PIN. Please try again.");
                checkPin();
            }
        }
        public void menu(Scanner sc) {
            while (true) {
                System.out.println("Enter your Choice:");
                System.out.println("1. Check A/C Balance");
                System.out.println("2. Withdraw Money");
                System.out.println("3. Deposit Money");
                System.out.println("4. Exit");

                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        withdrawMoney(sc);
                        break;
                    case 3:
                        depositMoney(sc);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM.");
                        sc.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }

        public void checkBalance() {
            System.out.println("Balance: " + balance);
        }

        public void withdrawMoney(Scanner sc) {
            System.out.print("Enter amount to withdraw: ");
            float amount = sc.nextFloat();
            if (amount > balance) {
                System.out.println("Insufficient Balance");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful. New Balance: " + balance);
            }
        }

        public void depositMoney(Scanner sc) {
            System.out.print("Enter the amount to deposit: ");
            float amount = sc.nextFloat();
            balance += amount;
            System.out.println("Deposit successful. New Balance: " + balance);
        }
    }
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine();
        ATM atm = atmMachine.new ATM();
        atm.checkPin();

    }
}
