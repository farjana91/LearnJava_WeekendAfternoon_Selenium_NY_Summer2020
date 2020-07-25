package datastructurealgorithm.Array;

public class LearnArray {



    public static void main(String[] args) {

        // Data Structure
        // data:

        String name="James";   // Jony
        String name1="Jony";
        String name2="Jack";
        String name3="syed";
        String name4="Lem Lem";
        System.out.println(name);
        System.out.println(name1);

        // Array: Arrays are used to store multiple value in a single variable instead of declaring separate variable for each value.

        String name5;
        // Declare
        // DataType [] variableName;

        String [] stName;
        // Declare and Initialize value
        // Array index start from Zero.
        String [] studentName={"waqas","samee","shuvo","mobin","resma"};
        try{
            System.out.println("Student Name : "+studentName[0]);
            System.out.println("Student Name : "+studentName[2]);
            System.out.println("Student Name : "+studentName[4]);
            System.out.println("Student Name : "+studentName[3]);
            System.out.println("Student Name : "+studentName[1+3]);
        } catch (Exception e){
            System.out.println("Array Index Out Of BoundsException");
        }
        System.out.println("Length of Array : "+studentName.length);
        System.out.println("**********************************");
        try {
            System.out.println("Student Name : " + studentName[7]);
        } catch (Exception e){
           // e.printStackTrace();
            System.out.println("Array Index Out Of BoundsException");
        }
        System.out.println("***************  To Get All the Value using For Loop *******************");
        for (int i=0; i<studentName.length; i++){
            System.out.println("Student Name : "+studentName[i]);
        }

        System.out.println("***************  To Get All the Value using For Each Loop *******************");
        // For Each Loop
        // for (type variable : arrayName){   }

        for(String st: studentName){
            System.out.println("Student Name : "+st);
        }


        System.out.println("**************** Validate Shuvo is exists or not*******************");
        for (int i=0; i<studentName.length; i++){
            if (studentName[i]== "shuvo"){
                System.out.println("Student name is Shuvo :"+studentName[i]);
            }
        }


    }





}