public class Main {
    public static void main(String[] args) {
        Account account = new Account("12345", "John Doe", 500.00);

        System.out.println("Initial Balance: $" + account.getBalance());

        account.deposit(200);
        account.withdraw(100);

        System.out.println("Final Balance: $" + account.getBalance());
    }
}

