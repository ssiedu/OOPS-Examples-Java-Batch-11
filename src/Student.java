public class Student {
    
    private static String batchTime="11.30";
    private int marks;
    private static int totalPass;
    private static int totalFail;
    
    public static void main(String args[]){
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.marks=90;    s2.marks=80;    s3.marks=30;
        
        if(s1.marks>=33){
            System.out.println("S1 Passed With "+s1.marks+" Marks");
            s1.totalPass++;
        }else{
            System.out.println("S1 Failed With "+s1.marks+" Marks");
            s1.totalFail++;
        }
        
        if(s2.marks>=33){
            System.out.println("S2 Passed With "+s2.marks+" Marks");
            s2.totalPass++;
        }else{
            System.out.println("S2 Failed With "+s2.marks+" Marks");
            s2.totalFail++;
        }
        
        if(s3.marks>=33){
            System.out.println("S3 Passed With "+s3.marks+" Marks");
            s3.totalPass++;
        }else{
            System.out.println("S3 Failed With "+s3.marks+" Marks");
            s3.totalFail++;
        }
        
        System.out.println("Overall Result : ");
        System.out.println("Total Pass : "+s3.totalPass);
        System.out.println("Total Fail : "+s3.totalFail);
    }
   
    
}
