
public class YourFirstAccount {

    public static void main(String[] args) {
        
        Account stesAccount = new Account("ste", 100.0);
        
        stesAccount.deposit(20.0);
        
        System.out.println(stesAccount);
        
    }
}
