package datastructurealgorithm.Array;

import oop.encapsulation.Pizza;

public class Learn3DArray {
    // 3D Array: 1D+2D:  [] [] []
    // DataType [Size] [Row] [Column] arrayName=new DataType [NumberOfSize][NumberOfRow][NumberOfColumn]

    // Declare with length
    static String [] [] [] pizza =new String[4][5][5];
    String [] [] [] mobile =new String[6][7][8];

    public static void main(String[] args) {
        Learn3DArray l3d=new Learn3DArray();
        l3d.mobile[0][0][0]="sl";
        System.out.println(pizza.length);
        System.out.println("*************************");
        System.out.println( "3D length "+pizza[0].length +" 3D "+ pizza[0][1].length);
        System.out.println("3D length New "+pizza.length*pizza[0].length*pizza[0][1].length);

        pizza[0][0][0]="serial";
        pizza[0][0][1]="Pizza Type";
        pizza[0][0][2]="Price";
        pizza[0][0][3]="Qty";
        pizza[0][0][4]="Amount";

        pizza[0][1][0]="1";
        pizza[0][1][1]="Meat Lover";
        pizza[0][1][2]="30";
        pizza[0][1][3]="3";
        pizza[0][1][4]="90";

        pizza[0][2][0]="2";
        pizza[0][2][1]="fat pizza";
        pizza[0][2][2]="40";
        pizza[0][2][3]="4";
        pizza[0][2][4]="160";

        pizza[0][3][0]="3";
        pizza[0][3][1]="regular pizza";
        pizza[0][3][2]="20";
        pizza[0][3][3]="5";
        pizza[0][3][4]="100";
        // 2nd size
        pizza[1][0][0]="serial";
        pizza[1][0][1]="Pizza Type";
        pizza[1][0][2]="Price";
        pizza[1][0][3]="Qty";
        pizza[1][0][4]="Amount";

        pizza[1][1][0]="1";
        pizza[1][1][1]="Meat Lover";
        pizza[1][1][2]="30";
        pizza[1][1][3]="3";
        pizza[1][1][4]="90";

        pizza[1][2][0]="2";
        pizza[1][2][1]="fat pizza";
        pizza[1][2][2]="40";
        pizza[1][2][3]="4";
        pizza[1][2][4]="160";

        pizza[1][3][0]="3";
        pizza[1][3][1]="regular pizza";
        pizza[1][3][2]="20";
        pizza[1][3][3]="5";
        pizza[1][3][4]="100";

        System.out.println( pizza[0][2][3]);

        // Retrieve value from 3D Array
        for (String pizzaInfo[][]:pizza) {
            // Parent for each
            for (String pizzaIn[]:pizzaInfo) {
                for (String pi:pizzaIn) {
                    System.out.println("Pizza Details is "+pi);
                }
            }
        }

    }






}
