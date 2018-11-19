import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;

public class ShapeDisplayer
{
    public static void main(String[] args)
    {
        ShapeFrame frame = new ShapeFrame();


        frame.addShape(new SnowMan(0,0,20));
        frame.addShape(new Car(0,0, 50));
        // frame.addShape(create your composite shape here);

        frame.setSize(300, 400);
        frame.setTitle("Shape Displayer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}

