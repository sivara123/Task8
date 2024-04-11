package Task11;
import java.io.*;
public class filenf {
    
    public static void main(String[] args)  {

        String Path = "C:\\Users\\laksh\\Downloads\\Task 11 Question  - 3.pdf";
        
        File f = new File(Path);
       try {

        if (!f.exists()) {
            throw new FileNotFoundException();
        }
        else{
            System.out.println("file is avaiable");
        }
          }
           catch (Exception e) {
       System.out.println("File not found");
       System.out.println(e.getMessage());
       }
    }
}
