
public class B {

    public static void main(String[] args) {

        System.out.println("Main Method of B");
        //we want to call main-method of B as a normal method.
        System.out.println("Calling Main of A with 0 Strings");
        A.main();
        System.out.println("Calling Main of A with 2 Strings");
        A.main("ab","cd");
        System.out.println("Calling Main of A with 5 Strings");
        A.main("ab","cd","ef","gh","ij");
        
        
    }
}
