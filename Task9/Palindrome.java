package Task9;

public class Palindrome {
    public static void main(String[] args) {
        
   String s = "level";
   
   String r = "";

   for(int i=s.length()-1; i>= 0; i--){
    char ch = s.charAt(i);
    r = r + ch;
   }
if(s.equals(r)){
    System.out.println("its a palindrome");
}
  else{
    System.out.println("its not a palindrome");
  }
}
}
