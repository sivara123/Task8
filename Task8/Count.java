package Task8;

public class Count {
    
public static void main(String[] args) {
    int num = 764354675;

    int count = 0;

    while (num>0) {

        num = num/10;

        count++;
        
    }
    System.out.println("The Count of the number is " + count);
}
}
