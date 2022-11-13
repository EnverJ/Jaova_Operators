public class TernaryOperator {
    public static void main(String[] args) {
        int a=10,b=23,c=90, result;
        result
               = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);

        System.out.println("Maximum result of a, b c is" + result);

    }
}
