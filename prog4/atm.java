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
            System.out.println("Wrong pin, Exitin............");
            return;
        }

        int amt;


    }
}