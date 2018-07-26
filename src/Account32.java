public class Account32 {
    public static void main(String[] args)
    {
        Account MattsAccount = new Account("MattsAccount", 1000.00);
        MattsAccount.withdrawal(100);
        System.out.println(MattsAccount);
        Account MyAccount = new Account("MyAccount", 0.00);
        MyAccount.deposit(100);
        System.out.println(MyAccount);

    }
}
