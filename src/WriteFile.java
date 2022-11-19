import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter fw=new FileWriter("power.txt");
            fw.write("This is a java file writer class.");
            fw.close();
            System.out.println("Successfully completed writeable class");
        } catch (IOException e) {
            System.out.println("Writing failed"+ e);
        }

    }
}
