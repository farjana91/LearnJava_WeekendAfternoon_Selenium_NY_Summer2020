package datastructurealgorithm.arraylist;

import java.util.ArrayList;
import java.util.List;

public class LearnArrayList {
    // List: is a interface
    // List has the ability to take unlimited data length
    // ArrayList is dynamic so do not need to declare size or length of the array.

    // Declare ArrayList
    static ArrayList<String> stName=new ArrayList<String>(); // 16*6
   // static ArrayList<String> stName1=new ArrayList<>();

    public static void main(String[] args) {
        String [] studentAddress = new String[5]; // Length : 16*600=
        studentAddress[0]="James";
        studentAddress[1]="James";
        studentAddress[2]="James";
        studentAddress[3]="James";
        studentAddress[4]="James";

        // Assign value in ArrayList
        stName.add("Rabah");// 0
        stName.add("Yetinayet");// 1
        stName.add("Davis");// 2
        stName.add("Taqiyy");// 3
        stName.add("Shakir"); // 4 //3
        stName.add("Raza"); //5 //4
        stName.add("Raza"); //6 //5

        System.out.println("******* before Remove value from ArrayList *********");
        for (String st:stName) {
            System.out.println("Student Name : "+st);
        }

        System.out.println("******* After Remove value from ArrayList *********");
        stName.remove(3);
        for (String st:stName) {
            System.out.println("Student Name : "+st);
        }

    }


}
