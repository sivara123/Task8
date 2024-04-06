package Task10;

public class Person {

    private String name;
    private int age;

    public Person (String name,int age){

        this.name = name;
        this.age = age;
    }

        public String name(){
            return name;
        }

        public int age(){
            return age;
        }

    public static void main(String[] args) {
        
        Person pp = new Person("siva", 25 );
        
        System.out.println("Name of the person is " +pp.name);
        System.out.println("Age of the person is " + pp.age);

       
    }
    
}
