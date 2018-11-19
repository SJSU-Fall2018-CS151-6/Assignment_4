import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintStream;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ShapeFrame extends JFrame
{
    private ShapePanel shapePanel;
    private Box buttonPanel;
    private int BUTTON_WIDTH = 30;
    private int BUTTON_HEIGHT = 30;



    public ShapeFrame()
    {
        shapePanel = new ShapePanel();
        add(shapePanel, "Center");
        buttonPanel = Box.createHorizontalBox();
        add(buttonPanel, "North");
    }


    public void addShape(CompositeShape paramCompositeShape) {

        System.out.println("Adding composite shape.");

        JButton localJButton = new JButton(new ShapeIcon(paramCompositeShape, BUTTON_WIDTH, BUTTON_HEIGHT));

    //    localJButton.addActionListener(new ShapeFrame.1(this, paramCompositeShape));
        localJButton.addActionListener(ButtonListener());

        buttonPanel.add(localJButton);
    }

    public static ActionListener ButtonListener(){
        return new ActionListener()
        {
            public void actionPerformed(ActionEvent event)
            {
                new ShapeFrame();
                //repaint();
            }
        };

    }
}
