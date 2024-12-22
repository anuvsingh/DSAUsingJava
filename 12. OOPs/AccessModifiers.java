class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

public class AccessModifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        System.out.println(myAcc.username = "Anubhav Singh");
        
        // myAcc.password = "abcde";   //Error becoz of private
        myAcc.setPassword("abcdefgh");
        // Unfortunately, you cannot directly print the password as it is private.
        // You would need a public method in the BankAccount class to access it.
    }
}