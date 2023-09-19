package account;

public class Account {
//     public String getGreeting() {
//         return "Hello World!";
//     }
    //declare the static variables
    public int balance = 0;
    public String name;

    // Constructor method to initialise the 0 balance
    public Account(String accountName) {
        name = accountName;
    }

    //method to deal with the transaction 
    public void processTransaction(String date, String from, String to, String desc, int amount) {
        //debit and credit the appropriate object.balances.
    }
}

