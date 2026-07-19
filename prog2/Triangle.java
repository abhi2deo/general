import java.util.*;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side (x): ");
        int x = sc.nextInt();

        System.out.print("Enter second side (y): ");
        int y = sc.nextInt();

        System.out.print("Enter third side (z): ");
        int z = sc.nextInt();

        
        if (x <= 0 || y <= 0 || z <= 0 || x > 100 || y > 100 || z > 100) {
            System.out.println("Result: Invalid Input");
        }

    
        else if ((x + y <= z) || (x + z <= y) || (y + z <= x)) {
            System.out.println("Result: Not a triangle");
        }

        else if (x == y && y == z) {
            System.out.println("Result: Equilateral");
        }


        else if (x == y || y == z || x == z) {
            System.out.println("Result: Isosceles");
        }

        else {
            System.out.println("Result: Scalene");
        }

        sc.close();
        
    }
}