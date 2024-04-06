package Task10;

public class Account {
    private double Balance;
   

    public Account(){

        System.out.println("The Initial amount in the account is 10000");
    }

    public Account(double Initialbalance){
        this.Balance = Initialbalance;
    }

    public void deposit (int deposit){
        Balance +=  deposit;
    }
    public void withdraw (int withdraw){
        Balance -=withdraw;
    }
    
        
    public static void main(String[] args) {

        
        
        Account acc = new Account(10000);

        System.out.println("The Initial amount in the account is 10000");
       
        acc.deposit(5000);
        System.out.println("The balance after deposit " + acc.Balance);
        
        acc.withdraw(8000);
        System.out.println("The balance after withdraw " + acc.Balance);



    }

}


