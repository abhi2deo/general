import java.util.*;

public class atm{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        HashMap <Integer, accounts> account_det = new HashMap<>(); 
        accounts acc1 = new accounts(40000,1234,"Abhinav");
        accounts acc2 = new accounts(350000,7804,"Neha");
        accounts acc3 = new accounts(60000,8904,"Leto");
        account_det.put(12345,acc1);
        account_det.put(19876,acc2);
        account_det.put(89056,acc3);

        System.out.print("Enter account details: ");
        System.out.println();
        int accno = scn.nextInt();
        int pin;
        System.out.println();

        if(account_det.get(accno) == null){
            System.out.println("Account doesn't exist");
            return;
        }
        else{
            System.out.print("Enter the pin: ");
            pin = scn.nextInt();
            System.out.println();
        }

        accounts acc = account_det.get(accno);

        if (pin == acc.pin){
            System.out.println("Welcome "+acc.name);
        }
        else{
            System.out.println("Wrong pin, Exiting............");
            return;
        }

        System.out.println("Enter option : \n1.Withdraw\n2.Deposit");
        int choice = scn.nextInt();

        if (choice == 1){
            System.out.println("Enter amount to withdraw: ");
            int amt = scn.nextInt();
            if (acc.balance<amt || amt%100!=0 || acc.balance-amt<1000 || amt>20000){
                System.out.println("Error");
                return;
            }
            else{
                acc.balance = acc.balance - amt;
                System.out.println("Successful!");
                System.out.println("Available balance: "+acc.balance);
            }
        }
        else if (choice == 2){
            System.out.println("Enter deposit amount: ");
            int amt = scn.nextInt();
            if(amt <= 0){
                System.out.println("Error");
                return;
            }
            else{
                acc.balance = acc.balance + amt;
                System.out.println("Successful!");
                System.out.println("Available balance: "+acc.balance);
            }
        }
        else{
            System.out.println("Invalid choice!");
            return;
        }

    }
}