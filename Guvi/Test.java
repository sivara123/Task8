package Guvi;



public class Test {
    
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;

        boolean Equal = false;
        boolean NotEqual = false;
        boolean Egreaterequal = false;
        boolean lesserEqual = false;

        if (a == b) {
             Equal = true;
        }
        System.out.println(Equal);

        if (a!=b) {
            NotEqual = true;
        }
        System.out.println(NotEqual);
        if (a>=b) {
            Egreaterequal = true;
        }
        System.out.println(Egreaterequal);
        if (a<=b) {
            lesserEqual = true;
        }
        System.out.println(lesserEqual);
    }
}
