package Task8;

import java.util.Scanner;

public class Senior {
    
    public static void main(String[] args) {
        System.out.println("Kindly enter your age");

        Scanner as = new Scanner(System.in);
        int age = as.nextInt();

        if (age>=60) {
            System.out.println("You are a Senior Citizen");  
        }
        else{
            System.out.println("You are Not a Senior Citizen");
        }
    }
}
