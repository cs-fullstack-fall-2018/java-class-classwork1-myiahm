public class Account31 {
    public static void main(String[] args) {
        Account FirstAccount = new Account("FirstAccount", 100.0);
        FirstAccount.deposit(20);
        System.out.println(FirstAccount.balance());
    }
}

