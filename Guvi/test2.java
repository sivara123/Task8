package Guvi;

public class test2 extends test1{

    public  void add(int a,int b){
        System.out.println("Addition "+(a + b));
        super.add(45, 56);
    }

    public void add(int a, int b, int c){
        System.out.println("Add "+(a+b+c));
        super.add(45, 58, 85);
    }

    public static void main(String[] args) {
        test1 tt = new test2();
        tt.add(45, 65);
        tt.add(48, 52, 78);
        
    }

    }
    

