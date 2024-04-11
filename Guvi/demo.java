package Guvi;

public class demo {
    

    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        int c = a/b;
        try {
            int arr[] = null;
            System.out.println(arr[1]);
             c = a/b;

        } catch (ArithmeticException e) {
            System.err.println(" Error in math");    
        }
               catch (NullPointerException e) {
        System.err.println(" Error in arr");
    }
    
        System.out.println(c);

        System.out.println("End of program");

        


    }
}
