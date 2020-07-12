package advance;

public class LearnRecursion {

    // Recursion: process in which a method calls itself continuously.
    // must call itself
    // must have a base case
    // must change its state and move toward the base case

    int count=0;

    public void stInfo(){
        count++;
        if(count <=5){
        System.out.println("Student name is James");
        stInfo();
        }

    }

    public static void main(String[] args) {
        LearnRecursion obj=new LearnRecursion();
        obj.stInfo();



    }






}
