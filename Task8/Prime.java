package Task8;

public class Prime {
    public static void main(String[] args) {
        int n = 17;
        int count = 0;

        for(int i = 1;i<=n;i++){
            if(n % i==0){
            count++;
            }
        }
         

        if(count==2){
            System.out.println(" Its a Prime Number");
        }
        else{
            System.out.println("Its Not a Prime");
        }

        
    }
}
