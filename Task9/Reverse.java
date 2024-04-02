package Task9;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value  ");
         String n = sc.nextLine();

        String r = "";

        for(int i = n.length()-1; i >=0 ;i-- ) {
            char ch = n.charAt(i);

            r = r + ch;
        }
        System.out.println(" The reverse String is " + r);
    }
    
}
