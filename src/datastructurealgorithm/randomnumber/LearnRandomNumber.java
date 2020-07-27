package datastructurealgorithm.randomnumber;

import java.util.Random;

public class LearnRandomNumber {

    public static void main(String[] args) {
        // based on Array it will generate Random number
      //double [] stId =new double[10];
       int [] stId =new int[10];

        Random random=new Random();
        for (int i=0; i<stId.length; i++){
            stId[i]=random.nextInt(30);
            //stId[i]=random.nextDouble(30);
            System.out.println(stId[i]+Math.random());
        }
       //System.out.println(Math.random());

    }

}
