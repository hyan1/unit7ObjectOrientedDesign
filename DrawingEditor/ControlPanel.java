import java.awt.*;
import javax.swing.*;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    private JButton colorButton;
    private JButton circleButtor;
    private JButton squareButton;
    private Color newColor;
    private JPanel squareColor;
    private DrawingPanel canvas;

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
        this.colorButton = new JButton("Color");
        this.add(this.colorButton);
        newColor = canvas.getColor();
        
        this.circleButton = new JButton("Circle");
        this.add(this.circleButton);
       
        this.squareButton = new JButton("Square");
        this.add(this.squareButton);
        
        squareColor = new JPanel();
        newColor = canvas.getColor();
        squareColor.setBackground(newColor);
        squareColor.setPreferredSize(new Dimension(10, 10));
        this.add(squareColor);
        
        ClickListener listener = new ClickListener();
        this.colorButton.addActionListener(listener); 
        this.circleButton.addActionListener(listener); //you need this to register the listener
        this.squareButton.addActionListener(listener); 
        this.canvas = canvas;                
    }
    
    public class ClickListener implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getActionCommand().equals("Pick Color"))
            {
                canvas.pickColor();
                System.out.println("Select Color");
                newColor = canvas.getColor();
                squareColor.setBackground(newColor);
            }
            else if(event.getActionCommand().equals("Circle"))
            {
                canvas.addCircle();
            }
            else if(event.getActionCommand().equals("Square"))
            {
                canvas.addSquare();
            }
            canvas.repaint();
        }
    }
}
