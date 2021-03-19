import java.awt.*;
import java.awt.geom.*;

/**
 * A circle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.0  (15 July 2000)
 */

public class Circle extends Figure
{
    private int diameter;

    /**
     * Create a new circle at default position with default color.
     */
    public Circle()
    {
        super(20, 60, "blue", false);
        diameter = 30;
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newDiameter)
    {
        erase();
        diameter = newDiameter;
        draw();
    }

    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Ellipse2D.Double(xPosition, yPosition, 
                    diameter, diameter));
            canvas.wait(10);
        }
    }

}
