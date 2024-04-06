package Guvi;

public class test1 {

   
    public void add(int a,int b){
        System.out.println("Addition "+(a + b));
    }

    public void add(int a, int b, int c){
        System.out.println("Add "+(a+b+c));
    }

    public static void main(String[] args) {
        test1 ts = new test1();
        ts.add(4, 5);
        ts.add(5, 5, 5);

    }

    
}
