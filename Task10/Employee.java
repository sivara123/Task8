package Task10;

public class Employee {
    private static int ID;
    private static String firstname;
    private static String lastname;
    private static int Salary;
  

    public static int getID() {
        return ID;
    }
    public void setID(int iD) {
        ID = iD;
    }
    public static String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        Employee.firstname = firstname;
    }
    public static String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        Employee.lastname = lastname;
    }
    public static int getSalary() {
        return Salary;
    }
    public void setSalary(int salary) {
        Salary = salary;
    }
    public int getannualsalary(int annualsalary){
        return Salary*12;
    }
    public int raisesalary(int percent){
        return Salary += Salary*percent/100;
    }
    

    public static void main(String[] args) {
        
        Employee em = new Employee();
        em.setID(123456);
        em.setFirstname("Siva");
        em.setLastname("M");
        em.setSalary(60000);

        System.out.println(" Before raise of salary");
        
        
        System.out.println("Name "+ getFirstname() +" lastname "+ lastname + " ID "+ ID+" Salary " + Salary );

        em.raisesalary(20);

        System.out.println(" After raise of salary");

        System.out.println("Name "+ getFirstname() +" lastname "+ lastname + " ID "+ ID+" Salary " + Salary );

    }


}
     