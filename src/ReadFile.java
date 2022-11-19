import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
        File fl=new File("power.txt");
        Scanner sc= null;
        try {
            sc = new Scanner(fl);
            while(sc.hasNextLine()){
                String txt=sc.nextLine();
                System.out.println(txt);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
