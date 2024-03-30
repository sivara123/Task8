package Guvi;

public class Student {
    public void Data(){

        Byte a = 1;
        short b = 22;
        int c = 123456789;
        long d = 123456789987654321l;
        float e = 12.34f;
        char f = 'A';
        Boolean g = true;
        String h = "Hi am Siva";

        System.out.println("Byte value is "+ a);
        System.out.println("short value is "+ b);
        System.out.println("Int value is "+ c);
        System.out.println("Long value is "+ d);
        System.out.println("float value is "+ e);
        System.out.println("char value is "+ f);
        System.out.println("Boolean value is "+g);
        System.out.println("String value is "+ h);


    }

public static void main (String[]arg){

    Student SS = new Student();
    SS.Data();

}
}
