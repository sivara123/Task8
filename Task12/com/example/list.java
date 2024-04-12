package Task12.com.example;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        
        List<String> li = new ArrayList<>();

        li.add("Hello");
        li.add("Vanakam");
        li.add("namaiskaram");
        li.add("Nandri");
        li.add("Thank you");

        System.out.println(li);

        String[] arr = li.toArray(new String[li.size()]);    
        
        for (String out : arr) {
            System.out.println(out);
        }
    }
}
