import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Ellipse2D.Double circle;
    
    public Circle(Point2D.Double center, double radius, Color color)
    {
       super(center, radius, color);     
       circle = new Ellipse2D.Double(center.getX(), center.getY(), radius, radius);
    }


    public boolean isInside(Point2D.Double point)
    {
        circle = new Ellipse2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        return circle.contains(point);
    }
   
    public boolean isOnBorder(Point2D.Double point)
    {
        circle = new Ellipse2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        double compare = super.getRadius() * .95;
        Ellipse2D.Double compareEllipse = new Ellipse2D.Double(super.getCenter().getX(), super.getCenter().getY(), compare, compare);
        return circle.contains(point) && !compareEllipse.contains(point);
    }
    public void draw(Graphics2D g2, boolean filled)
    {
        circle = new Ellipse2D.Double(super.getCenter().getX(), super.getCenter().getY(), super.getRadius(), super.getRadius());
        g2.setColor(super.getColor());
        g2.draw(circle);
        if(filled)
        {
            g2.fill(circle);
        }
    }
    
    

}

