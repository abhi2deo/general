import java.util.*;

public class Bill {
    public static class  ElectricityBill{
        double charge;
         double calculateCharge(int units){
             if(units<=100){
                 charge=5.00*units;
             }
             else if(units<=300){
                 charge=7.00*units;
             }
            else{
                 charge=10.00*units;
             }
            return charge;
         }
         double calculateTax(double amount){
             return amount*0.05;
         }
         double generateTotalBill(int units){
             double amount=calculateCharge(units);
            return amount+calculateTax(amount);
         }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units=sc.nextInt();
        ElectricityBill e = new ElectricityBill();
        System.out.println("Energy Charge: "+e.calculateCharge(units));
        System.out.println("Tax amount: "+e.calculateTax(e.calculateCharge(units)));
        System.out.println("Total Bill: "+e.generateTotalBill(units));
        sc.close();
    }
}
