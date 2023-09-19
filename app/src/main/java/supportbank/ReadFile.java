package account;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import account.Account;

public class ReadFile {
    // Date,From,To,Narrative,Amount
    public void readFile() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("/home/charlottemothersole/Documents/Bootcamp/SupportBank/Transactions2014.csv"));
            //reads the first line (column headers)
            String line = reader.readLine();
            // String[] names = String {0};
            while (line != null) {
                //read the next line of data
                line = reader.readLine();
                //for each line, identify who the payment was from 
                // if the loaner is not in the array of names, add them and create the account object
                // credit their balance, and repeat process to debit the recipient
                String[] splitLine = line.split(",");
                String date = splitLine[0];
                String loaner = splitLine[1];
                String loanee = splitLine[2];
                String desc = splitLine[3];
                String amount = splitLine[4];
                Account anAccount = new Account(loaner);
                System.out.println(anAccount.balance);
                // Map.put. 
                // private Map<String, Account> accounts = new HashMap<>();
            }

            reader.close();
        
        } catch (IOException e) {

        }
    }
}