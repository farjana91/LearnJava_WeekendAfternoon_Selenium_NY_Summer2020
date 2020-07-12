package operators;

public class ConditionalOperator {

    // && Conditional AND: all condition must have to be true

    // || Conditional OR: if one condition is true then block of code will execute
    // pipe ||
    // false || false = false
    // false || true = true
    // true || false = true
    // true || true = true




    public static void main(String[] args) {
        int num1=55;
        int num2=40;

        if (num1==num2){
            System.out.println("Num1 and num2 is Equal");
        }
        //  all condition must have to be true
        if (num1==55 && num2==40){
            System.out.println("We love to eat pizza");
        }
        // if one condition is true then block of code will execute
        if (num1==56 || num2==40){
            System.out.println("We love to eat American Pizza");
        }




    }


}
