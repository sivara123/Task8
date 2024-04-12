package Task12.com.example.hr;

public class employee {

    String name;
    int id;
    double salary;

    public employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void printname(){
        System.out.print("The Name of the Employee ");
        System.out.println(name);
    }
    public void printid(){
        System.out.print("The ID of the Employee ");
        System.out.println(id);
    }
    public void printsalary(){
        System.out.print("The Salary of the Employee ");
        System.out.println(salary);
    }

    public static void main(String[] args) {
        
        employee em = new employee("Siva", 1233456, 50000);
        em.printid();
        em.printname();
        em.printsalary();
    }

}
