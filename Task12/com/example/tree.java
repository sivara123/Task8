package Task12.com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class tree {

    public static void main(String[] args) {
        
        Map<Integer,String> employee = new TreeMap<>();

        employee.put(12345, "M.S.Dhoni");
        employee.put(12346, "Virat Kohil");
        employee.put(12347, "M.Siva");
        employee.put(12348, "Shadow");
        employee.put(12349, "kamaraj");

        System.out.println(employee);

        List<String> names = new ArrayList<>(employee.values());
        Collections.sort(names);

        System.out.println("Value in Alphabetical Order");

        for (String out : names) {
            System.out.println(out);
        }
     
       
        
        

    }
    
}
