package Task12.com.example.hrtest;

import Task12.com.example.hr.employee;

public class employeetest {

    public static void main(String[] args) {
        
        employeetest emp = new employeetest();
        employee ts = new employee("Suresh", 321569, 50000);
        ts.printname();
        ts.printid();
        ts.printsalary();

    }
    
}
