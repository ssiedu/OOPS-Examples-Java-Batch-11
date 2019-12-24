
//blueprint of a Circle

public class Circle {
    
    //data-members
    private double radius, area;
    //methods (member-functions)
    public void setRadius(double r){
        radius=r;
    }
    public void computeArea(){
        area=3.14*radius*radius;
        System.out.println("Area of Circle : "+area);
    }
}
