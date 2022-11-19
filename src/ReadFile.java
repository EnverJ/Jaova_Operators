import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args) {
   ReadMe();
   PathMe();

    }

    static void ReadMe(){
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

    static void PathMe(){
        File pa=new File("power.txt");
        if(pa.exists()){
            System.out.println(pa.getName());
            System.out.println(pa.getPath());
            System.out.println(pa.getAbsoluteFile());
        }
    }
}
