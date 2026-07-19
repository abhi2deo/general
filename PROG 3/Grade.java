import java.util.*;
public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id:");
        int id = sc.nextInt();
        if(id<=0){
            System.out.println("It is not a correct student Id");
        }
        else {
            System.out.println("You may proceed");
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            if (x > 100 || x < 0 || y > 100 || y < 0 || z > 100 || z < 0) {
                System.out.println("Invalid Input All Values Must Lie Between 0-100");
            }
            else {
                int total = x + y + z;
                double avg = (double) total / 3;
                System.out.println("Your total is: " + total);
                char grade;
                if (avg >= 90) {
                    grade = 'A';
                } else if (avg >= 75) {
                    grade = 'B';
                } else if (avg >= 50) {
                    grade = 'C';
                } else {
                    grade = 'F';
                }
                System.out.println("Your grade is: " + grade);
            }
        }
        sc.close();
    }
}

