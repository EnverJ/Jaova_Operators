public class finalModifier {
// If you don't want the ability to override existing attribute values, declare attributes as final
    final int x=10;
    final double p=3.14;

    public static void main(String[] args) {
        finalModifier fm=new finalModifier();
   //     fm.x=20;  // will generate an error: cannot assign a value to a final variable
   //     fm.p=4.5; // // will generate an error: cannot assign a value to a final variable
        System.out.println(fm.x* fm.p);

    }
}
