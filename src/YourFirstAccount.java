public class YourFirstAccount {
    public static void main(String[] args) {

        Account dalesFirstAccount = new Account("Dale", 100.0);

        dalesFirstAccount.deposit(20.0);

        System.out.println(dalesFirstAccount);
    }
}
