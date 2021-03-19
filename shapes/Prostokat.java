import java.awt.*;

public class Prostokat extends Figure
{
    private int width;
    private int height;

    /**
     * Create a new square at default position with default color.
     */
    public Prostokat()
    {
        super(60, 50, "black", false);
        width = 20;
        height = 10;
    }
    
    public Prostokat(int Width, int Height)
    {
        super(60, 50, "red", false);
        width = Width;
        height = Height;
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     */
    public void changeSize(int newWidth, int newHeight)
    {
        erase();
        width = newWidth;
        height = newHeight;
        draw();
    }

    /*
     * Draw the square with current specifications on screen.
     */
    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                    new Rectangle(xPosition, yPosition, width, height));
            canvas.wait(10);
        }
    }
}
