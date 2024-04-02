package Task9;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        int month,days;
        float rent,d;

        Scanner sc = new Scanner(System.in);
        System.out.println("Kindly select the month and days");
         month = sc.nextInt();
         days = sc.nextInt();
         rent = sc.nextFloat();

         switch (month) {
            case 1:
            case 2:
            case 3:
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println("The rent you hve to pay is" + days*rent);
                break;
                case 4:
                case 5:
                case 6:
                case 11:
                case 12:
                System.out.println("The rent you have pay is " + String.format("%2f", (rent=rent*20)));
            default:
                break;
                
         }
         System.out.println("Invalid input");
        
    }
}
