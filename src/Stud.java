
public class Stud {

        int marksObtained;
        static int totalMarks;

    public void showResult(){
        System.out.println("Total Marks : "+totalMarks);
        System.out.println("Marks Obtnd : "+marksObtained);
        System.out.println("_________________________________");
    }    
    
    public void setMarksObtained(int m){
        marksObtained=m;
    }
    public static void main(String[] args) {
        totalMarks=100;
        
        Stud s1=new Stud();
        Stud s2=new Stud();
        Stud s3=new Stud();
        
        s1.setMarksObtained(50);
        s2.setMarksObtained(60);
        s3.setMarksObtained(70);
        
        s1.showResult();
        s2.showResult();
        s3.showResult();
    }
}
