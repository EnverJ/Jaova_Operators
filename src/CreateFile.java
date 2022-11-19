import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        // to create a new file in ac specific directory
        //File myObj = new File("C:\\Users\\MyName\\filename.txt");
        File cf=new File("power.txt");
        try {
            if(cf.createNewFile()){
                System.out.println("new file is created");

            }
            else{
                System.out.println("New File existed.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
