public class Account {
    private int ano;
    private String cname;
    private int balance;
    private static int totalCash;

    //a method to compute avg balance of three accounts
    public static void showAvg(Account tmp1, Account tmp2, Account tmp3){
       System.out.println("Avg of 3 : "+(tmp1.balance+tmp2.balance+tmp3.balance)/3);
    }
    
    //a method to compute avg balance of two accounts
    public static void showAvg(Account tmp1, Account tmp2){
        System.out.println("Avg of 2 : "+(tmp1.balance+tmp2.balance)/2);
    }
    
    public static void showBalance(Account tmp){
        //to display the balance of an account.
        System.out.println("Balance : "+tmp.balance);
    }


    public static void showTotalCash(){
        System.out.println("Total Cash : "+totalCash);
    }
    public void showData(){
        System.out.println("Account Number : "+ano);
        System.out.println("Customer Name  : "+cname);
        System.out.println("Balance   Rs.  : "+balance);
    }
    public void setData(int x, String y, int z){
        ano=x;  
        cname=y;
        balance=z;
        totalCash=totalCash+z;
    }
            
}
