package oop.inheritance;

public class Test {
    public static void main(String[] args) {
        Father father=new Father();
        father.height();
        father.setGrandFatherSSN(984953409);
        System.out.println(father.getGrandFatherSSN());


        Son son=new Son();
        son.playGame();
        son.swim();

        Daughter yeti=new Daughter();
        yeti.favoriteDress="Maxi";
        System.out.println(yeti.favoriteDress);
        yeti.hobby();






    }
}
