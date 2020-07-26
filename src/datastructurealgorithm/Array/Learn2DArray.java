package datastructurealgorithm.Array;

public class Learn2DArray {

//  2D Array: Two Dimension [] []
    public static void main(String[] args) {
        // Declare 2D Array with Length:  dataType [] [] arrayName =new dataType [NumberOfRow] [NumberOfColumn]
        String [] [] studentInfo = new String [5][6];
       //String studentInfo [] [] = new String [5][6];
        System.out.println("Length of studentInfo Array "+studentInfo.length);
        // 1st Row
        studentInfo[0][0]="stId";
        studentInfo[0][1]="firstName";
        studentInfo[0][2]="lastName";
        studentInfo[0][3]="address";
        studentInfo[0][4]="contactNumber";
        studentInfo[0][5]="SSN";
        // 2nd Row
        studentInfo[1][0]="st101";
        studentInfo[1][1]="James";
        studentInfo[1][2]="william";
        studentInfo[1][3]="queens,NY";
        studentInfo[1][4]="3345345";
        studentInfo[1][5]="56565343";
        // 3rd Row
        studentInfo[2][0]="st102";
        studentInfo[2][1]="Jack";
        studentInfo[2][2]="cohen";
        studentInfo[2][3]="Jamica,NY";
        studentInfo[2][4]="34534543";
        studentInfo[2][5]="54633565";
        // 4th Row
        studentInfo[3][0]="st103";
        studentInfo[3][1]="Rumi";
        studentInfo[3][2]="Rumi1";
        studentInfo[3][3]="queens,NY";
        studentInfo[3][4]="65723741";
        studentInfo[3][5]="52701787";

        System.out.println(studentInfo[3][1]);
        // null means empty
        System.out.println(studentInfo[4][1]);
        // Array index out of bound Exception
       // System.out.println(studentInfo[6][1]);
        // Null point Exception: During Runtime jvm is not getting the value/ missing

        System.out.println("************* Retrieve value from 2D Array **************************");
        // Retrieve value from 2D Array: 1D+1D
        for ( String stInfo[]  : studentInfo) {
            // converting 2D array to 1D
            for (String st: stInfo) {
                System.out.println("Student Information "+st);
            }
        }

        System.out.println("************ Declare and Initialize  ********************");
        String [] [] studentDetails={
                {"sl","name","phoneNumber","address"},
                {"1","Zakerin","252334545","NY,USA"},
                {"2","Jack","45345445","NJ,USA"},
                {"3","james","34523544","FL,USA"}
        };
        System.out.println(studentDetails.length);
        System.out.println(studentDetails[2][3]);


        // Retrieve value from 2D Array: 1D+1D
        for ( String stDe[]  : studentDetails) {
            // converting 2D array to 1D
            for (String st: stDe) {
                System.out.println("Student Details "+st);
            }
        }
    }



}
