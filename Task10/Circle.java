package Task10;


public class Circle {
    private double radius;
    String name;

    public Circle(){
         radius = 5;
    }

    public Circle(double radius,String name ){

        this.radius = radius;
        this.name = name;
    }

    public double circumference(){
        return 2*3.14*radius;

    }
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("The Circumderence is "+ c1.circumference());
        
    }
   
 
    }

