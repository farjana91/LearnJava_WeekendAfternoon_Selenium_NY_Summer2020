package advance;

public class LearnEnum {
    // Enum: Enum declaration can be done outside of a class or inside a class but not inside a method
    // Enum vs Class
    // An Enum can just like a class have attributes and methods.
    // Enum constants are public,static,final. Unchangeable can not be override
    // An enum can not be used to create objects and it can not extends other classes but
    // it can implement interfaces
    // Use enums when you have values that you know are not going to change.
    // Ex: Days, Colors

    public static void main(String[] args) {
        System.out.println(Color.RED);
        Color.colorInfo();
        System.out.println(Priority.HIGH);

    }

    public enum Priority{
        HIGH,LOW,MEDIUM;
    }


}
