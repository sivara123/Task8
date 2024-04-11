package Task11;

import java.util.Scanner;

public class user {

    public static void main(String[] args) {
        
        String pass = "Siva@123456";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name");
        String name = scanner.nextLine();
        System.out.println("Enter the password");
        String word = scanner.nextLine();

        try {
            if(!word.equals(pass)){
               
                throw new Exception("Enter correct password");

             } else{
                System.out.println("Your login was successfull");
              }
            
           
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
