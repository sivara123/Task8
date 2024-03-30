package Guvi;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("May I know your name please");
        String name = aa.next();
        System.out.println("Kindly confirm your emp ID");
        int id = aa.nextInt();

        System.out.println("Verified your name "+ name);
        System.out.println("Verified your emp id "+ id);


    }
    
}
