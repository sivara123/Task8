package Task9;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Mark");
        int Mark = sc.nextInt();

        if (Mark>100) {
          System.out.println("Invalid Input");
        }
        else if(Mark ==100){
           System.out.println("Your grade is S");
        }
        else if(Mark>=90){
            System.out.println("Your grade is A");
         }
         else if(Mark>=80){
            System.out.println("Your grade is B");
         }
         else if(Mark >=70){
            System.out.println("Your grade is C");
         }
         else if(Mark >=60){
            System.out.println("Your grade is D");
         }
         else if(Mark >=50){
            System.out.println("Your grade is E");
         }
         else{
            System.out.println("Your grade is F ");
         }
         
    }
}
