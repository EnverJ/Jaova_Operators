import javax.swing.border.SoftBevelBorder;
import java.awt.*;
import java.awt.geom.Point2D;
import java.util.Objects;

public class NulReference {
    private  final String name;
    private final Color color;

    public NulReference(String name, Color color) {
        this.name = Objects.requireNonNull(name,"name cannot be null");
        this.color = Objects.requireNonNull(color,"Color Cannot be null");
    }
    public void assignDriver(String license, Point location){
        Objects.requireNonNull(license,"License cannot be bull");
        Objects.requireNonNull(location,"Locations cannot be bull");
        System.out.println("License: "+license+", "+location);
    }

    public static void main(String[] args) {
        NulReference nf= new NulReference("Toyota",Color.black);
        System.out.println("name is "+nf.name+", color is "+nf.color);
        nf.assignDriver("98790809", new Point());
    }

}
