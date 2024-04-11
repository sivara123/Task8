package Guvi;

public class accountholder {
    

    public static void main(String[] args) {

        bank bb = new bank();
      
      int mini =  bb.getminimumbalance();

      System.out.println(mini);

      bb.setminimumbalannce(300);
      mini =  bb.getminimumbalance();
      
      System.out.println(mini);

    } 
}
  