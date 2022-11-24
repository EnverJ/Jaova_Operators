public class ConstructorMain {

    int x;
    String model;
    int year;
    public  ConstructorMain(){
        x=5;
        System.out.println("A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created. It can be used to set initial values for object attributes:\n" +
                "\n");
    }

    public  ConstructorMain(String model, int year){
        this.model=model;
        this.year=year;

    }

    public static void main(String[] args) {
        ConstructorMain main=new ConstructorMain();
        System.out.println(main.x);
        ConstructorMain main2=new ConstructorMain("Toyota",2001);
        System.out.println("car model is "+main2.model+", year is "+main2.year);
    }
}
