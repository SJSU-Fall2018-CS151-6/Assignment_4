import java.awt.geom.*;

public class Car extends CompositeShape
{
    private int width;

    public Car(int paramInt1, int paramInt2, int paramInt3)
    {
        super(paramInt1, paramInt2);
        width = paramInt3;

        Rectangle2D.Double localDouble = new Rectangle2D.Double(getX(), getY() + paramInt3 / 6, paramInt3 - 1, paramInt3 / 6);


        Ellipse2D.Double localDouble1 = new Ellipse2D.Double(getX() + paramInt3 / 6, getY() + paramInt3 / 3, paramInt3 / 6, paramInt3 / 6);


        Ellipse2D.Double localDouble2 = new Ellipse2D.Double(getX() + paramInt3 * 2 / 3, getY() + paramInt3 / 3, paramInt3 / 6, paramInt3 / 6);




        Point2D.Double localDouble3 = new Point2D.Double(getX() + paramInt3 / 6, getY() + paramInt3 / 6);


        Point2D.Double localDouble4 = new Point2D.Double(getX() + paramInt3 / 3, getY());


        Point2D.Double localDouble5 = new Point2D.Double(getX() + paramInt3 * 2 / 3, getY());


        Point2D.Double localDouble6 = new Point2D.Double(getX() + paramInt3 * 5 / 6, getY() + paramInt3 / 6);

        Line2D.Double localDouble7 = new Line2D.Double(localDouble3, localDouble4);

        Line2D.Double localDouble8 = new Line2D.Double(localDouble4, localDouble5);

        Line2D.Double localDouble9 = new Line2D.Double(localDouble5, localDouble6);


        add(localDouble);
        add(localDouble1);
        add(localDouble2);
        add(localDouble7);
        add(localDouble8);
        add(localDouble9);
    }
}

