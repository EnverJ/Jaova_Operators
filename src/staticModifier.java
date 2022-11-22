public class staticModifier {

    static int s=23;
    static int v=12;
    static  void myStatic(){
        System.out.println("This is static method");
    }

    public void nonStatic(){
        System.out.println("this is non-static method");
    }

    public static void main(String[] args) {

        staticModifier sm=new staticModifier();
        myStatic();
        sm.nonStatic();
        System.out.println(s+v);

    }
}
