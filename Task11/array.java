package Task11;

public class array {
    public static void main(String[] args) {

        int a[] = {10,20,30,40,50};

        try {
        a[6] = 60;
        System.out.print("The value of a");
        System.out.println(a[6]);

        } catch (ArrayIndexOutOfBoundsException e) {
           
            System.err.println(e.getMessage());
        }
       
       

        try {
            String name = "Dhoni";
            
            char ch = name.charAt(6);

            System.out.println(ch);
    
            } catch (StringIndexOutOfBoundsException e) {
               
                System.err.println(e.getMessage());
            }

    }
    
}
