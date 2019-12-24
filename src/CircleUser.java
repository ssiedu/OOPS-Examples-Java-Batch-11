
public class CircleUser {

    public static void main(String[] args) {
        //we need to compute the area of Circle with radius 10
        //one instance of Circle class
        Circle c1=new Circle();
        c1.setRadius(10);
        c1.computeArea();
        
        //second instance of circle class (object)
        Circle c2=new Circle();
        c2.setRadius(20);
        c2.computeArea();
    }
}
