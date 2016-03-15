import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;

/**
* Write a description of class Shape here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public abstract class Shape
{
    private Point2D.Double point;
    private double radius;
    private Color color;
    public Shape(Point2D.Double point, double radius, Color color)
    {
       this.point = point;
       this.radius = radius;
       this.color = color;
    }

    public Point2D.Double getCenter()
    {
        return this.point;
    }
    public double getRadius()
    {
        return this.radius;
    }
    
    public void move(double x, double y)
    {
        point = new Point2D.Double(x,y);
    }
    public void setRadius(double r)
    {
        this.radius = r;
    }
    public Color getColor()
    {
        return color;
    }
    public abstract boolean isInside(Point2D.Double point);
    public abstract boolean isOnBorder(Point2D.Double point);
    public abstract void draw(Graphics2D g2, boolean filled);
}

