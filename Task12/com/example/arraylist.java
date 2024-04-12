package Task12.com.example;

import java.util.ArrayList;

public class arraylist {

    public static void main(String[] args) {
        
        ArrayList<String> list = new ArrayList<>();
          
        list.add("Siva");
        list.add("vishnu");
        list.add("Tamil");
        list.add("Note");
        list.add("Book");
        
        list.removeAll(list);

        for(int i = 0; i<list.size();i++){
            System.out.println(list.get(i));

        }
  
    }
}
