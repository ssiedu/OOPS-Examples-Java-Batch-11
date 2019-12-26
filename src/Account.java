public class Account {
    private int ano;
    private String cname;
    private int balance;
    private static int totalCash;

    public void showTotalCash(){
        System.out.println("Total Cash : "+totalCash);
    }
    public void showData(){
        System.out.println("Account Number : "+ano);
        System.out.println("Customer Name  : "+cname);
        System.out.println("Balance   Rs.  : "+balance);
        System.out.println("______________________________");
    }
    public void setData(int x, String y, int z){
        ano=x;  
        cname=y;
        balance=z;
        totalCash=totalCash+z;
    }
            
}
