package string;

public class LearnString {

    // Reverse string:
    // uppercase
    // lower case
    // remove
    // trim

    public static void main(String[] args) {

        String foodName="American Pizza";
        String foodName1="Mexican Pizza";
        System.out.println("Length "+foodName.length());
        System.out.println("Concat value "+foodName.concat(foodName1));
        System.out.println(foodName.equalsIgnoreCase("american Pizza"));
        System.out.println(foodName.equals("American Pizza"));
        System.out.println(foodName.charAt(4));
        System.out.println(foodName.substring(5));
        System.out.println(foodName.substring(5,10));

        try{
            System.out.println(foodName.charAt(24));
        }catch (Exception e){
            //e.printStackTrace();
            System.out.println("String Index Out Of Bounds Exception");
        } finally {
            System.out.println(foodName.charAt(6));
        }

        System.out.println("****************************");
        System.out.println(foodName.charAt(24));
        System.out.println(foodName.substring(5));
    }

}
