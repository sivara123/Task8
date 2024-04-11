package Task11;

public class AgeException extends Exception {

    AgeException(String s){
        System.out.println("Age should be greater then 18");
    }

}
