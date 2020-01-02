
public class VAExample {

    public static void add(){
        System.out.println("Nothing To Add");
    }
    public static void add(double a, double b){
        System.out.println("SUM="+(a+b));
    }
    
    public static void add(String...v){
        String s="";
        for(String str:v){
            s=s+str;
        }
        System.out.println(s);
    }
    public static void add(int...v){
        int sum=0;
        for(int num:v){
            sum=sum+num;
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args){
        add();
        add(10,20);
        add(10,20,30);
        add(10,20,30,40);
        add(1,2,3,4,5,6,7,8,9,10);  
        add("ab","cd");
        add("xx","yy","zz");
 
    }
}
