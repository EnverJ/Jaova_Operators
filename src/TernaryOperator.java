public class TernaryOperator {
    public static void main(String[] args) {
        int a=10,b=23,c=90, result;
        result
               = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
        System.out.println("Maximum result of a, b c is " + result);

        switch(result){
            case 10:
                System.out.println("a is the maximum number");
                break;
            case 23:
                System.out.println("B is the maximum number");
                break;
            case 90:
                System.out.println("c is the maximum number");
                break;

//                main is now named master
//
//If you have a local clone, you can update it by running the following commands.

//            git branch -m main master
//            git fetch origin
//            git branch -u origin/master master
//            git remote set-head origin -a

        }


    }
}
