package Task11;

import java.util.Scanner;

public class age extends AgeException {
    
    

    age(String s) {
        super(s);
        //TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age");

        int age = scanner.nextInt();

        try {
            if(age<18){
                throw new AgeException("you are not eligable");     
            }else{
                System.out.println("You are eligable");
            }
        } catch (AgeException e) {
           System.out.println("Invalid Age");
        }




}


    }

