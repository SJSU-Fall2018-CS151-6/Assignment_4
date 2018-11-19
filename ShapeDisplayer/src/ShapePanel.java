import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;
import java.util.*;


public class ShapePanel extends JPanel
{
    private CompositeShape currentShape;
    private ArrayList<PositionedShape> shapes;
    private Point mousePoint;

    public ShapePanel()
    {
        shapes = new ArrayList();

        //addMouseListener(new ShapePanel.1(this));
        addMouseListener(new MouseAdapter() {
        public void mousePressed(MouseEvent event)
        {
            new ShapePanel();
           // mousePoint = event.getPoint();
            //for (PositionedShape s : shapes)
                {
                    repaint();
                }

            }
        });
    }

    public void paintComponent(Graphics paramGraphics)
    {
        super.paintComponent(paramGraphics);
        Graphics2D localGraphics2D = (Graphics2D)paramGraphics;
        for (int i = 0; i < shapes.size(); i++)
        {
            PositionedShape localPositionedShape = (PositionedShape)shapes.get(i);
            localPositionedShape.draw(localGraphics2D);
        }
    }

    public void setShape(CompositeShape paramCompositeShape)
    {
        currentShape = paramCompositeShape;
    }

}
