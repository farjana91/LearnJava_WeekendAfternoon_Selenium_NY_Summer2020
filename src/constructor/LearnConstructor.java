package constructor;

public class LearnConstructor {
    // Constructor Name will be same as Class Name.
    // Constructor Has no Return Type
    // Constructors are used to initialize the object.
    // Before creating Parameterize constructor we must have to create Default constructor

    // Deafult/ non Parametarized Constructor
    // Parameterized Constructor

    // AccessModifier className(){ }

    String name;
    String address;
    int age;
    double courseFee;


    public LearnConstructor(){
        // Default constructor
        System.out.println("This is Default constructor");
    }

    // Single Parameterized constructor
    public  LearnConstructor(String name){
        //this();
        this.name=name;
        System.out.println(this.name);
    }

    // Multiple Parameterized constructor
    public  LearnConstructor(String name, String address){
        //this("james");
        //this("Mr Tom");
        this.name=name;
        this.address=address;
        System.out.println(this.name+" "+this.address);

    }

    public LearnConstructor(String name,String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;
        System.out.println(this.name+" "+this.address+" "+this.age);
    }

    // Parameter signature pattern is different
    public LearnConstructor(int age,String name,String address){
        this.age=age;
        this.address=address;
        this.name=name;
        System.out.println(this.name+" "+this.address+" "+this.age);
    }
//    public LearnConstructor(int number,String price,String place){
//        this.age=number;
//        this.address=address;
//        this.name=name;
//        System.out.println(this.name+" "+this.address+" "+this.age);
//    }
   // Default constructor automatically created by jdk


    public static void main(String[] args) {
        // Constructors are used to initialize the object.
        LearnConstructor learn=new LearnConstructor("James william"); // Argument passing
        learn.age=21;
        System.out.println("James age is "+learn.age);
        LearnConstructor arib=new LearnConstructor("Elhacen Arib","Brooklyn,NY");
        arib.courseFee=5000;
        System.out.println("Arib course fee is "+arib.courseFee);

        LearnConstructor dc=new LearnConstructor();
        dc.address="Queens,NY";
        System.out.println(dc.address);
        LearnConstructor raza=new LearnConstructor("Syed Raza","Canada",35);
        raza.name="Syed";
        raza.address="Australia";
        raza.courseFee=5000.500;
        raza.age=50;
        System.out.println("Student Name is "+raza.name+" "+"Address "+raza.address+" course fee "+raza.courseFee+" Age "+raza.age);

    }


}
