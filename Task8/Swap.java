package Task8;

import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
         System.out.println("Enter the Value of X");
        int A = sc.nextInt();
        System.out.println("Enter the Value of Y ");
        int B = sc.nextInt();

        System.out.println("Entered Value of A is " + A);
        System.out.println("Entered Value of B is " + B);

         A = (A + B);
         B = (A - B);
         A = (A - B);

          System.out.println("The value of A " + A);
          System.out.println("The value of B " + B);

    }
}
