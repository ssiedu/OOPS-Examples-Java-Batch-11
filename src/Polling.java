public class Polling {

    public static void countPolls(boolean...b){
        int happy=0;
        int sad=0;
        for(boolean choice:b){
            if(choice){
                happy++;
            }else{
                sad++;
            }
        }
        System.out.println("Happy : "+happy);
        System.out.println("Sad  : "+sad);
        
    }
    public static void main(String args[]){
        
        countPolls(true,true,false,true,false,true,true,true,false);
        
    }
}
