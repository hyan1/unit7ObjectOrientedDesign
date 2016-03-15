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
    }


    public boolean isInside(Point2D.Double point)
    {
        if(Math.sqrt(Math.pow(getCenter().getX()-point.getX(),2)+Math.pow(getCenter().getY()-point.getY(),2))<getRadius())
        {
            return true;
        }
        else
        {
            return false;
        }
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
        Ellipse2D.Double circle = new Ellipse2D.Double(getCenter().getX()-getRadius(), getCenter().getY()-getRadius(), 2*getRadius(), 2*getRadius());
        g2.setColor(super.getColor());
        if(filled==true)
        {
            g2.fill(circle);
        }
        else
        {
            g2.draw(circle);
        }
        }
    }
    
   

