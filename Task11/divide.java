package Task11;

import java.util.Scanner;

public class divide {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number");
        int firstNo = sc.nextInt();

        System.out.println("Enter second Number");
        int seconfNo = sc.nextInt();

       try{
        int result = firstNo/seconfNo;

        System.out.println(result);
      
       } catch (ArithmeticException e) {
       System.out.println("you enter the value Zero");
       
    }
}
}
